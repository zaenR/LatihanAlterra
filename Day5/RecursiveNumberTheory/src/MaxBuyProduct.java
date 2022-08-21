import java.util.Arrays;

public class MaxBuyProduct {
    public static void main(String[] args) {
        int [] productPrice1 = new int[]{25000, 25000, 10000, 14000};
        int money1 = 50000;
        int [] productPrice2 = new int[]{15000, 10000, 12000,5000, 3000};
        int money2 = 30000;
        System.out.println(buyProduct(money1, productPrice1));
        System.out.println(buyProduct(money2, productPrice2));
    }

    public static int buyProduct(int money, int[] productPrice){
        Arrays.sort(productPrice);
        if (money == 0){
            return 0 ;
        }

        int total = 0;
        int jumlahBarang = 0;
        for (int i = 0; i < productPrice.length; i++){
            total += productPrice[i];
            if(money >= total){
                jumlahBarang ++;
            }
        }

        return jumlahBarang;

    }
}
