public class Multicar extends Car implements GasStation, ExtraGasStation {
    public Multicar(String brand, String model, String colour, String bodyType, int wheels, Fuel fuelType, String gearbox, String engineCapacity) {
        super(brand, model, colour, bodyType, wheels, fuelType, gearbox, engineCapacity);
    }
    public Multicar(){};

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void cleanWindshield() {
        System.out.println("Лобовое стекло протерто");

    }

    @Override
    public void cleanHeadLights() {

        System.out.println("Фары протерты.");

    }

    @Override
    public void cleanMirror() {

        System.out.println("Зеркала протерты.");

    }

    @Override
    public void refueling() {

        System.out.println("Машина заправлена.");

    }
}
