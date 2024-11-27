import java.util.Scanner;
public class tugas3 {
    static boolean prima(int n, int pembagi) {
        if (pembagi == 1) {
            return true;
        }
        if (n % pembagi == 0) {
            return false;
        }
        return prima(n, pembagi - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan n : ");
        int n = sc.nextInt();
        if (prima(n, n - 1)) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }
    }
}