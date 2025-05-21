public class Patient implements CheckupService {
    protected String name;
    protected int age;
    protected double weight;

    public Patient(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void displayInfo() {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + age);
        System.out.println("Patient Weight: " + weight);
    }

    @Override
    public void performCheckup() {
        System.out.println("Performing checkup for patient: " + name + ", Age: " + age + ", Weight: " + weight);
        // Additional logic for checkup
    }

}