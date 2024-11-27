import java.util.Scanner;
public class tugas1 {
    static void rekursif(int n) {
        if (n < 0) {
            return;
        }
        System.out.print(n + " ");
        rekursif(n - 1);
    }
    static void iteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        System.out.println("Rekursif : ");
        rekursif(n);
        System.out.println();
        System.out.println("Iteratif : ");
        iteratif(n);
    }
}