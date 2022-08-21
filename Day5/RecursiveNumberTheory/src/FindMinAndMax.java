public class FindMinAndMax {
    public static void main(String[] args) {
        int [] array1 = new int[]{5, 7, 4, -2, -1, 8};
        int [] array2 = new int[]{2, -5, -4, 22, 7, 7};
        findMinMax(array1);
        findMinMax(array2);
    }

    public static void findMinMax(int[] array){
        int minValue = 0;
        int indexMin = 0;
        int maxValue = 0;
        int indexMax = 0;

        for (int i = 0 ; i < array.length; i++){
            if(array[i] < minValue){
                minValue = array[i];
                indexMin = i;
            } else if (array[i] > maxValue){
                maxValue = array[i];
                indexMax = i;
            }
        }
        System.out.println("min : " +minValue+ " index: " +indexMin+ " max: " +maxValue+ " index: " +indexMax);
    }
}
