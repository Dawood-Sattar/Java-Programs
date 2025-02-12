class PowerBank{
    {/* Class Properties */}
    String make;
    String model;
    double watt;

    {/* Class Method*/}
    void displayinfo(){
    System.out.println("Make : "+make+" , Model : "+ model+" , Watt : "+watt);
    }
}
public class Power_Bank{
    public static void main(String[] args){
        PowerBank obj = new PowerBank();

        obj.make= "Sovo";
        obj.model="PD103";
        obj.watt=22.5;

        obj.displayinfo();
    }
}
