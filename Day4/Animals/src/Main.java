public class Main {
    public static void main(String[] args) {
        Animals animals = new Animals();
        animals.indentify_myself();
        System.out.println();

        Goat goat = new Goat();
        goat.setNama("Kambing");
        goat.setMakanan("Tumbuhan");
        goat.setGigi("Tumpul");
        goat.indentify_myself();

        Lion lion = new Lion();
        lion.setNama("Singa");
        lion.setMakanan("Daging");
        lion.setGigi("Tajam");
        lion.indentify_myself();
        System.out.println();


        Chicken chicken = new Chicken();
        chicken.setNama("ayam");
        chicken.setMakanan("semua");
        chicken.setGigi("tumpul");
        chicken.indentify_myself();
    }
}
