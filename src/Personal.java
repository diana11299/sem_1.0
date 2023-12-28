import java.time.LocalDate;

public abstract class Personal {
    protected String name;
    protected String jobTitle;
    protected String patient;
    protected String qualification;
    protected LocalDate dateOfReceipt;
    protected String type;

    public Personal(String name,  String jobTitle, String patient, 
    String qualification, LocalDate dateOfReceipt){
        this.name = name;
        this.jobTitle = jobTitle;
        this.patient = patient;
        this.qualification = qualification;
        this.dateOfReceipt = dateOfReceipt;
        this.type = getClass().getSimpleName();
    }

    public Personal(String name2, String jobTitle2, String patient2, String qualification2, LocalDate dateOfReceipt2,
            String type2) {
    }

    @Override
    public String toString() {
        return "Personal [name=" + name + ", jobTitle=" + jobTitle + ", patient=" + patient + ", qualification="
                + qualification + ", dateOfReceipt=" + dateOfReceipt + "]";
    }
}