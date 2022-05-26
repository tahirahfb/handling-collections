import java.util.*;
import java.util.stream.Collectors;

public class Divisible {
    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers){
        ArrayList<Integer> values = numbers.stream()
        .filter(value -> value % 2 == 0 || value % 3 == 0 || value % 5 == 0)
        .collect(Collectors.toCollection(ArrayList::new));

        return values;

        }

    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(2);
        nums.add(4);
        nums.add(8);
        nums.add(9);
        nums.add(15);
        nums.add(13);
        nums.add(11);
        nums.add(21);
        nums.add(20);
        nums.add(23);

        divisible(nums);

        System.out.println("The numbers in the list divisbile by 2, 3, and 5 are: " + divisible(nums));
        
    } 
        
    }

