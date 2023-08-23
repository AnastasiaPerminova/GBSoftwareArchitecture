public class WoodGenerator extends ItemFabric{
    @Override
    public iGameItem createItem() {
        System.out.println("Создал новый ящик");
        return new WoodReward();
    }
}
