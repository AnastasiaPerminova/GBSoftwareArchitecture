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
    private List< IModelChangedObserver> changeObservers;

    public ModelStore(List< IModelChangedObserver> changeObservers) throws Exception {
       models = new ArrayList<>();
       scenes  = new ArrayList<>();
       flashes = new ArrayList<>();
       cameras = new ArrayList<>();
       this.changeObservers = changeObservers;

       models.add(new PoligonalModel(null));
       flashes.add(new Flash());
       cameras.add(new Camera());
       scenes.add(new Scene(0, models, flashes, cameras));

    }

    public Scene getScene(Integer id) {
        for (int i = 0; i < scenes.size(); i++) {
            if (scenes.get(i).id == id) {
                return scenes.get(i);
            }
        }
        return null;
        }


        @Override
        public void notifyChange (IModelChanger sender){

        }
    }
