import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxSumArray {
    public static void main(String[] args) {
        int[] Input1 = {2,1,5,1,3,2};
        int length1 = 3;
        int result = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input : ");
        String input = scan.nextLine();
        System.out.print("k : ");
        int length = scan.nextInt();

        List<String> list = new ArrayList<>();
        for(String str : input.split(",")){
            list.add(str);
        }

        for(int i = 0; i < list.size() ; i++){
            int sum = 0;
            int count = 0;
            for(int j = i; j < list.size() ; j++){
                count ++;
                sum += Integer.valueOf(list.get(j)) ;
                if (count == length)break;
            }
            if (result < sum){
                result = sum;
            }

        }
        System.out.println("Sum Maximum : " +result);
    }
}
