import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Kalimat: ");
        String kata = input.nextLine();

        String reverse = "";

        for (int i = kata.length() -1 ; i >= 0 ; --i){
            reverse = reverse + kata.charAt(i);
        }

        if (kata.equalsIgnoreCase(reverse)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Bukan Palindrome");
        }
    }
}
