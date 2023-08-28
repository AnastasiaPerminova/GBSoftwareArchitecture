public class PetrolCar extends Car implements PetrolGasStation{

    public PetrolCar() {
        this.fuelType = new PetrolFuel();
    }
}
