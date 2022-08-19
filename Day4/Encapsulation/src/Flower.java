public class Flower {
    private String nama;
    private String color;
    private int num_of_petal;

    protected void show_identity(){
        System.out.println("Saya Bunga dengan detail, Jenis : " + nama +
                " color: " + color + "num of petal : " + num_of_petal);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNum_of_petal() {
        return num_of_petal;
    }

    public void setNum_of_petal(int num_of_petal) {
        this.num_of_petal = num_of_petal;
    }
}
