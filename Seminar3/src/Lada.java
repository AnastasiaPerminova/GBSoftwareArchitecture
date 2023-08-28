public class Lada extends Car implements GasStation{

    public Lada(String brand, String model, String colour, String bodyType, int wheels, Fuel fuelType, String gearbox, String engineCapacity) {
        super(brand, model, colour, bodyType, wheels, fuelType, gearbox, engineCapacity);
    }

    public Lada(){}

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void refueling() {

        System.out.println("Ваша лада заправлена");

    }
}
