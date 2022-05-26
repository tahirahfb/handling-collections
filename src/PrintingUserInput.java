import java.util.*;

public class PrintingUserInput {
  public static void main(String args[]){
      Scanner userInput = new Scanner(System.in);
      List<String> words = new ArrayList<>();

      System.out.println("Enter a list of strings. Press enter to stop list.");
      while(true){
        String input = userInput.nextLine();

        if(input.isBlank()){
            break;
        }

        words.add(input);
      }

      System.out.println("The words you added to the list are: " + words);

      userInput.close();
  }  

}
