public class PrivateBus extends Buses{
    @Override
    public void indentify_myself() {
        System.out.println("Hi I'm Bus " +getJenis_bus()+ " , My Name is " +getName()+ " My Engine Status is '" + getEngine_status() + "' " +
                "I have " +getWheel_count() + " Wheel(s)");
    }
}
