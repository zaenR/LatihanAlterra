public class DragonOfLoowater {
    public static void main(String[] args) {
        minimumHeigth();
    }

    public static void minimumHeigth(){
        int[] d = new int[]{7,2};
        int[] h = new int[]{2,1,8,5};
        int totalD = 0;
        int totalH = 0;

        for (int element : d){
            totalD += element;
        }

        for (int j = 0; j < h.length ; j++){
            for (int i = j+1 ; i < h.length ; i++){
                int temp = h[i] + h[j];
                if (temp > totalD){
                    if(totalH == 0 || temp < totalH){
                        totalH = temp;
                    }
                }
            }
        }

        if(totalH < totalD){
            System.out.println("Knight fall");
        } else {
            System.out.println(totalH);
        }
    }
}
