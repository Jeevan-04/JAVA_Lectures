package _10AUG;

class Calculate{
    Calculate(int a, int b)
    {
        System.out.println("Area of Rectanlge is: "+(a*b));
    }
    Calculate(int a)
    {
        System.out.println("Area of Square is: "+(a*a));
    }
    Calculate(double a)
    {
        System.out.println("Area of Circle is: "+((Math.PI)*a*a));
    }
}
public class Geometry {
    public static void main(String[] args) {
        new Calculate(5);
        new Calculate(5,3);
        new Calculate(2.5);
    }
}
