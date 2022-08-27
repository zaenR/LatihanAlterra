import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoneyChange {
    private static final int[] LISTMONEY = new int[]{1,10,20,50,100,200,500,1000,2000,5000,10000};

    public int findMaxMoney(int amount){
        for(int i = LISTMONEY.length - 1; i >= 0; --i){
            if (amount >= LISTMONEY[i]){
                return i;
            }
        }
        return -1;
    }

    public void doChange(int amount, List<Integer> listChange){
        while(amount > 0){
            int money = findMaxMoney(amount);

            if (money == -1){
                System.out.println("Uang pecahan tidak memungkinkan untuk melakukan penukaran");
                System.exit(0);
            }
            amount -= LISTMONEY[money];
            listChange.add(LISTMONEY[money]);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Jumlah uang yang ingin ditukarkan : ");
        int amount = scan.nextInt();
        List<Integer> listChange = new ArrayList<>();
        MoneyChange moneyChange = new MoneyChange();
        moneyChange.doChange(amount, listChange);

        System.out.print(listChange);
    }
}
