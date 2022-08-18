import java.util.Scanner;

public class FastExpnentation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("x: ");
        double angka = input.nextDouble();
        System.out.print("n: ");
        double pangkat = input.nextDouble();

        double result = Math.pow(angka,pangkat);
        System.out.println(result);
    }
}
