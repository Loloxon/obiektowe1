package agh.ics.oop;
import java.util.ArrayList;
import java.util.List;

public class RectangularMap implements IWorldMap{
    public int width;
    public int height;
    List<Animal> A = new ArrayList<>();
    public RectangularMap(int width,int height) {
        if (width >= 0)  this.width = width;
        else            this.width = 5;
        if (height >= 0) this.height = height;
        else            this.height = 5;
    }
    Vector2d ll = new Vector2d(0,0); //low left
    public String toString(){
        MapVisualizer S = new MapVisualizer(this);
        return S.draw(ll,new Vector2d(width, height));
    }
    public List<Animal> getA(){
        return A;
    }
    @Override
    public boolean canMoveTo(Vector2d position) {
        return position.follows(ll) && position.precedes(new Vector2d(width, height)) && !isOccupied(position);
    }

    @Override
    public boolean place(Animal animal) {
        Vector2d pos = animal.getPos();
        if (canMoveTo(pos)) {
            A.add(animal);
            return true;
        }
        return false;
    }

    @Override
    public boolean isOccupied(Vector2d position) {
        for(Animal ani:A){
            if(ani.getPos().equals(position))   return true;
        }
        return false;
    }

    @Override
    public Object objectAt(Vector2d position) {
        for(Animal obj:A){
            if(obj.getPos().equals(position))   return obj;
        }
        return null;
    }
}
