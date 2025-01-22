import java.util.ArrayList;
import java.util.List;

class Patient {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Doctor {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    public void consult(Patient patient) {
        System.out.println("Doctor " + name + " is consulting Patient " + patient.getName());
    }
}

class Hospital {
    private String name;

    public Hospital(String name) {
        this.name = name;
    }
}

public class HospitalDemo {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor docAnkit = new Doctor("Dr. Ankit");
        Patient patAnand = new Patient("Anand Soni");

        docAnkit.consult(patAnand);
    }
}
