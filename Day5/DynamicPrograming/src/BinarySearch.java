public class BinarySearch {
    public static void main(String[] args) {
        int[] arrNumber = new int[]{12, 15, 15, 19, 24, 31, 53, 59, 60};
        int input = 10;
        int end = arrNumber.length;
        int start = 0;

        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.positionX(input, arrNumber,start,end));
    }

    public Integer positionX(int input, int[] arrNumber, int start, int end){
        int mid = (start + end)/2;
        if(end < 0 || start >= arrNumber.length){
            return -1;
        } else if (input == arrNumber[mid]){
            return mid;
        } else if (input < arrNumber[mid]){
             return positionX(input, arrNumber, start,end-1);
        } else if (input > arrNumber[mid]){
            return positionX(input, arrNumber,start+1, end);
        }
        return -1;
    }
}
