public abstract class Car {
    public String brand;
    public String model;
    public String colour;

    public String bodyType;

    public int wheels;

    public Fuel fuelType;

    public String gearbox;

    public String engineCapacity;

    public Car(String brand, String model, String colour, String bodyType, int wheels, Fuel fuelType, String gearbox, String engineCapacity) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.bodyType = bodyType;
        this.wheels = wheels;
        this.fuelType = fuelType;
        this.gearbox = gearbox;
        this.engineCapacity = engineCapacity;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public Car() {
    }

    //    Класс Car - единственная ответственность "движение" move(). Принцип SRP.
    public void move(){

        System.out.println("Движение");

    };

//  Класс GearShift - единственная ответственность "переключение передач" gearShifting(Car car).Принцип SRP.
static class GearShift{
        public void gearShifting(Car car) {
            System.out.println("Переключение передач");
        }

    }


    //  Класс HeadLights - единственная ответственность "включение фар" turnOnHeadlights(Car car).Принцип SRP.
    static class HeadLights{
        public void turnOnHeadlights(Car car){
            System.out.println("Включение фар");
        }
    }

    //  Класс FogLights является наследником класса HeadLights. Помимо метода  "включение фар" turnOnHeadlights(Car car),
    //  у него есть метод "включение противотуманных фар" turnOnFogLights(Car car). Принцип OCP.

    static class FogLights extends HeadLights{
        @Override
        public void turnOnHeadlights(Car car) {
            super.turnOnHeadlights(car);
        }
        public void turnOnFogLights(Car car){
            System.out.println("Включение противотуманных фар");
        }

    }



    //  Класс Service - единственная ответственность "обслуживание" carService(Car car). Принцип SRP.
    static class Service {
        public void carService(Car car) {

            System.out.println("Обслуживание машины.");
        }
    }


    //  Класс Wipers - единственная ответственность "включение дворников" turnOnWipers(Car car). Принцип SRP.
    static class Wipers {
        public void turnOnWipers(Car car) {

            System.out.println("Включение дворников.");

        }
    }


    //  Класс Sweep - единственная ответственность "подметание улиц" sweepStreet(Car car). Принцип SRP.
    static class Sweep {
        public void sweepStreet(Car car) {

            System.out.println("Включение дворников.");

        }
    }

    //  Класс Cargo - единственная ответственность "перевозка грузов" cargoTransportation(Car car). Принцип SRP.
    static class Cargo {

    public void cargoTransportation(Car car){

        System.out.println("Перевозка грузов.");

    }
    }

}
