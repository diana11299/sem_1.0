import java.time.LocalDate;
import java.util.List;

public class Snake extends Animal {

    public Snake(String name, LocalDate birthDate, List<String> vaccinations, String illness, String owner) {
        super(name, birthDate, vaccinations, illness, owner);
    }
    @Override
    protected void fly(){
        System.out.println("NO FLAY!!!");
    }
    @Override
    protected void toGo(){
        System.out.println("DOES NOT GO!!!");
    }
    
}
