import java.util.Scanner;

public class PrimaKeX {
    public static void main(String[] args) {
        PrimaKeX primaKeX = new PrimaKeX();
        primaKeX.cekPrime();
    }

    public void cekPrime(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input : ");
        int input = scan.nextInt();
        int count = 0;
        if (input > 10){
            System.out.println("Bilangan Prima Hanya 10, coba kembali");
            cekPrime();
        }
        for(int i = 2; i > count ; i++){
            int cekPrime = 0;
            for (int j = 2; j < i; j++){
                if (i%j == 0){
                    cekPrime++;
                }
            }

            if(cekPrime == 0){
                count++;
                if(input == count){
                    System.out.println(i);
                }
            } else if (count == 10) {
                break;
            }
        }
    }
}
