import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Line l1 = new Line(7, 2, 13, 5);
        Line l2 = new Line(13, 5, 7, 2);
        System.out.println(l1);
        l1.printOxOy();
        l1.printIntersectionWith(l2);

        int size = 5;
        //создаем массив прямых и определяем параллельны ли они
        System.out.println("Массив:");
        Line[] arr1 = new Line[size];
        for (int i = 0; i < size; i++) {
            arr1[i] = new Line(1, 2, i, i + 1);
        }
        Line.arrayIsParallel(arr1);

        //создаем список прямых и определяем параллельны ли они
        System.out.println("Список:");
        List<Line> arr2 = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr2.add(new Line(i, i + 1, 3, 3));
        }
        Line.listIsParallel(arr2);

        //создаем множество прямых и определяем параллельны ли они
        System.out.println("Множество:");
        Set<Line> arr3 = new HashSet<>();
        for (int i = 0; i < size; i++) {
            arr3.add(new Line(i, i + 1, 3, 3));
        }
        Line.setIsParallel(arr3);


    }
}
