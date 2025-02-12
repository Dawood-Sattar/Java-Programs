class NED {
    String university = "NED";
    String location = "Karachi";
    int noOfDepart;

    NED(int departments) {
        this.noOfDepart = departments;
    }

    void displayinfo() {
        System.out.println("University: " + university + ", Location: " + location + ", Departments: " + noOfDepart); // Corrected concatenation
    }
}

public class NED_Main {
    public static void main(String[] args) {
        NED x = new NED(15);
        x.displayinfo();

    }
}