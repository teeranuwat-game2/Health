public abstract  class Patient implements CheckupService {
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

}