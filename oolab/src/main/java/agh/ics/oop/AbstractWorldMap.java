package agh.ics.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;


abstract public class AbstractWorldMap implements IWorldMap, IPositionChangeObserver{
//    protected List<Grass> G = new ArrayList<>();
//    protected List<Animal> A = new ArrayList<>();

    abstract public Vector2d[] Size();

    public String toString(){
        MapVisualizer S = new MapVisualizer(this);
        Vector2d[] Border = Size();
        return S.draw(Border[0],Border[1]);
    }

//    public List<Animal> getA(){
//        return A;
//    }

//    public List<Grass> getG(){
//        return G;
//    }

//    @Override
//    public boolean canMoveTo(Vector2d position) {
//        return !isOccupied(position) || (isOccupied(position) && !(objectAt(position) instanceof Animal));
//    }


}
