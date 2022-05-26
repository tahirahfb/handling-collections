import java.util.*;
import java.util.stream.Collectors;
public class LimitedNumbers {
    public static void main(String[] args){
        Scanner  userInput = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter a list of numbers. The list will stop when you enter a negative number.");
        while(true){
            int number = Integer.valueOf(userInput.nextLine());

            if(number < 0){
                ArrayList<Integer> oneThruFive = numbers.stream()
                .filter(num -> num >= 1 && num <= 5)
                .collect(Collectors.toCollection(ArrayList::new));

                oneThruFive.stream()
                .forEach(value -> System.out.println(value));
                
                break;
            }

            numbers.add(number);

        }
        userInput.close();
    }
}
