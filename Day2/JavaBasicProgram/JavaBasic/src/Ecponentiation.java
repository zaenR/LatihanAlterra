import java.util.Scanner;

public class Ecponentiation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka: ");
        double angka = input.nextDouble();
        System.out.print("Masukan Nilai Pangkat: ");
        double pangkat = input.nextDouble();

        double result = Math.pow(angka,pangkat);
        System.out.println(result);
    }
}
