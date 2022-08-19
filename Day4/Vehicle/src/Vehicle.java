import com.sun.org.apache.xpath.internal.operations.Bool;

public class Vehicle {
    private String name;
    private Boolean with_engine;

    private String engine_status;
    private int wheel_count;

    public void indentify_myself(){
        System.out.println("Hi I'm Parent of All Vehicles, My Name is Gerobak, My Engine Status is 'no engine'");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getWith_engine() {
        return with_engine;
    }

    public void setWith_engine(boolean with_engine) {
        this.with_engine = with_engine;
        if(with_engine){
            this.engine_status = "with engine";
        } else {
            this.engine_status = "no engine";
        }
    }

    public String getEngine_status() {
        return engine_status;
    }

    public void setEngine_status(String engine_status) {
        this.engine_status = engine_status;
    }

    public int getWheel_count() {
        return wheel_count;
    }

    public void setWheel_count(int wheel_count) {
        this.wheel_count = wheel_count;
    }
}
