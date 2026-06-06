import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private List<String> parts = new ArrayList<>();

    public void AddPart(String part) {
        parts.add(part);
    }

    public void Deliver(){
        System.out.println("Pizza Servis Edildi! Malzemeler: " + parts);
    }

}
