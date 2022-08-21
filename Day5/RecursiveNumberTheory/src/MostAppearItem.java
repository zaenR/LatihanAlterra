import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MostAppearItem {
    public static void main(String[] args) {
        mostAppear();
    }

    public static void mostAppear(){
        String[] arrBarang = new String[]{"js","js","golang","ruby","js","js"};
        Map<String, Integer> map = new TreeMap<>();
        String temp = "";

        for(int i = 0; i < arrBarang.length; i++){
            String stri = arrBarang[i];
            if (map.containsKey(stri))continue;
            int count = 0;
            for(int j = 0; j < arrBarang.length; j++){
                String strj = arrBarang[j];
                if (stri.equalsIgnoreCase(strj)){
                    count++;
                }
                System.out.println(arrBarang[j]);
            }
            temp = arrBarang[i];
            map.put(arrBarang[i],count);
        }
    }
}
