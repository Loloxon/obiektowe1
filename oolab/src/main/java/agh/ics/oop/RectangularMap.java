package agh.ics.oop;
import java.util.ArrayList;
import java.util.List;
/*
public class RectangularMap extends AbstractWorldMap{
//    public int width=5;
//    public int height=5;
//    public RectangularMap(int width,int height) {
//        if (width >= 0)  this.width = width;
//        else            this.width = 5;
//        if (height >= 0) this.height = height;
//        else            this.height = 5;
//    }
//    Vector2d ll = new Vector2d(0,0); //low left
    public String toString(){
        return super.toString();
    }

    @Override
    public Vector2d[] Size() {
        int minx=Integer.MAX_VALUE;
        int miny=Integer.MAX_VALUE;
        int maxx=Integer.MIN_VALUE;
        int maxy=Integer.MIN_VALUE;
        for(Animal a: animals.values()){
            minx = Math.min(minx,a.getPosition().x);
            miny = Math.min(miny,a.getPosition().y);
            maxx = Math.max(maxx,a.getPosition().x);
            maxy = Math.max(maxy,a.getPosition().y);
        }
        Vector2d[] Border = {new Vector2d(minx,miny),new Vector2d(maxx,maxy)};
        return Border;
    }


    @Override
    public boolean canMoveTo(Vector2d position) {
        return !isOccupied(position) || (isOccupied(position) && !(objectAt(position) instanceof Animal));
    }

//
//    @Override
//    public boolean isOccupied(Vector2d position) {
//        for(Animal ani:A){
//            if(ani.getPosition().equals(position))   return true;
//        }
//        return false;
//    }
//
//    @Override
//    public Object objectAt(Vector2d position) {
//        for(Animal obj:A){
//            if(obj.getPosition().equals(position))   return obj;
//        }
//        return null;
//    }
}*/
