public interface DieselGasStation extends GasStation{
    @Override
    default void refueling(){
        System.out.println("Машина заправлена дизельным топливом.");
    };
}
