package _20AUG;

public class Catching {
    public static void main(String[] args) {
        try{
            int a =args.length;
            System.out.println("a= "+a);
            int b = 42/a;
            int c[]= {1};
            c[42]=99;
            System.out.println(b);
        } catch(ArithmeticException e)
        {
            System.out.println("Divide by 0: "+e);
        } catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index oob: "+e);
        }
        System.out.println("After try/catch blocks");
    }
}
