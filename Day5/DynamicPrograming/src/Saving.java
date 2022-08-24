import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Saving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input : ");
        String input = scan.nextLine();

        Saving saving = new Saving();
        System.out.println(saving.searchValue(input));
    }

    public String searchValue(String input){
        String result = "No solution";
        List<Integer> list = new ArrayList<>();
        for(String element : input.split(" ")){
            list.add(Integer.valueOf(element));
        }

        for (int x = 0 ; x <= list.get(2); x++){
            for(int y = x+1 ; y <= list.get(2);y++){
                for(int z = y+1 ; z <= list.get(2); z++){
                    Integer adjust = x+y+z;
                    Integer multiply = x*y*z;
                    Integer powPlus = (x * x) + (y * y) + (z * z);
                    if (list.get(0) == adjust && list.get(1) == multiply && list.get(2) == powPlus){
                        System.out.print(x + " " + y +" "+ z);
                        System.out.close();
                        break;
                    }
                }
            }
        }

        return result;
    }
}
