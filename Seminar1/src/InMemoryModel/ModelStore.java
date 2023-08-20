package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger{
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private IModelChangedObserver changeObservers;

    public ModelStore() {
       models = new ArrayList<>();
       scenes  = new ArrayList<>();
       flashes = new ArrayList<>();
       cameras = new ArrayList<>();
    }

    public Scene getScene(Integer id){
         Scene scene = new Scene();
         return scene;
    }

    @Override
    public void notifyChange(IModelChanger sender) {

    }
}
