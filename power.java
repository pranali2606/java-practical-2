import java.lang.Math;
public class power {

    public static double power(double a,double b) {
        return Math.pow(a, b);
    }

public static void main(String[] args) {
        double a1 = 10;
        double a2 = 3;

        double power =power(a1, a2);
   System.out.println("power : " +power);
}
}
