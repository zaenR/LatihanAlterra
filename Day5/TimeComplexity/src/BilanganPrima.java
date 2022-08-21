import java.util.Scanner;

public class BilanganPrima {
    public static void main(String[] args) {
        BilanganPrima bilanganPrima = new BilanganPrima();
        if (bilanganPrima.isPrime()){
            System.out.println("Bilangan Prima");
        } else {
            System.out.println("Bukan Bilangan Prima");
        }
    }

    public boolean isPrime(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("input: ");
        int input = scanner.nextInt();
        int sqrt = (int)Math.sqrt(input);

        for (int i = 2 ; i <= sqrt ; i++){
            if (input%i == 0){
               return false;
            }
        }
        return true;
    }
}
