import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;

public class Complex {
    double re;
    double im;

    public Complex() {
        this.re = 0;
        this.im = 0;
    }

    public Complex(int re, int im) {
        this.re = re;
        this.im = im;
    }

    public Complex(Complex complex) {
        this.re = complex.re;
        this.im = complex.im;
    }

    public Complex add(Complex c) {
        Complex b = new Complex();
        b.re = this.re + c.re;
        b.im = this.im + c.im;
        return b;
    }

    public Complex subtract(Complex c) {
        Complex b = new Complex();
        b.re = this.re - c.re;
        b.im = this.im - c.im;
        return b;
    }

    public Complex multiply(Complex c) {
        //z=z1⋅z2=(a1a2−b1b2)+(a1b2+b1a2)i
        Complex b = new Complex();
        b.re = this.re * c.re - this.im * c.im;
        b.im = this.re * c.im + this.im * c.re;
        return b;
    }

    public Complex division(Complex c) {
        //z1/z2=(a+bi)/(c+di)=(ac+bd)/(c2+d2)+((bc-ad)/(c2+d2))i
        Complex b = new Complex();
        b.re = (this.re * c.re + this.im * c.im) / (c.re * c.re + c.im * c.im);
        b.im = (this.im * c.re - this.re * c.im) / (c.re * c.re + c.im * c.im);
        return b;
    }

    public static Complex arrayAdd(Complex[] arr) {
        Complex c = new Complex();
        for (Complex i : arr) {
            c = c.add(i);
        }
        return c;
    }

    public static Complex arrayMultiply(Complex[] arr) {
        Complex c = new Complex(1, 1);
        for (Complex i : arr) {
            c = c.multiply(i);
        }
        return c;
    }

    public static Complex listAdd(ArrayList<Complex> arr) {
        Complex c = new Complex();
        for (Complex i : arr) {
            c = c.add(i);
        }
        return c;
    }

    public static Complex listMultiply(ArrayList<Complex> arr) {
        Complex c = new Complex(1, 1);
        for (Complex i : arr) {
            c = c.multiply(i);
        }
        return c;
    }

    public static Complex setAdd(Set<Complex> arr) {
        Complex c = new Complex();
        for (Complex i : arr) {
            c = c.add(i);
        }
        return c;
    }

    public static Complex setMultiply(Set<Complex> arr) {
        Complex c = new Complex(1, 1);
        for (Complex i : arr) {
            c = c.multiply(i);
        }
        return c;
    }



    public double getRe() {
        return re;
    }

    public void setRe(int re) {
        this.re = re;
    }

    public double getIm() {
        return im;
    }

    public void setIm(int im) {
        this.im = im;
    }

    @Override
    public String toString() {
        return re + " + " + im + " * i";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return re == complex.re && im == complex.im;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }
}
