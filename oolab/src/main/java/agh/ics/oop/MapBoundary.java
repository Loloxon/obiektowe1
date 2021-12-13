package agh.ics.oop;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class MapBoundary implements IPositionChangeObserver{
    List<Object> objectsX = new ArrayList<>();
    List<Object> objectsY = new ArrayList<>();
    void putObject(Object object){
        objectsX.add(object);
        objectsY.add(object);
    }

    void deleteG(Grass g){
        Vector2d pos = g.getPosition();
        for(int i=0;i<objectsX.size();i++){
            if(objectsX.get(i) instanceof Grass && ((Grass) objectsX.get(i)).getPosition().x == pos.x){
                objectsX.remove(i);
                break;
            }
        }
        for(int i=0;i<objectsY.size();i++){
            if(objectsY.get(i) instanceof Grass && ((Grass) objectsY.get(i)).getPosition().y == pos.y){
                objectsY.remove(i);
                break;
            }
        }
    }

    public Vector2d getLL(){
        objectsX.sort(new cartOrdX());
        objectsY.sort(new cartOrdY());
        if((objectsX.get(0) instanceof Animal || objectsX.get(0) instanceof Grass) && (objectsY.get(0) instanceof Animal || objectsY.get(0) instanceof Grass))
            return new Vector2d(((IMapElement) objectsX.get(0)).getPosition().x,((IMapElement) objectsY.get(0)).getPosition().y);
        else
            throw new IllegalArgumentException("LL untypical");
    }
    public Vector2d getUR(){
        objectsX.sort(new cartOrdX());
        objectsY.sort(new cartOrdY());
        int end = objectsX.size()-1;
        if((objectsX.get(end) instanceof Animal || objectsX.get(end) instanceof Grass) && (objectsY.get(end) instanceof Animal || objectsY.get(end) instanceof Grass))
            return new Vector2d(((IMapElement) objectsX.get(end)).getPosition().x,((IMapElement) objectsY.get(end)).getPosition().y);
        else
            throw new IllegalArgumentException("UR untypical");
    }
    @Override
    public boolean positionChanged(Vector2d oldPosition, Vector2d newPosition) {
        return false;
    }
}

class cartOrdX implements Comparator<Object> {
    public int compare(Object a, Object b){
        if((a instanceof Animal || a instanceof Grass) && (b instanceof Animal || b instanceof Grass)){
            if(((IMapElement) a).getPosition().x==((IMapElement) b).getPosition().x){
                if(((IMapElement) a).getPosition().y==((IMapElement) b).getPosition().y){
                    if(a instanceof Animal)
                        return -1;
                    else
                        return 1;
                }
                else
                    return ((IMapElement) a).getPosition().y-((IMapElement) b).getPosition().y;
            }
            else
                return ((IMapElement) a).getPosition().x-((IMapElement) b).getPosition().x;
        }
        return 1;
    }
}

class cartOrdY implements Comparator<Object> {
    public int compare(Object a, Object b){
        if((a instanceof Animal || a instanceof Grass) && (b instanceof Animal || b instanceof Grass)){
            if(((IMapElement) a).getPosition().y==((IMapElement) b).getPosition().y){
                if(((IMapElement) a).getPosition().x==((IMapElement) b).getPosition().x){
                    if(a instanceof Animal)
                        return -1;
                    else
                        return 1;
                }
                else
                    return ((IMapElement) a).getPosition().x-((IMapElement) b).getPosition().x;
            }
            else
                return ((IMapElement) a).getPosition().y-((IMapElement) b).getPosition().y;
        }
        return 1;
    }
}












