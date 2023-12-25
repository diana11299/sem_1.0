import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", LocalDate.of(1993, 6, 6),
        new ArrayList<>(),"Chumka", "Boss", 4);
        System.out.println(barsik);
        System.out.println(barsik.getLegsCount());

        Animal eagle = new Eagle("Kesha", LocalDate.of(1991, 2, 1),
        new ArrayList<>(),"-", "Boss");
        List<Animal>animals = new ArrayList<>();
        System.out.println(eagle);
        

        Duck donald = new Duck ("Donald", LocalDate.of(2000, 6, 4),
        new ArrayList<>(),"-", "Boss");
        System.out.println(donald);
        

        Snake mia = new Snake ("Mia", LocalDate.of(2000, 6, 4),
        new ArrayList<>(),"amebiaz", "Boss");
        System.out.println(mia);
        

        animals.add(barsik);
        animals.add(eagle);
        animals.add(donald);
        animals.add(mia);
        System.out.println();
       
       System.out.println("Mia____________________________________");
       mia.lifeSkills();

       
       System.out.println("Barsik_____________________________________");
       barsik.lifeSkills();

       
       System.out.println("Donald_____________________________________");
       donald.lifeSkills();
       
       System.out.println("Eagle____________________________________");
       eagle.lifeSkills();
    }

}

//Неудобно в каждом дочернем классе переопределять метод,
// который в конкретном классе является не правильным(fly, to go, swing),потому что можно просто запутаться.
//И вызывать по 10 методов чтобы проосмотреть информвцию, как мне кажется, тоже не очень удобною
//Много строчек занял вывод по lifeSkills, а это еще не выводился lifeCycle.

