import java.util.*;

public class Main {
    public static final String RESET = "\u001B[0m";
    public static final String BLUE ="\u001B[34m";
    public static final String RED ="\u001B[31m";
    public static final String YELLOW ="\u001B[33m";
    public static final String GREEN ="\u001B[32m";
    public static void main(String[] args) {
        Main main = new Main();
        main.mainMenu();
    }

    private Integer jumlahKandang;
    public void mainMenu(){
        Kandang kandang = new Kandang();
        Scanner scan = new Scanner(System.in);
        System.out.print("===============================\n" +
                "\t\t "+BLUE+"Tebak Kandang"+RESET+" \t\t\n" +
                "===============================\n" +
                "1. Jumlah Kandang\n" +
                "99. Exit\n" +
                "===============================\n" +
                "Pilih Menu: ");
        int input = scan.nextInt();

        if (input == 1) {
            System.out.print("Masukan Jumlah Kandang: ");
            int jumlah = scan.nextInt();
            jumlahKandang = jumlah;
            kandang.setJumlahKandang(jumlah);
            kandang.membuatKandang();
            kumpulanKandang();
            tebakKandang(kumpulanKandang());

        } else {
            System.out.println("Terima Kasih");
        }

    }

    public Map<Integer, String> kumpulanKandang(){
        Map<Integer, String> result = new HashMap<>();
        for (int i = 0; i < jumlahKandang; i++){
            result.put(i,random());
        }
        return result;
    }

    public static String random(){
        String kata = "KZB";
        Random random = new Random();
        return String.valueOf(kata.charAt(random.nextInt(kata.length())));
    }

    public void tebakKandang(Map<Integer, String> kumpulanKandang){
        Kandang kandang = new Kandang();
        Scanner scan = new Scanner(System.in);
        System.out.print("Pilih kandang yang ingin dibuka: ");
        int key = scan.nextInt();
        System.out.print("----PILIHAN----\n" +
                BLUE+"K" +RESET+ ": Kambing\n" +
                RED+"Z" +RESET+ ": Zebra\n" +
                YELLOW+"B" +RESET+": Bebek\n" +
                "Masukkan tebakan : ");
        scan = new Scanner(System.in);
        String value = scan.nextLine();
        if(key != 0){
            if (kumpulanKandang.get(key-1).equalsIgnoreCase(value)) {
                System.out.println(GREEN+"Tebakan Benar\n"+RESET);
            } else {
                System.out.println(YELLOW+"Tebakan Salah\n"+RESET);
                kandang.setJumlahKandang(jumlahKandang);
                kandang.membuatKandang();
                tebakKandang(kumpulanKandang);
            }
        }
    }

}
