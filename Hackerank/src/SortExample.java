import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Mukesh", "Vishal", "Amar");
        String s =  list.stream().collect(Collectors.joining(",")).toString();
        System.out.println(s);
    }
}

class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
