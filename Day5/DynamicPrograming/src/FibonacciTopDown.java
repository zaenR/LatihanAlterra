import java.util.Scanner;

public class FibonacciTopDown {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input : ");
        int input = scan.nextInt();
        FibonacciTopDown fibonacciTopDown = new FibonacciTopDown();
        System.out.println(fibonacciTopDown.fiTopDown(input));
    }

    public int fiTopDown(int input){
        if (input == 0){
            return 0;
        }

        if(input == 1){
            return 1;
        }
        return fiTopDown(input - 1) + fiTopDown(input - 2);
    }


}
