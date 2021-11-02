public class Dog extends Pet {
    // Instance variable(s)
    private String name;
    private int age;


    // Constructors
    public Dog(String a, int b) {
        super(a,b);
    }


    // makeNoise() method
    public void makeNoise() {
        System.out.println("Woof");
    }

    // toString method
    public String toString() {
        String str = this.getAge() + ", " + this.getName();
        return str;}

    // Getter
public int getAge(){
    return this.age;
        }
public String getName(){
        return this.name;
}

    // Setter
    public void setDog(String name, int age) {
        this.name = name;
        this.age=age;
    }
}