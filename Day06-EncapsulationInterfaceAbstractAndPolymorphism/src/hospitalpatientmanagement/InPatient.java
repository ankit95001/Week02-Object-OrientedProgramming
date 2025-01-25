package hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

class InPatient extends Patient implements MedicalRecord {
    private List<String> records = new ArrayList<>();
    private double dailyRate;
    private int daysAdmitted;

    public InPatient(String patientId, String name, int age, double dailyRate, int daysAdmitted) {
        super(patientId, name, age);
        this.dailyRate = dailyRate;
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() {
        return dailyRate * daysAdmitted;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public List<String> viewRecords() {
        return new ArrayList<>(records);
    }
}
