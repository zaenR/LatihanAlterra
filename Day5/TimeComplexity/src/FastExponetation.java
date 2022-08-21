import java.util.Scanner;

public class FastExponetation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input nilai : ");
        int nilai = scan.nextInt();
        System.out.print("Input pangkat : ");
        int pangkat = scan.nextInt();
        int sum = 1;
        FastExponetation fastExponetation = new FastExponetation();
        System.out.println(fastExponetation.exponetation(nilai,pangkat,sum));
    }

    public int exponetation(int angka, int pangkat, int sum){
            sum = sum * angka;
            if (pangkat > 1){
                return exponetation(angka,pangkat-1,sum);
            }
        return sum;
    }
}
