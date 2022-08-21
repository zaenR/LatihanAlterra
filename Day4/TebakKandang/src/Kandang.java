import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kandang {
    private int jumlahKandang;

    public void membuatKandang(){
        for (int i = 1 ; i <= jumlahKandang; i++ )
        System.out.print("|||\n" +
                "|"+i+"|\n" +
                "|||\n\n");
    }

    public Map<String, String> membukaKandang(String key, String value){
        Map<String, String> bukaKandang = new HashMap<>();
        bukaKandang.put(key,value);
        return bukaKandang;
    }

    public int getJumlahKandang() {
        return jumlahKandang;
    }

    public void setJumlahKandang(int jumlahKandang) {
        this.jumlahKandang = jumlahKandang;
    }
}
