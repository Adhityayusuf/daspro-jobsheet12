import java.util.Scanner;
public class tugas2 {
    static int penjumlahan(int f) {
        if (f == 1) {
            System.out.print("1");
            return 1;
        } else {
            System.out.print(f + "+");
            return f + penjumlahan(f - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai f : ");
        int f = sc.nextInt();
        System.out.print("Hasil penjumlahan : ");
        int hasil = penjumlahan(f);
        System.out.println(" = " + hasil);
    }
}
