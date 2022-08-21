import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input Fibonaci ke : ");
        int input = scan.nextInt();
        Fibonacci fibonacci = new Fibonacci();
        System.out.println(fibonacci.cetakFibonacci(input));
    }

    public int cetakFibonacci(int input){
        if (input == 0){
            return 0;
        }

        if(input == 1){
            return 1;
        }
        return cetakFibonacci(input - 1) + cetakFibonacci(input - 2);
    }
}
