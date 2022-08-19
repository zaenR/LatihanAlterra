import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Scanner scan = new Scanner(System.in);
        System.out.print("Input warna bulu : ");
        cat.setFur_color(scan.nextLine());
        System.out.print("Input jumlah kaki : ");
        cat.setNum_of_leg(scan.nextInt());
        cat.show_identity();

        Fish fish = new Fish();
        scan = new Scanner(System.in);
        System.out.print("Input jenis ikan : ");
        fish.setType(scan.nextLine());
        System.out.print("Input makanan ikan : ");
        fish.setFeed(scan.nextLine());
        fish.show_identity();

        Flower flower = new Flower();
        scan = new Scanner(System.in);
        System.out.print("Input jenis Bunga : ");
        flower.setNama(scan.nextLine());
        System.out.print("Input warna bunga : ");
        flower.setColor(scan.nextLine());
        System.out.print("Input num of petal : ");
        flower.setNum_of_petal(scan.nextInt());
        flower.show_identity();

        Car car = new Car();
        scan = new Scanner(System.in);
        System.out.print("Input Tipe mobil : ");
        car.setType(scan.nextLine());
        System.out.print("Input warna mobil : ");
        car.setColor(scan.nextLine());
        System.out.print("Input num of tire : ");
        car.setNum_of_tire(scan.nextInt());
        car.show_identity();


    }
}
