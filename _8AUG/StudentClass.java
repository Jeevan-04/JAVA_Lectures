package _8AUG;

class Data{
    int roll;
    String name;
    int id;
    double marks1, marks2 ;

    void studentData(int id, String n, double m1, double m2, int r){
        this.roll = r;
        this.name = n;
        this.id = id;
        this.marks1=m1;
        this.marks2=m2;
    }
    void identity(){
        System.out.println("Name: "+name);
        System.out.println("Roll no: "+roll);
        System.out.println("id: "+id);
        System.out.println("Marks 1: "+marks1);
        System.out.println("Marks 2: "+marks2);
    }
    void percentage(){
        double avg = (marks1 + marks2) / 2;
        System.out.println("PERCENTAGE:  "+avg);
    }
}

public class StudentClass {
    public static void main(String[] args) {
        Data S1=new Data();

        S1.studentData(1001,"Jeevan",35,45,15);
        S1.identity();
        S1.percentage();
    }
}
