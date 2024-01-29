public class modullo {

    public static int modulo(int a, int b) {
        return a % b;
    }

public static void main(String[] args) {
        int a1 = 101;
        int a2 = 20;

        int sum = modulo(a1, a2);
   System.out.println("remainder : " + sum);
}
}