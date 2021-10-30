import agh.ics.oop.MapDirection;
import agh.ics.oop.MoveDirection;
import agh.ics.oop.Vector2d;
import agh.ics.oop.Animal;
import agh.ics.oop.OptionsParser;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import javax.swing.text.html.Option;
import java.util.ArrayList;


public class AnimalTest {
    Animal a = new Animal();
    Vector2d vec1 = new Vector2d(4,4);
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
    }
}
