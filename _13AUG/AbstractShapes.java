package _13AUG;

import java.util.Scanner;

abstract class Figure
{
    double d1;
    double d2;
    Figure(double a,double b){
        d1= a;
        d2= b;
    }
    abstract double area();
    abstract double perimeter();
}
class Triangle extends Figure
{
    Triangle(double a, double b)
    {
        super(a, b);
    }
    double area()
    {
        return (d1*d2*0.5);
    }
    double perimeter()
    {
        return ((d1*d2)/2);
    }
}
class Rectanlge extends Figure
{
    Rectanlge(double a, double b)
    {
        super(a, b);
    }
    double area()
    {
        return (d1*d2);
    }
    double perimeter()
    {
        return ((d1*d2)*2);
    }
}
public class AbstractShapes {
    public static void main(String[] args) {
        double a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height: ");
        a=scanner.nextDouble();
        System.out.println("Enter the base: ");
        b=scanner.nextDouble();
        Figure Shape;
        Shape=new Triangle(a, b);
        System.out.println("The area of Triangle is: "+Shape.area()+ " & Perimeter of Triangle is :"+Shape.perimeter());
        Shape=new Rectanlge(a, b);
        System.out.println("The area of Rectangle is: "+Shape.area()+ " & Perimeter of Rectangle is :"+Shape.perimeter());
        scanner.close();
    }
}
