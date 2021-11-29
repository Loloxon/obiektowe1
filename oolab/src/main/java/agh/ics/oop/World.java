package agh.ics.oop;
import java.util.ArrayList;

public class World {
    public static void main(String[] args){
//        ArrayList<MoveDirection>A;
//        A = OptionsParser.parse(args);
//        Vector2d sp = new Vector2d(0,0);
//        RectangularMap rmap = new RectangularMap(5,4);
//        Animal an = new Animal(rmap, sp);
//        rmap.place(an);
//        System.out.println(rmap);
//        for(MoveDirection i:A) {
//            an.move(i);
//            System.out.println(i);
//            System.out.println(rmap);
//        }

//        ArrayList<MoveDirection> directions = new OptionsParser().parse(args);
//        IWorldMap map = new RectangularMap(10, 5);
//        Vector2d[] positions = { new Vector2d(2,2), new Vector2d(3,4) };
//        IEngine engine = new SimulationEngine(directions, map, positions);
//        engine.run();

//
//        IWorldMap rmap = new RectangularMap();
//        Animal an1 = new Animal(rmap, new Vector2d(2,3));
//        rmap.place(an1);
//        Animal an2 = new Animal(rmap, new Vector2d(7,6));
//        rmap.place(an2);
//        IWorldMap gf = new GrassField(10);
//        gf.place(an1);
//        System.out.println(rmap);
//        System.out.println(gf);

        try {
            new OptionsParser();
            ArrayList<MoveDirection> directions = OptionsParser.parse(args);
            IWorldMap map = new GrassField(10);
            Vector2d[] positions = { new Vector2d(2,2), new Vector2d(3,4) };
            IEngine engine = new SimulationEngine(directions, map, positions);
            engine.run();
        } catch(IllegalArgumentException ex) {
            System.out.println(ex);
        }
    }
}

//bermaj@gmail.com