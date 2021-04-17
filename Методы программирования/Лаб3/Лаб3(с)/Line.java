//класс линии
import java.util.List;
import java.util.Set;

public class Line {
    // y = k * x + b
    RF k;
    RF b;

    //конструктор по умолчанию
    public Line() {
        this.k = new RF();
        this.b = new RF();
    }

    //обычный конструктор
    public Line(double k1, double k2, double b1, double b2) {
        this.k = new RF(k1, k2);
        this.b = new RF(b1, b2);
    }

    //конструктор копирования
    public Line(Line l) {
        this.k = l.k;
        this.b = l.b;
    }

    //вычесляет пересечение с осями
    public void printOxOy() {
        System.out.println("Пересечение с OX: ");
        System.out.println("x = "
                + -(this.b.get() / this.k.get()) + ", y = 0");
        System.out.println("Пересечение с OY: ");
        System.out.println("x = 0, y = " + this.b.get());
    }

    //вычесляет точку пересечения с другой прямой
    public void printIntersectionWith(Line l) {
        double x = (l.b.get() - this.b.get()) / (this.k.get() - l.k.get());
        System.out.println("Точка перечечения с прямой " + l.toString() +
                ": x = " + x + ", y = " + (this.k.get() * x + this.b.get()));
    }

    //в след три функции просто надо передать массив прямых и функции определяют параллельны ли эти прямые (равенство коэфицента k)
    public static void arrayIsParallel(Line[] arr){
        double k = arr[0].getK().get();
        boolean a = false;
        for(Line i : arr){
            if(i.getK().get() != k){
                System.out.println("Прямые не параллельны");
                a = true;
                break;
            }
        }
        if(!a) System.out.println("Прямые паралельны");
    }

    public static void listIsParallel(List<Line> arr){
        double k = arr.get(0).getK().get();
        boolean a = false;
        for(Line i : arr){
            if(i.getK().get() != k){
                System.out.println("Прямые не параллельны");
                a = true;
                break;
            }
        }
        if(!a) System.out.println("Прямые паралельны");
    }

    public static void setIsParallel(Set<Line> arr){
        Line[] arr1 = arr.toArray(new Line[arr.size()]);
        double k = arr1[0].getK().get();
        boolean a = false;
        for(Line i : arr1){
            if(i.getK().get() != k){
                System.out.println("Прямые не параллельны");
                a = true;
                break;
            }
        }
        if(!a) System.out.println("Прямые паралельны");
    }


    //перегруженный toString
    @Override
    public String toString() {
        return "y = " + k + " * x + " + b;
    }

    public RF getK() {
        return k;
    }

    public void setK(RF k) {
        this.k = k;
    }

    public RF getB() {
        return b;
    }

    public void setB(RF b) {
        this.b = b;
    }


}
