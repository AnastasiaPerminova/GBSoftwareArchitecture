public interface PetrolGasStation extends GasStation {

    @Override
    default void refueling(){
        System.out.println("Машина заправлена бензином.");
    };
}
