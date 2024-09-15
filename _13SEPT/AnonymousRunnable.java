package _13SEPT;
public class AnonymousRunnable {
    public static void main(String[] args) {
        Thread t1= new Thread(new Runnable(){public void run(){
            for (int i = 0; i < 5; i++) {
                System.out.println("1. Hello: " + (i + 1));
                try {
                    Thread.sleep(500); 
                } catch (InterruptedException e) {
                    System.out.println("thread 1 interrupted");
                }
            }
        }});
        Thread t2= new Thread(new Runnable(){public void run(){
            for (int i = 0; i < 5; i++) {
                System.out.println("2. Hii: " + (i + 1));
                try {
                    Thread.sleep(500); 
                } catch (InterruptedException e) {
                    System.out.println("thread 2 interrupted");
                }
            }
        }});
        Thread t3= new Thread(new Runnable(){public void run(){
            for (int i = 0; i < 5; i++) {
                System.out.println("3. Bye: " + (i + 1));
                try {
                    Thread.sleep(500); 
                } catch (InterruptedException e) {
                    System.out.println("thread 3 interrupted");
                }
            }
        }});
        t1.start();
        t2.start();
        t3.start();
    }
}
