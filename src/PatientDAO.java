import java.util.List;

public interface PatientDAO {
    //CRUD Operation
    public List<Patient> getAllPatient();
    public void addPatient(Patient newPatient);
    public void updatePatient(Patient patient);
    public void deletePatient(int id);
    public Patient findPatient (int id);

}
