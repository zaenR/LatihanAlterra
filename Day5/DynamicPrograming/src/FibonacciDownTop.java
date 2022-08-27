import java.util.Scanner;

public class FibonacciDownTop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        int input = scanner.nextInt();
        FibonacciDownTop fibonacciDownTop = new FibonacciDownTop();
        System.out.println(fibonacciDownTop.fibDownTop(input));
    }

    public int fibDownTop(int input){
        int[] fibonancci = new int[input+1];
        fibonancci[0] = 0;
        fibonancci[1] = 1;
        int fibValue = 0;

        for(int i = 2 ; i < fibonancci.length ; i++){
            fibonancci[i] = fibonancci[i - 1] + fibonancci[i - 2];
        }
        fibValue = fibonancci[input];
        return fibValue;
    }
}
