class Class_Syntax{
    // Fields
    int labs;
    int Noofclasses;
    // Method
    void displayinfo(){
        System.out.print("Lab"+labs+"Classes"+Noofclasses);
    }
}
public class Electrical_Department {
    public static void main(String[] args){
        
        Class_Syntax object = new Class_Syntax();

        object.Noofclasses = 15;
        object.labs = 4;
        object.displayinfo();
    }
}
