public class Main {
    public static void main(String[] args) {

        Lada lada = new Lada();
        new Car.GearShift().gearShifting(lada);

        Multicar multi = new Multicar();

        new Car.Sweep().sweepStreet(multi);
        multi.setWheels(4);

        ThreeWheelsCar threeCar = new ThreeWheelsCar();
        SpecialCar specialCar = new SpecialCar();

       //Проверка принципа LSP. Метод для класса наследника дополняет поведение базового класса. Принцип работает.
        System.out.println(threeCar.getWheels());
        System.out.println(multi.getWheels());

        //Проверка принципа LSP. Метод для класса наследника меняет поведение базового класса. Принцип не работает.
        lada.move();
        specialCar.move();

        //Проверка принципа ISP. Классы имплементируют только необходимые интерфейсы.
        lada.refueling();
        multi.refueling();
        multi.cleanHeadLights();

        //Проверка принципа DIP.

        PetrolCar petrolCar = new PetrolCar();
        DieselCar dieselCar = new DieselCar();
        petrolCar.refueling();
        dieselCar.refueling();
    }

}