package UniqueLastNames;
import java.util.*;

public class UniqueLastNames {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();

        while(true){
            System.out.println("Input first name:");
            String firstName = input.nextLine();
            System.out.println("Input last name:");
            String lastName = input.nextLine();
            System.out.println("Input the year of birth");
            int birthYear = Integer.valueOf(input.nextLine());

            persons.add(new Person(firstName, lastName, birthYear));

            System.out.println("Press enter to continue personal information input? Type 'quit' to end");
            String quit = input.nextLine();
            if(quit.equalsIgnoreCase("quit")){
                System.out.println("Unique last names in ABC order:");
                persons.stream()
                .map(person -> person.getLastName())
                .distinct()
                .sorted()
                .forEach(last -> System.out.println(last));
                break;
            }

            }

            input.close();

        }

    }
