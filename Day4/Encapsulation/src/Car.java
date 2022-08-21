public class Car {
    private String type;
    private String color;
    private int num_of_tire;

    protected void show_identity(){
        System.out.println("Saya Mobil dengan detail, Type : " + type +
                " color: " + color + "num of tire : " + num_of_tire);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNum_of_tire() {
        return num_of_tire;
    }

    public void setNum_of_tire(int num_of_tire) {
        this.num_of_tire = num_of_tire;
    }
}
