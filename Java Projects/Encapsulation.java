public class Encapsulation{
    // private variables to encapsulate the data
    private String name;
    private int age;

    // public getter method for name
    public String getName() {
        return name;
    }

    // public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // public getter method for age
    public int getAge() {
        return age;
    }

    // public setter method for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    public static void main(String[] args) {
        Encapsulation example = new Encapsulation();
        example.setName("John Doe");
        example.setAge(30);

        System.out.println("Name: " + example.getName());
        System.out.println("Age: " + example.getAge());
    }
}