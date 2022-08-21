
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input: " );
        String input = scanner.nextLine();

        Set<Integer> setInt = new LinkedHashSet<>();
        for (String data : input.split(",")){
            setInt.add(Integer.valueOf(data.trim()));
        }
        System.out.println(setInt.size());
    }
}
