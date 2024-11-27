import java.util.Scanner;
public class tugas4 {
    static int marmut(int bulan) {
        if (bulan == 1 || bulan == 2) {
            return 1;
        }
        return marmut(bulan - 1) + marmut(bulan - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bulan ke-n: ");
        int bulan = sc.nextInt();
        if (bulan <= 0) {
            System.out.println("silahkan input ulang !!!");
        } else {
            int totalPasangan = marmut(bulan);
            System.out.println("Jumlah total pasangan marmut adalah : " + totalPasangan);
        }
    }
}
