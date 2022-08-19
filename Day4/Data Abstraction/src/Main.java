import java.util.Scanner;

public class Main extends Calculator{

    public static void main(String[] args) {
        Main main = new Main();
        main.mainMenu();
    }
    private void mainMenu(){
        Scanner scan = new Scanner(System.in);
        System.out.print("+++++++++++++++++ CALCULATOR ++++++++++++++++\n" +
                "1 : Open Calculator\n" +
                "99: Exit\n" +
                "Masukkan pilihan Anda : ");
        int input = scan.nextInt();
        if (input == 1){
            scan = new Scanner(System.in);
            System.out.print("+++++++++++++++++ CALCULATOR ++++++++++++++++\n" +
                    "Masukan value 1 : ");
            int val1 = scan.nextInt();
            System.out.print("Masukan value 2 : ");
            int val2 = scan.nextInt();
            hitung(val1, val2);
        } else {
            System.out.println("Closed");
        }
    }

    private void hitung(int val1, int val2){
        double result = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("+++++++++++++++++ CALCULATOR ++++++++++++++++\n" +
                "1. Add Value\n" +
                "2. Sub Value\n" +
                "3. Multiply Value\n" +
                "4. Divide Value\n" +
                "++++++++++++++++++++++++++++++++++++++++++++\n" +
                "pilihan Anda : ");
        int input = scan.nextInt();
        switch (input){
            case 1 :
                result = addValue(val1, val2);
                break;
            case 2 :
                result = subValue(val1, val2);
                break;
            case 3 :
                result = multiplyValue(val1, val2);
                break;
            case 4 :
                result = divideValue(val1, val2);
                break;
            default:
                System.out.println("Pilihan yang anda pilih belum terdaftar");
                hitung(val1, val2);
        }
        System.out.println("Hasil " +result);

    }

    @Override
    public int addValue(int x, int y) {
        return x + y;
    }

    @Override
    public int subValue(int x, int y) {
        return x - y;
    }

    @Override
    public int multiplyValue(int x, int y) {
        return x * y;
    }

    @Override
    public double divideValue(double x, double y) {
        return x / y;
    }
}
