import java.sql.Time;
import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan angka: ");
        double input = scan.nextDouble();
        boolean prima = true;

        for(int i = 2 ; i < Math.sqrt(input) ; i++){
            if (input%i == 0) {
                System.out.println("Bukan bilangan prima");
                prima = false;
                break;
            }
        }

        if (prima){
            System.out.println("Bilangan Prima");
        }

    }
}
