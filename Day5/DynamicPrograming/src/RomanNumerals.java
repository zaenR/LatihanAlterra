import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanNumerals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input : ");
        int input = scan.nextInt();
        String result = "";
        int [] listNumber = new int[]{1,4,5,9,10,40,50,90,100,400,500,900,1000};
        System.out.println(roman(input,listNumber.length,result, listNumber));
    }

    public static String roman(int input, int length, String result, int [] listNumber){
        String[] listRoman = new String[]{"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};

        if (input <= 0 ){
            result = "input bilangan bulat lebih dari 0";
            return result;
        }

        for(int i = length - 1; i >= 0; --i){
            if(input >= listNumber[i]){
                result += listRoman[i];
                input -= listNumber[i];
                return roman(input,i+1, result,listNumber);
            }
        }

        return result;
    }
}
