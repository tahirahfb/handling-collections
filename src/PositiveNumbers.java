import java.util.*;
import java.util.stream.Collectors;

public class PositiveNumbers {
    public static List<Integer> positive(List<Integer> numbers){
        
        ArrayList<Integer> values = numbers.stream()
        .filter(value -> value >= 0)
        .collect(Collectors.toCollection(ArrayList::new));

        return values;

    }

    public static void main(String args[]){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(10);
        numbers.add(-9);
        numbers.add(13);
        numbers.add(-11);
        numbers.add(8);
        numbers.add(-14);

        System.out.println("The positive numbers in the list are: " + positive(numbers));
    
    }
}
