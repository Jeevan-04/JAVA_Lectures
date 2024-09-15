package _13SEPT;

class Class1EX1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("1. Hello: " + (i + 1));
            try {
                Thread.sleep(500); // Sleep to simulate time delay
            } catch (InterruptedException e) {
                System.out.println("Class1 thread interrupted");
            }
        }
    }
}

class Class2EX1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("2. Hii: " + (i + 1));
            try {
                Thread.sleep(500); // Sleep to simulate time delay
            } catch (InterruptedException e) {
                System.out.println("Class2 thread interrupted");
            }
        }
    }
}

class Class3EX1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("3. Bye: " + (i + 1));
            try {
                Thread.sleep(500); // Sleep to simulate time delay
            } catch (InterruptedException e) {
                System.out.println("Class3 thread interrupted");
            }
        }
    }
}

public class MultiThreadEx1 {
    public static void main(String[] args) {
        Class1EX1 obj1 = new Class1EX1();
        Class2EX1 obj2 = new Class2EX1();
        Class3EX1 obj3 = new Class3EX1();

        obj1.start();
        obj2.start();
        obj3.start();
    }
}