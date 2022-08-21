public class SportCars extends Cars{
    @Override
    public void indentify_myself() {
        System.out.println("Hi I'm Car, My Name is " +getName()+ " My Engine Status is '" + getEngine_status() + "' " +
                "I have " +getWheel_count() + " Wheel(s), My Engine Type = " +getEngine_type());
    }
}
