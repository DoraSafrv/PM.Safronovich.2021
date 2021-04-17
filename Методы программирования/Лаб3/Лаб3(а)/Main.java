import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customer[] customers = Customer.createArray(15);
        customers[0].setFirstName("Dasha");
        customers[1].setFirstName("Dima");
        customers[2].setFirstName("Nik");
        customers[3].setFirstName("Ashad");
        System.out.println("Вывод массива: ");
        for (Customer i : customers) {
            System.out.println(i.toString());
        }
        System.out.println();
        Arrays.sort(customers, Comparator.comparing(Customer::getFirstName));
        System.out.println("Вывод отсортированного массива по firstName: ");
        for (Customer i : customers) {
            System.out.println(i.toString());
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Нижняя граница: ");
        int low = sc.nextInt();
        System.out.println("Верхняя граница: ");
        int high = sc.nextInt();

        for (Customer i : customers) {
            if (i.getNumberOfCreditCard() < high && i.getNumberOfCreditCard() > low)
                System.out.println(i.toString());
        }
    }
}
