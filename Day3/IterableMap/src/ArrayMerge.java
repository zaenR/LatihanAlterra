import java.util.*;

public class ArrayMerge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan kalimat pertama: ");
        String input1 = scan.nextLine();
        System.out.print("Masukan kalimat kedua: ");
        String input2 = scan.nextLine();

        Set<String> setA = new LinkedHashSet<>();

        for(String kata : input1.split(",")){
            setA.add(kata.trim());
        }

        for(String kata : input2.split(",")){
            setA.add(kata.trim());
        }
        System.out.println(setA);
    }
}
