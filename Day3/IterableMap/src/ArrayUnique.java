import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayUnique {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input pertama: ");
        String input1 = scan.nextLine();
        System.out.print("Input kedua: ");
        String input2 = scan.nextLine();

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        for(String i : input1.split(",")){
            list1.add(i.trim());
        }

        for(String i : input2.split(",")){
            list2.add(i.trim());
        }

        List <String> result = new ArrayList<>();

        for(int i = 0; i < list1.size(); i++){
            int count = 0;
            for(int j = 0 ; j < list2.size(); j++){
                if (list1.get(i).equalsIgnoreCase(list2.get(j))){
                    count++;
                    break;
                }
            }
            if (count <= 0){
                result.add(list1.get(i));
            }
        }
        System.out.println(result);
    }
}
