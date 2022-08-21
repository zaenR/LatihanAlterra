import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        int cek = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Input sebuah angka: ");
        int n = input.nextInt();


        // 0 dan 1 bukan angka prima
        if (n <= 1) {
            System.out.println("Angka harus bilangan bulat dan lebih dari 1");
        } else {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    cek++;
                }
            }
        }

        if (cek == 1) {
            System.out.println("bilangan prima");
        } else {
            System.out.println("bukan bilangan prima");
        }
    }
}
