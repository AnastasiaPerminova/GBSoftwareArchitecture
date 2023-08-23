package ModelElements;

import Stuff.Type;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public Integer id;

    public List<PoligonalModel> models = new ArrayList<>();

    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(Integer id, List<PoligonalModel> models,  List<Flash> flashes,List<Camera> cameras) throws Exception {
        this.id = id;
        if (models.size() > 0){
            this.models = models;
        }

        else
            throw new Exception("Должна быть хотя бы одна модель.");
        this.flashes = flashes;
        if(cameras.size() > 0){
            this.cameras = cameras;
        }
        else
            throw new Exception("Должна быть хотя бы одна камера.");

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
