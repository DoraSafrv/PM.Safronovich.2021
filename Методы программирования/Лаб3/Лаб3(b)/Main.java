import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(6, 10);
        Complex c2 = new Complex(10, 20);
        c1.add(c2);
        System.out.println("c1 + c2 = " + c1.add(c2).toString());
        System.out.println("c1 - c2 = " + c1.subtract(c2).toString());
        System.out.println("c1 * c2 = " + c1.multiply(c2).toString());
        System.out.println("c1 / c2 = " + c1.division(c2).toString());

        Complex[] arr = new Complex[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = new Complex(i + 1, i + 2);
        }
        System.out.println("Массив: ");
        for(Complex i: arr){
            System.out.println(i.toString());
        }

        System.out.println("Сложение в массиве: ");
        System.out.println(Complex.arrayAdd(arr));
        System.out.println("Умножение в массиве: ");
        System.out.println(Complex.arrayMultiply(arr));

        ArrayList<Complex> list = new ArrayList<>(5);
        for(int i = 0; i < 5; i++){
            list.add(new Complex(i + 1, i + 2));
        }
        System.out.println("Список: ");
        for(Complex i: list){
            System.out.println(i.toString());
        }
        System.out.println("Сложение в списке: ");
        System.out.println(Complex.listAdd(list));
        System.out.println("Умножение в списке: ");
        System.out.println(Complex.listMultiply(list));

        Set<Complex> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            set.add(new Complex(i + 1, i + 2));
        }
        System.out.println("Множество: ");
        for(Complex i: set){
            System.out.println(i.toString());
        }
        System.out.println("Сложение в множестве: ");
        System.out.println(Complex.setAdd(set));
        System.out.println("Умножение в множестве: ");
        System.out.println(Complex.setMultiply(set));


    }
}
