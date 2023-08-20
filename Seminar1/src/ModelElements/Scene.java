package ModelElements;

import Staff.Type;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public Integer id;

    public List<PoligonalModel> models = new ArrayList<>();

    public List<Flash> flashes;

    public Scene(Integer id, List<PoligonalModel> models) {
        this.id = id;
        this.models = models;
    }

    public Scene() {

    }

    public Type method1(Type object){
        Type returnObject = new Type();
        return returnObject;
    }

    public Type method2(Type object1, Type object2){
        Type returnObject = new Type();
        return returnObject;
    }
}
