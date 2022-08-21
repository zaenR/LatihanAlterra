import java.util.Scanner;

public class PlayWithArsitek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka: ");
        int n = input.nextInt();

        for (int i = n; i>0 ; i--){
            for(int j = 0; j < i ; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= (n-i)*2; k++){
                System.out.print("*");
            }
            for(int l = 0; l < i ; l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
