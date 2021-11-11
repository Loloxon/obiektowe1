package agh.ics.oop;

import java.util.ArrayList;
import java.util.List;

public class SimulationEngine implements IEngine{
    ArrayList<MoveDirection> moves;
    IWorldMap map;
    Vector2d[] startpos;
    public SimulationEngine(ArrayList<MoveDirection> moves, IWorldMap map, Vector2d[] startpos){
    this.moves = moves;
    this.map = map;
    this.startpos = startpos;
    addAnimals();
    }
    public void addAnimals() {
        for (Vector2d ps : startpos) {
            map.place(new Animal(map, ps));
        }
    }
    @Override
    public void run(){
        int id=0;
        RectangularMap rmap = (RectangularMap) map;
        List<Animal> A = rmap.getA();
        System.out.println(rmap);
        for(MoveDirection move:moves){
            A.get(id).move(move);
//            System.out.println(move);
//            System.out.println(id);
//            System.out.println(rmap);
            id+=1;
            id%=A.size();
        }
        map = rmap;
    }
}
