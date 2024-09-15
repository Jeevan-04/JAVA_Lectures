package _12SEPT;
import java.io.*;
class Student implements Serializable{
    int rollno;
    String name;
    public Student (int rollno, String name){
        this.rollno= rollno;
        this.name= name;
    }
    public String toString(){
        return "rollno "+rollno+" name"+name;
    }
}

public class SerializationEX1 {
    public static void main(String[] args){
        Student s= new Student(111,"AAA");
        try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("/Users/apple/Desktop/JAVA/_12SEPT/SerialStud.ser")))
        {
            os.writeObject(s);
        }catch(IOException e){
            System.out.println("Exception in Serialization");
        }

        try(ObjectInputStream os=new ObjectInputStream(new FileInputStream("/Users/apple/Desktop/JAVA/_12SEPT/SerialStud.ser")))
        {
            Student s2=(Student)os.readObject();
            System.out.println(s2);
        }catch(IOException e){
            System.out.println("Exception in Deserialization "+e);
        }catch(ClassNotFoundException e) {
            System.out.println("Exception in deserialization "+ e);
        }

    }
}
