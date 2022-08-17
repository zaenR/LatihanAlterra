import java.util.Scanner;

public class TabelPerkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka: ");
        int angka = input.nextInt();

        for (int i = 1; i <= angka; i++){
            for(int j = 1; j <= angka; j++){
                System.out.print(" "+ i * j + "\t");
            }
            System.out.print("\n");
        }

    }
}
