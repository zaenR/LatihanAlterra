public class Cars extends Vehicle{
    private String engine_type;

    @Override
    public void indentify_myself() {
        System.out.println("Hi I'm Parent of Car, My Name is Cars, My Engine Status is 'with engine");
    }

    public String getEngine_type() {
        return engine_type;
    }

    public void setEngine_type(String engine_type) {
        this.engine_type = engine_type;
    }
}
