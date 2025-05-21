public class Main  {
    public static void main(String[] args) {

        System.out.println("\n Welcome to the Health App! \n");
        System.err.println("This is some Child Patient information.");
        System.out.println("====================================\n");
        // Create a new patient
        ChildPatient childPatient1 = new ChildPatient("John Doe", 7, 25.0, "Jane Doe");
        childPatient1.displayInfo();
        childPatient1.performCheckup();

        ChildPatient childPatient2 = new ChildPatient("Jane Doe", 10, 30.0, "Mary Doe");
        childPatient2.displayInfo();

        childPatient2.performCheckup();
        
    }
}