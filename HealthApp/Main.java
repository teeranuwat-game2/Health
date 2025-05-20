public class Main  {
    public static void main(String[] args) {
        System.out.println("Welcome to the Health App!");

        ChildPatient childPatient = new ChildPatient("Jane Doe", 10, 30.0, "Mary Doe");
        childPatient.displayInfo();

        childPatient.performCheckup();
        System.out.println("Checkup completed for child patient: " + childPatient.name);
        
    }
}