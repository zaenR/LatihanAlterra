import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PairWithTargetSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input angka : ");
        String input = scan.nextLine();
        System.out.print("input Target : ");
        Integer target = scan.nextInt();

        List<Integer> list = new ArrayList<>();
        for (String a : input.split(",")) {
            list.add(Integer.valueOf(a));
        }

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < list.size(); i++){
            for (int j = i + 1 ; j < list.size(); j++){
                if (list.get(i) + list.get(j) == target ){
                     result.add(i);
                    result.add(j);
                }
            }
        }
        System.out.println(result);
    }
}
