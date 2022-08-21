import java.util.Scanner;

public class VokalKonsonan {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Kalimat : ");
        String str = input.nextLine();
        int konsonan = 0 , vokal = 0;

        for (int i = 0 ; i < str.length(); i++){
            char text=str.charAt(i);
            if (text=='A' || text=='E' || text=='I' || text=='O' || text=='U'
                    || text=='a' || text=='e' || text=='i' || text=='o' || text=='u'){
                vokal ++;
            } else
            if ((text>=65 && text<=90) || (text>=97 && text<=122)) {
                konsonan++;
            }
        }

        System.out.println("Jumlah Konsonan : " +konsonan);
        System.out.println("Jumlah Vokal : " +vokal);
        System.out.println("Jumlah Karakter : " +str.replaceAll("\\s+","").length());
    }
}
