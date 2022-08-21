public class Cat {
    private String fur_color;
    private int num_of_leg;

    protected void show_identity(){
        System.out.println("Saya Kucing dengan detail, Warna Bulu " + fur_color +
                " dengan jumlah kaki: " + num_of_leg);
    }

    public String getFur_color() {
        return fur_color;
    }

    public void setFur_color(String fur_color) {
        this.fur_color = fur_color;
    }

    public int getNum_of_leg() {
        return num_of_leg;
    }

    public void setNum_of_leg(int num_of_leg) {
        this.num_of_leg = num_of_leg;
    }
}
