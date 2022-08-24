import com.sun.org.apache.xpath.internal.objects.XString;

public class Sorting {
    public static void main(String[] args) {
    sort();
    }

    public static String sort() {
        String smallest = "";
        String[] arr = new String[] {"a","bcc","cacc","dac","acc"};
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String a = arr[i] + arr[j];
                String b = arr[j] + arr[i];
                if ((arr[i] + arr[j]).compareTo(arr[j] + arr[i]) > 0) {
                    String s = arr[i];
                    arr[i] = arr[j];
                    arr[j] = s;
                }
            }
        }

        for (int i = 0; i < n; i++)
            smallest += arr[i];
        System.out.println(smallest);
        return smallest;
    }
}
