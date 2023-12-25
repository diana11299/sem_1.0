import java.time.LocalDate;
import java.util.List;

public class Eagle extends Animal {

    public Eagle(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }
    @Override
    protected void swim(){
        System.out.println("DOESN'T FLOAT!!!");
    }
    @Override
    protected void toGo(){
        System.out.println("NOT RUNNING!!!");
    }
}
