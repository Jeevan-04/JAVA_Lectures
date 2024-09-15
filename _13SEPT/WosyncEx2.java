package _13SEPT;
class CounterEX2{
    int count;
    public void increment(){
        count++;
    }
}
class Class1WO implements Runnable{
    CounterEX2 c;
    Class1WO(CounterEX2 c){
        this.c=c;
    }
    public void run(){
        for(int i=0;i<1000;i++)
            c.increment();
    }
}
class Class2WO implements Runnable{
    CounterEX2 c;
    Class2WO(CounterEX2 c){
        this.c=c;
    }
    public void run()
    {
        for(int i=0;i<1000;i++)
            c.increment();
    }
}
public class WosyncEx2 {
    public static void main(String[] args) {
        CounterEX2 c=new CounterEX2();
        Class1WO obj1 = new Class1WO(c);
        Class2WO obj2 = new Class2WO(c);
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        System.out.println(c.count);
    }
}
