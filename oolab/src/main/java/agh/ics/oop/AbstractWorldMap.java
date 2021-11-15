package agh.ics.oop;

import java.util.ArrayList;
import java.util.List;
import java.lang.Math;

abstract public class AbstractWorldMap implements IWorldMap{
    protected List<Grass> G = new ArrayList<>();
    protected List<Animal> A = new ArrayList<>();

    abstract public Vector2d[] Size();

    public String toString(){
        MapVisualizer S = new MapVisualizer(this);
        Vector2d[] Border = Size();
        return S.draw(Border[0],Border[1]);
    }

    public List<Animal> getA(){
        return A;
    }

    public List<Grass> getG(){
        return G;
    }


//    @Override
//    public boolean canMoveTo(Vector2d position) {
//        return !isOccupied(position) || (isOccupied(position) && !(objectAt(position) instanceof Animal));
//    }

    @Override
    public boolean place(Animal animal) {
        Vector2d pos = animal.getPosition();
        if (canMoveTo(pos)) {
            A.add(animal);
            return true;
        }
        return false;
    }

    @Override
    public boolean isOccupied(Vector2d position) {
        for(Animal obj:A){
            if(obj.getPosition().equals(position))   return true;
        }
        for(Grass obj:G){
            if(obj.getPosition().equals(position))   return true;
        }
        return false;
    }

    @Override
    public Object objectAt(Vector2d position) {
        for(Animal obj:A){
            if(obj.getPosition().equals(position))   return obj;
        }
        for(Grass obj:G){
            if(obj.getPosition().equals(position))   return obj;
        }
        return null;
    }
}
