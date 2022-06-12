package learningWithExamples.multireading.volotile;

import learningWithExamples.multireading.threadlesson.ColorScheme;

public class VolotileMain {

    private static volatile int counter; // Reader doesn't work without volatile

    public static void main(String[] args) {
        new SimpleWriter().start();
        new SimpleReader().start();
    }

    private static class SimpleWriter extends Thread{

        @Override
        public void run() {
            int localCounter = counter;
            for (int i = 0; i < 10; i++) {
                System.out.println(ColorScheme.GREEN + "Writer increments counter " + (localCounter + 1));
                counter = ++localCounter;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class SimpleReader extends Thread{

        @Override
        public void run() {
            int localCounter = counter;
            while (localCounter < 10){
                if(localCounter != counter) {
                    System.out.println(ColorScheme.RED + "Reader reads counter " + counter);
                    localCounter = counter;
                }
        }
    }
    }

}
