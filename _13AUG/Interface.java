package _13AUG;
interface Bank
{
    float rateOfInterest();
}
class SBI implements Bank
{
    public float rateOfInterest(){return 9.15f;}
}
class PNB implements Bank
{
    public float rateOfInterest(){return 9.7f;}
}
public class Interface {
    public static void main(String[] args) {
        Bank b=new SBI();
        System.out.println("ROI:"+b.rateOfInterest());
    }
}
