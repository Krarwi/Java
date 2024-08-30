import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class U2 {
    public static void main(String[] args) {
        
        List<Integer> Array1 = new ArrayList<>(Arrays.asList(5, 10, 25, 75, 125));
        List<Integer> Array2 = new ArrayList<>(Arrays.asList(50, 100, 250, 750, 25));
        
        long Sum1 = Array1.stream()
            .mapToLong(Integer::longValue)
            .sum();
        System.out.println(Sum1);
        
        long Sum2 = Array2.stream()
            .mapToLong(Integer::longValue)
            .sum();
        System.out.println(Sum2);
        
        Array1.remove(0);
        Array2.remove(4);
        for(int i = 0; i < Array1.size(); i++) {
            System.out.print(Array1.get(i));
            System.out.print(", ");
        }
        for(int i = 0; i < Array2.size(); i++) { 
            System.out.print(Array2.get(i));
            System.out.print(", ");
        }
    }
}