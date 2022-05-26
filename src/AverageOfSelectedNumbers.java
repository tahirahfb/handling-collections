import java.util.*;
import java.text.DecimalFormat;

public class AverageOfSelectedNumbers {
    public static void main(String args[]){
        Scanner userInput = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Enter numbers, type 'end' to stop.");
        while(true){
            String ans = userInput.nextLine();
            if(ans.equalsIgnoreCase("end")){
                System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
                String printWhat = userInput.nextLine();
                if(printWhat.equalsIgnoreCase("n")){
                double aveNeg = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number <= 0)
                .average()
                .getAsDouble();
                System.out.println("Average of negative numbers you entered: " + df.format(aveNeg));
                } else {
                double avePos = inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number >= 0)
                .average()
                .getAsDouble();
                System.out.println("Average of negative numbers you entered: " + df.format(avePos));
                }
                break;
            }

            inputs.add(ans);

        }
        userInput.close();
    }
}
