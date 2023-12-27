import java.time.LocalDate;

public class Nurse extends Personal{

    public Nurse(String name, String jobTitle, String patient, String qualification, LocalDate dateOfReceipt) {
        super(name, jobTitle, patient, qualification, dateOfReceipt);
        //TODO Auto-generated constructor stub
    }

    
    // public void WorkplacePreparation(Doctor doctor) {
    //     System.out.println(this.type + " " + this.name +" started the examination of the patient  has prepared a workplace for the" + doctor.type + " " + doctor.name);
    // }
}
