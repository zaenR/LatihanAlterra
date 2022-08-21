public class PedalBikes extends Bikes{

    @Override
    public void indentify_myself() {
        System.out.println("Hi I'm Bike, My Name is " +getName()+ " My Engine Status is '" + getEngine_status() + "' " +
                "I have " +getWheel_count() + " Wheel(s)");
    }
}
