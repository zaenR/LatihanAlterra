import java.util.Scanner;

public class XDanO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Kalimat : ");
        String str = input.nextLine();
        int countX = 0, countO = 0;
        Boolean result;

        for (int i = 0 ; i < str.length(); i++){
            char text=str.charAt(i);
            if (text == 'X' || text == 'x'){
                countX++;
            } else
                if (text == 'O' || text == 'o'){
                    countO++;
            }
        }

        if (countX == countO){
            result = true;
        } else {
            result = false;
        }

        System.out.println(result);
    }
}
