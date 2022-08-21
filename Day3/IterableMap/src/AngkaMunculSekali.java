import java.util.*;

public class AngkaMunculSekali {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input : ");
        String input = scan.nextLine().trim();

        List<String> listA  = new ArrayList<>();
        List<String> listB = new ArrayList<>();

        for (char a : input.toCharArray()){
            listA.add(String.valueOf(a));
        }

        for(int i = 0 ; i < listA.size(); i++){
            int count = 0;
            for(int j = 0 ; j < listA.size(); j++){
                if (i != j && listA.get(i).equalsIgnoreCase(listA.get(j))){
                    count++;
                    break;
                }
            }
            if (count <= 0){
                listB.add(listA.get(i));
            }
        }
        System.out.println(listB);
    }
}
