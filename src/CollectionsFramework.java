import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionsFramework {

    public static void main(String[] args) {
        // Create a new ArrayList
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.removeIf(num->num%2==0);
        System.out.println(list);

    }
}
