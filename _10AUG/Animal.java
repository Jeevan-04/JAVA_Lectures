package _10AUG;

class AnimalData {
    private boolean vegetarian;
    private String food;
    private int numOfLegs;
    AnimalData() {
        this.vegetarian = true;
        this.food = "Grass";
        this.numOfLegs = 2;
    }
    AnimalData(boolean vegetarian, String food, int numOfLegs) {
        this.vegetarian = vegetarian;
        this.food = food;
        this.numOfLegs = numOfLegs;
    }
    boolean isVegetarian() {
        return vegetarian;
    }
    void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }
    String getFood() {
        return food;
    }
    void setFood(String food) {
        this.food = food;
    }
    int getNumOfLegs() {
        return numOfLegs;
    }
    void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }
    @Override
    public String toString() {
        return "Animal [Vegetarian=" + vegetarian + ", Food=" + food + ", NumOfLegs=" + numOfLegs + "]";
    }
}

class Cat extends AnimalData {
    private String color;
    Cat() {
        super();
        this.color = "unknown";
    }
    Cat(boolean vegetarian, String food, int numOfLegs, String color) {
        super(vegetarian, food, numOfLegs);
        this.color = color;
    }
    String getColor() {
        return color;
    }
    void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Cat [Color=" + color + ", " + super.toString() + "]";
    }
}

class Cow extends AnimalData {
    private String breed;
    Cow() {
        super();
        this.breed = "unknown";
    }
    Cow(boolean vegetarian, String food, int numOfLegs, String breed) {
        super(vegetarian, food, numOfLegs);
        this.breed = breed;
    }
    String getBreed() {
        return breed;
    }
    void setBreed(String breed) {
        this.breed = breed;
    }
    @Override
    public String toString() {
        return "Cow [Breed=" + breed + ", " + super.toString() + "]";
    }
}

public class Animal {
    public static void main(String[] args) {
        Cat cat = new Cat(false, "Fish", 4, "Black");
        System.out.println(cat);

        Cow cow = new Cow(true, "Grass", 4, "Holstein");
        System.out.println(cow);
    }
}
