public class Buses extends Vehicle{
    private Boolean private_bus;
    private String jenis_bus;

    public Boolean getPrivate_bus() {
        return private_bus;
    }

    public void setPrivate_bus(Boolean private_bus) {
        this.private_bus = private_bus;
        if (private_bus){
            this.jenis_bus = "[Private Bus]";
        } else {
            this.jenis_bus = "[Public Bus]";
        }
    }

    public String getJenis_bus() {
        return jenis_bus;
    }

    public void setJenis_bus(String jenis_bus) {
        this.jenis_bus = jenis_bus;
    }
}
