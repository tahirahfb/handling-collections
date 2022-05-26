import java.util.*;
import java.text.DecimalFormat;

public class AverageOfNumbers {
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Enter numbers, type 'end' to stop.");
        while(true){
            String ans = userInput.nextLine();
            if(ans.equalsIgnoreCase("end")){
                double average = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
                System.out.println("Average of the numbers you entered: " + df.format(average));
                break;
            }

            inputs.add(ans);

        }
        userInput.close();
    
    }
}

