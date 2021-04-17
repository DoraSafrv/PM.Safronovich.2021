//это класс рационального числа, где m / n
public class RF {
    double m;
    double n;
    double ans;

    public RF() {
        this.m = 0;
        this.n = 0;
        this.ans = 0;
    }

    public RF(double m, double n) {
        this.m = m;
        this.n = n;
        this.ans = m / n;
    }

    public RF(RF r) {
        this.m = r.m;
        this.n = r.n;
        this.ans = r.m / r.n;
    }

    @Override
    public String toString() {
        return String.valueOf(this.ans);
    }

    public double get(){
        return ans;
    }
}
