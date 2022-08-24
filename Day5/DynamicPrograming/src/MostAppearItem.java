import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MostAppearItem {
    public static void main(String[] args) {
        mostAppear();
    }

    public static void mostAppear(){
        String[] arrBarang = new String[]{"js","js","golang","ruby","ruby","js","js"};
        Map<String, Integer> map = new HashMap<>();

        for (String stri : arrBarang) {
            if (map.containsKey(stri)) continue;
            int count = 0;
            for (String strj : arrBarang) {
                if (stri.equalsIgnoreCase(strj)) {
                    count++;
                }
            }
            map.put(stri, count);
        }
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(entry -> sortedMap.put(entry.getKey(),entry.getValue()));
        StringBuilder str = new StringBuilder();
        for (Map.Entry<String, Integer> element : sortedMap.entrySet()){
            str.append(element.getKey()).append(" -> ").append(element.getValue()).append(" ");
        }
        System.out.println(str);
    }
}
