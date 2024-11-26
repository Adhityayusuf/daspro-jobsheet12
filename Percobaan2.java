import java.util.Scanner;
public class Percobaan2 {
    static int hitunganPangkat(int x, int y) {
        if (y == 0) {
            System.out.print("1");
            return (1);
        } else {
            System.out.print(x + " x ");
            return x * hitunganPangkat(x, y - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;
        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();
        int hasil = hitunganPangkat(bilangan, pangkat);
        System.out.println(" = " + hasil);
    }
}