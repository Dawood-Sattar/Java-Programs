class Encapsulation_Example {
    
    private String name;
    private int age;

    public void setName(String Name) {
        this.name = Name;
    }

    public void setAge(int Age) {
        this.age = Age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getinfo() {
        return ("My name is " + name + " and my age is " + age);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Encapsulation_Example class_object = new Encapsulation_Example();

        class_object.setAge(22);
        class_object.setName("Dawood");

        System.out.println(class_object.getinfo());
    }
}