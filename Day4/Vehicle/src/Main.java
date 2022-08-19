public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.indentify_myself();
        System.out.println();

        PedalBikes pedalBikes = new PedalBikes();
        pedalBikes.setName("Pedal Bikes");
        pedalBikes.setWith_engine(false);
        pedalBikes.setWheel_count(2);
        pedalBikes.indentify_myself();

        MotorBikes motorBikes = new MotorBikes();
        motorBikes.setName("Motor Bikes");
        motorBikes.setWith_engine(true);
        motorBikes.setWheel_count(2);
        motorBikes.indentify_myself();
        System.out.println();

        SportCars sportCars = new SportCars();
        sportCars.setName("Sport Cars");
        sportCars.setWith_engine(true);
        sportCars.setWheel_count(4);
        sportCars.setEngine_type("VB");
        sportCars.indentify_myself();

        PickupCars pickupCars = new PickupCars();
        pickupCars.setName("Pickup Cars");
        pickupCars.setWith_engine(true);
        pickupCars.setWheel_count(2);
        pickupCars.setEngine_type("Solar");
        pickupCars.indentify_myself();
        System.out.println();

        PublicBus publicBus = new PublicBus();
        publicBus.setPrivate_bus(false);
        publicBus.setName("Trans Jakarta");
        publicBus.setWith_engine(true);
        publicBus.setWheel_count(4);
        publicBus.indentify_myself();

        PrivateBus privateBus = new PrivateBus();
        privateBus.setPrivate_bus(true);
        privateBus.setName("School Bus");
        privateBus.setWith_engine(true);
        privateBus.setWheel_count(4);
        privateBus.indentify_myself();


    }
}
