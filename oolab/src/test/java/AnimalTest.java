import agh.ics.oop.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {
    /*
    RectangularMap map = new RectangularMap(5,5);
    Vector2d vec1 = new Vector2d(4,4);
    Animal a = new Animal(map, vec1);
    @Test
    public void DirectionTest(){
        a.setPos(vec1);
        a.move(MoveDirection.RIGHT);
        Assertions.assertTrue(a.getDir() == MapDirection.EAST);
        a.move(MoveDirection.LEFT);
        Assertions.assertTrue(a.getDir() == MapDirection.NORTH);
    }
    @Test
    public void moveTest(){
        a.setPos(vec1);
        a.move(MoveDirection.BACKWARD);
        Assertions.assertTrue(a.getPos().y==3);
        a.move(MoveDirection.RIGHT);
        a.move(MoveDirection.BACKWARD);
        Assertions.assertTrue(a.getPos().x==3);
    }
    @Test
    public void moveBorderTest(){
        a.setPos(vec1);
        a.move(MoveDirection.FORWARD);
        Assertions.assertTrue(a.getPos().y<5 && a.getPos().y>=0);
        a.move(MoveDirection.RIGHT);
        a.move(MoveDirection.FORWARD);
        Assertions.assertTrue(a.getPos().x<5 && a.getPos().x>=0);
    }
    @Test
    public void parserTest(){
        ArrayList<MoveDirection> ans=new ArrayList<>();
        ans.add(MoveDirection.FORWARD);
        ans.add(MoveDirection.BACKWARD);
        ans.add(MoveDirection.RIGHT);
        ans.add(MoveDirection.LEFT);
        String[] s=new String[4];
        s[0]="f";
        s[1]="b";
        s[2]="r";
        s[3]="l";
        Assertions.assertEquals(OptionsParser.parse(s),ans);
    }*/
    /*
    @Test
    public void AnimalsTest(){
        ArrayList<MoveDirection> directions = OptionsParser.parse(new String[]{"f", "b", "r", "l", "f", "f", "r", "r", "f", "f", "b", "f", "f", "b", "f", "l", "f", "f", "r"});
        RectangularMap mapTest = new RectangularMap();
        Vector2d[] positions = { new Vector2d(2,2), new Vector2d(3,4), new Vector2d(6,1), new Vector2d(2,2)};
        IEngine engine = new SimulationEngine(directions, mapTest, positions);

        List<Animal> testObjects = mapTest.getA();
        assertEquals(testObjects.size(), 3);

        engine.run();

        assertEquals(testObjects.get(0).getPosition(), new Vector2d(2,5));
        assertEquals(testObjects.get(1).getPosition(), new Vector2d(3,4));
        assertEquals(testObjects.get(2).getPosition(), new Vector2d(8,1));

        assertEquals(testObjects.get(0).getDir(), MapDirection.NORTH);
        assertEquals(testObjects.get(1).getDir(), MapDirection.EAST);
        assertEquals(testObjects.get(2).getDir(), MapDirection.EAST);
    }*/
}
