class Market {
    String name;
    Long noOfEmployees;
    String location;
    Long salaryOfEachEmployee;
    int noOfCustomers;

    public Market(String name, Long noOfEmployees, String location, Long salaryOfEachEmployee, int noOfCustomers){
        this.name = name;
        this.noOfEmployees = noOfEmployees;
        this.location = location;
        this.salaryOfEachEmployee = salaryOfEachEmployee;
        this.noOfCustomers = noOfCustomers;
    }

    void display(){
        System.out.println("Supermarket name: " + name);
        System.out.println("Number of employees: " + noOfEmployees);
        System.out.println("Location: " + location);
        System.out.println("Salary of each employee: " + salaryOfEachEmployee);
        System.out.println("Number of customers: " + noOfCustomers);
    }
}
public class Super_Market {
    public static void main(String[] args){
        Market object1 = new Market("Imtiaz", 100L, "Karachi", 5000L, 1000);
        object1.display();

        Market object2 = new Market("Bin Hashim", 50L, "China", 500L, 800);
        object2.display();
    }    

}
