package _13SEPT;
class NewThread1 extends Thread{
    NewThread1(){
        super("Demo thread");
    }
    public void run(){
        System.out.println("Child thread "+Thread.currentThread());
    }
}
public class Ex2ThreadCreateThruExtends1 {
    public static void main(String[] args) {
        NewThread1 nt=new NewThread1();
        nt.start();
        System.out.println("Main thread "+Thread.currentThread());
    }
}
