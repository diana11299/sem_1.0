// import static java.util.Collections.addAll;

import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class VeterinaryClinic {
    public final char[] getPersonals = null;
    private List<Animal> patients = new ArrayList<>();
    private List<Personal> staff = new ArrayList<>();
    // public char[] getSwimables;
    // public Collection personal;
    public char[] getStaff;
    private List<Personal> personal;
    

    public void addPatient(Animal animal){
        patients.add(animal);
    }
    public void addPatients(Animal ... animals){//[animal]
        Collections.addAll(patients, animals);//коллекция в которую сложили массив
    }
    public void addPatients(List<Animal> animalList){
        patients = animalList;
    }

    public void addStaff(Personal personal){
        staff.add(personal);
    }
    public void addPersonals(Personal ...personals){
        Collections.addAll(staff, personals);
    }
    public void addPersonals(List<Personal> personalsList){
        personal = personalsList;
    }

    // public boolean addPersonal(Staff staff){
    //     return personal.add(staff);
    // }
    // public void addPersonals(Staff ... staff){    
        
    //     addAll(personal, staff);
    // }
    // public void addPersonals(List<Staff> staffList){
    //     List<Staff> personal = staffList;
    // }

    // public void addStaff(Nurse ... nurses){
    //     List<Nurse> temp = new ArrayList<>();
    //     for( Nurse nurse: nurses){
    //         temp.add(nurse);
    //     }
        
    //     Staff.addAll(temp);
    // }
    // ОРИГИНАЛ  public void addPatients(Animal ... animals){
        //List<Animal> temp = new ArrayList<>();
        //for (Animal animal:
        //animals){
            //temp.add(animal);
       // }
       //patients.addAll(temp);


    public List<Goable> getGoables(){
        List<Goable> result = new ArrayList<>(patients.size());
        for (Animal animal:patients) {
            if(animal instanceof Goable)
                result.add((Goable) animal);
        }
        return result;
    }

public List<Swimble> getSwimables(){
        List<Swimble> result = new ArrayList<>(patients.size());
        for (Animal animal:patients) {
            if(animal instanceof Swimble)
                result.add((Swimble) animal);
        }
        return result;
    }

    public List<Flyble> getFlyables(){
        List<Flyble> result = new ArrayList<>(patients.size());
        for (Animal animal:patients) {
            if(animal instanceof Flyble)
                result.add((Flyble) animal);
        }
        return result;
    }
   
    public List<Animal> getPatients() {
        return patients;
    }
    public List<Personal> getPersonals() {
        
        return personal;
    }

}