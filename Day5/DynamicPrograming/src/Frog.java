public class Frog {
    public static void main(String[] args) {
        int[] listNumber = new int[]{10, 30, 40, 20};
        frogJump(listNumber);
        int[] listNumber2 = new int[]{30, 10, 60, 10, 60, 50};
        frogJump(listNumber2);
    }
    public static void frogJump(int[] listNumber) {
        int totalOne = 0;
        int totalTwo = 0;
        for (int i = 1; i < listNumber.length; i++) {

            if (i == 1) {
                totalOne += Math.abs(listNumber[i] - listNumber[i - 1]);
            } else {
                if (i % 2 == 0) {
                    totalTwo += Math.abs(listNumber[i] - listNumber[i - 2]);
                } else {
                    totalOne += Math.abs(listNumber[i] - listNumber[i - 2]);
                }
            }
            if (i == listNumber.length - 1) {
                totalTwo += Math.abs(listNumber[i] - listNumber[i - 1]);
            }
        }

        System.out.println(Math.min(totalOne, totalTwo));
    }
}