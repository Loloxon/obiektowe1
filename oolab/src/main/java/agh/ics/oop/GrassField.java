package agh.ics.oop;
import java.lang.Math;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GrassField extends AbstractWorldMap{
    private int grassNo;
    public GrassField(int n){
        boolean er;
        grassNo = n;
        int mx = 0; //max x
        int my = 0; //max y
        for(int i=0; i<grassNo; i++){
            er = false;
            Random rand = new Random();
            int x = 0;
            int y = 0;
            while(!er) {
                er = true;
                x = rand.nextInt((int) Math.ceil(Math.sqrt(grassNo * 10)));
                y = rand.nextInt((int) Math.ceil(Math.sqrt(grassNo * 10)));
                for (Grass vec : G) {
                    if (vec.getPosition().equals(new Vector2d(x, y))) {
                        er = false;
                    }
                }
            }
            if(er) {
                G.add(new Grass(new Vector2d(x, y)));
            }
        }
    }

    public String toString(){
        return super.toString();
    }

    @Override
    public Vector2d[] Size() {
        int minx=Integer.MAX_VALUE;
        int miny=Integer.MAX_VALUE;
        int maxx=Integer.MIN_VALUE;
        int maxy=Integer.MIN_VALUE;
        for(Animal a:A){
            minx = Math.min(minx,a.getPosition().x);
            miny = Math.min(miny,a.getPosition().y);
            maxx = Math.max(maxx,a.getPosition().x);
            maxy = Math.max(maxy,a.getPosition().y);
        }
        for(Grass g:G){
            minx = Math.min(minx,g.getPosition().x);
            miny = Math.min(miny,g.getPosition().y);
            maxx = Math.max(maxx,g.getPosition().x);
            maxy = Math.max(maxy,g.getPosition().y);
        }
        Vector2d[] Border = {new Vector2d(minx,miny),new Vector2d(maxx,maxy)};
        return Border;
    }

    void getNewGrass(Vector2d position){
        for(int i=0;i<G.size();i++){
            if(G.get(i).getPosition().equals(position)){
                G.remove(i);
                boolean er;
                er = false;
                Random rand = new Random();
                int x = 0;
                int y = 0;
                while(!er) {
                    er = true;
                    x = rand.nextInt((int) Math.ceil(Math.sqrt(grassNo * 10)));
                    y = rand.nextInt((int) Math.ceil(Math.sqrt(grassNo * 10)));
                    for (Grass vec : G) {
                        if (vec.getPosition().equals(new Vector2d(x, y))) {
                            er = false;
                        }
                    }
                }
                if(er) {
                    G.add(new Grass(new Vector2d(x, y)));
                }
            }
        }
    }

    @Override
    public boolean canMoveTo(Vector2d position) {
        if(objectAt(position) instanceof Grass){
            getNewGrass(position);
        }
        return !isOccupied(position) || (isOccupied(position) && !(objectAt(position) instanceof Animal));
    }


//
//    @Override
//    public boolean isOccupied(Vector2d position) {
//        for(Grass grass:G){
//            if(grass.getPosition().equals(position))   return true;
//        }
//        return false;
//    }
//
//    @Override
//    public Object objectAt(Vector2d position) {
//        for(Grass obj:G){
//            if(obj.getPosition().equals(position))   return obj;
//        }
//        return null;
//    }
}
