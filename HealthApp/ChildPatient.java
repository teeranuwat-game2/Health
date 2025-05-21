public class ChildPatient extends Patient {
    private final String guardianName;

    public ChildPatient(String name, int age, double weight, String guardianName) {
        super(name, age, weight);
        this.guardianName = guardianName;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Guardian Name: " + guardianName);
    }

    @Override
    public void performCheckup() {
        System.out.println("Performing checkup for child patient: " + name + ", Age: " + age + ", Weight: " + weight + ", Guardian: " + guardianName + "\n" + "======================\n");
        // Additional logic for child checkup
    }
}