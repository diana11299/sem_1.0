import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
   
    private static final String getSimpleName = null;

    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", LocalDate.of(1993, 6, 6), new ArrayList<>(), "Chumka", "Boss", 4);
        // System.out.println(barsik);
        System.out.println(barsik.getLegsCount());

        Animal eagle = new Eagle("Kesha", LocalDate.of(1993, 6, 6), new ArrayList<>(), "Chumka", "Boss");
        // System.out.println(eagle);

        Snake mia = new Snake ("Mia", LocalDate.of(2000, 6, 4),new ArrayList<>(),"amebiaz", "Boss");
        // System.out.println(mia);


        Duck duck = new Duck("Donald", LocalDate.of(1934, 5, 3), new ArrayList<>(), "Flu", "Walter");
        List<Animal> animals = new ArrayList<>(); //не помню зачем создавали.
        animals.add(barsik);
        animals.add(eagle);
        animals.add(mia);
        animals.add(duck);
        
        
        //System.out.println(eagle.type);
        // Penguin penguin = new Penguin("Lolo", LocalDate.of(1987, 6, 26), new ArrayList<>(), "Flu", "Gennady");

        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addPatients(barsik, eagle, duck, mia, new Fish("Pepe", LocalDate.of(1997, 2, 6), new ArrayList<>(), "Flu", "Harry"));
        System.out.println(clinic.getPatients());
        System.out.println();
        System.out.println(clinic.getGoables());
        System.out.println();
        System.out.println(clinic.getSwimables());
        System.out.println();
        System.out.println(clinic.getFlyables());

    
        Nurse nurse1 = new Nurse("Polina", "Nurse", "Barsik", "Junior", LocalDate.of(2023, 12, 11));
        Nurse nurse2 = new Nurse("Yliana", "Nurse", "Pepe, Mia", "-", LocalDate.of(2023, 12, 10));
        Nurse nurse3 = new Nurse("Diana", "Nurse", "Kesha, Donald", "Older", LocalDate.of(2023, 12, 12));
        Doctor doctor1 = new Doctor("Petrov Pavel", "Doctor", "Barsik",  "Veterinar", LocalDate.of(2023, 12, 11));
        Doctor doctor2 = new Doctor("Yliana Vladimirovna", "Doctor", "Pepe, Mia", "-", LocalDate.of(2023, 12, 10));
        Doctor doctor3 = new Doctor("Vitaliy Vadimovich", "Doctor", "Kesha, Donald", "Surgeon", LocalDate.of(2023, 12, 12));
        
       List<Personal> listOfPersonals = new ArrayList<>();
       listOfPersonals.add(nurse1);
        listOfPersonals.add(nurse2);
        listOfPersonals.add(nurse3);
        listOfPersonals.add(doctor1);
        listOfPersonals.add(doctor2);
        listOfPersonals.add(doctor3);

        VeterinaryClinic clinics = new VeterinaryClinic();
        clinics.addPersonals(listOfPersonals);
        clinics.addPatients(animals);

        System.out.println(clinics.getPersonals);
       
    }     
    
}

//     public static void main(String[] args) {
//         Cat barsik = new Cat("Barsik", LocalDate.of(1993, 6, 6),
//         new ArrayList<>(),"Chumka", "Boss", 4);
//         System.out.println(barsik);
//         System.out.println(barsik.getLegsCount());

//         Animal eagle = new Eagle("Kesha", LocalDate.of(1991, 2, 1),
//         new ArrayList<>(),"-", "Boss");
//         List<Animal>animals = new ArrayList<>();
//         System.out.println(eagle);

//         Duck donald = new Duck ("Donald", LocalDate.of(2000, 6, 4),
//         new ArrayList<>(),"-", "Boss");
//         System.out.println(donald);
        
//         animals.add(barsik);
//         animals.add(eagle);
//         animals.add(donald);
//         animals.add(mia);
//         System.out.println();
       
//        System.out.println("Mia____________________________________");
//        mia.lifeSkills();

//        System.out.println("Barsik_____________________________________");
//        barsik.lifeSkills();
       
//        System.out.println("Donald_____________________________________");
//        donald.lifeSkills();
       
//        System.out.println("Eagle____________________________________");
//        eagle.lifeSkills();
//     }

// }

//Неудобно в каждом дочернем классе переопределять метод,
// который в конкретном классе является не правильным(fly, to go, swing),потому что можно просто запутаться.
//И вызывать по 10 методов чтобы проосмотреть информвцию, как мне кажется, тоже не очень удобною
//Много строчек занял вывод по lifeSkills, а это еще не выводился lifeCycle.

