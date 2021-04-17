import java.io.IOException;
import java.util.*;

/**
 * @author Daria Safronovich
 * @version 1.0
 * A program that sorts an array
 */
public class Main {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Number of elements: ");
            int numberOfElements = sc.nextInt();
            if(numberOfElements <= 0){
                /**
                 * @throw if the user entered the wrong number of variables
                 */
                throw new IOException("Invalid number of element");
            }
            /**
             * Array creation
             */
            List<Integer> array = new ArrayList<>(numberOfElements);
            System.out.println("Enter your elements: ");
            /**
             * Array initialization
             */
            for(int i = 0; i < numberOfElements; i++){
                array.add(sc.nextInt());
            }
            System.out.print("in ascending order: ");
            /**
             * Sorting an array with stream
             */
            array.stream().sorted().forEach(integer -> System.out.print(integer + " "));
            System.out.print("\nin descending order: ");
            /**
             * "Reverse" the array
             */
            array.stream().sorted(Comparator.reverseOrder()).forEach(integer -> System.out.print(integer + " "));
            System.out.println("\nDaria Safronovich");
            /**
             * Create a date object
             */
            Calendar calendar = new GregorianCalendar(2020, 2 , 2);
            System.out.println("Date of issue of the assignment: " + calendar.getTime());
            Date date = new Date();
            /**
             * Displaying the time
             */
            System.out.println("Task execution time: " + date);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
