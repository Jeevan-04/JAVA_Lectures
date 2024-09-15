package _12SEPT;
import java.io.*;
class Dog implements Serializable{
    String name;
    String breed;
    public Dog (String name, String breed)
    {
        this.name=name;
        this.breed=breed;
    }
    public String toString(){
        return "Dog Name: "+name+" & breed: "+breed;
    }
}
public class DogSerialization {
    public static void main(String[] args) {
        Dog d=new Dog("Sheero", "Spitz");
        try(ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("/Users/apple/Desktop/JAVA/_12SEPT/DogBreed.ser")))
        {
            os.writeObject(d);
        }catch(IOException e){
            System.out.println("Exception in Serialization");
        }

        try(ObjectInputStream os=new ObjectInputStream(new FileInputStream("/Users/apple/Desktop/JAVA/_12SEPT/DogBreed.ser")))
        {
            Dog d2=(Dog)os.readObject();
            System.out.println(d2);
        }catch(IOException e){
            System.out.println("Exception in Deserialization "+e);
        }catch(ClassNotFoundException e) {
            System.out.println("Exception in deserialization "+ e);
        }
    }
}
