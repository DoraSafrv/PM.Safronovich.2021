import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Number of elements: ");
            int numberOfElements = sc.nextInt();
            if(numberOfElements <= 0){
                throw new IOException("Invalid number of elements");
            }
            List<Integer> array = new ArrayList<>(numberOfElements);
            System.out.println("Enter your elements: ");
            for(int i = 0; i < numberOfElements; i++){
                array.add(sc.nextInt());
            }
            int maxEl = Integer.MIN_VALUE;
            for(int i = 0; i < numberOfElements; i++){
                if(maxEl < array.get(i)){
                    maxEl = array.get(i);
                }
            }
            int minEl = Integer.MAX_VALUE;
            for(int i = 0; i < numberOfElements; i++){
                if(minEl > array.get(i)){
                    minEl = array.get(i);
                }
            }
            System.out.println("Max element: " + maxEl);
            System.out.println("Min element: " + minEl);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
