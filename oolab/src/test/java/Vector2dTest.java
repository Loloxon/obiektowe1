import agh.ics.oop.MapDirection;
import agh.ics.oop.Vector2d;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Vector2dTest {
    Vector2d a = new Vector2d(1,2);
    Vector2d b = new Vector2d(-1,-2);
    Vector2d c = new Vector2d(5,1);
    Vector2d d = new Vector2d(6,3);
    @Test
    public void equalsTest(){
        Assertions.assertTrue(a.equals(a));
        Assertions.assertFalse(a.equals(b));
    }
    @Test
    public void toStringTest(){
        assertEquals("(1,2)", a.toString());
    }
    @Test
    public void precedesTest(){
        Assertions.assertTrue(b.precedes(a));
        Assertions.assertFalse(c.precedes(a));
    }
    @Test
    public void followsTest(){
        Assertions.assertTrue(a.follows(b));
        Assertions.assertFalse(c.follows(a));
    }
    @Test
    public void upperRightTest(){
        assertEquals(a, a.upperRight(b));
        assertEquals(d, c.upperRight(d));
    }
    @Test
    public void lowerLeftTest(){
        assertEquals(b, a.lowerLeft(b));
        assertEquals(c, c.lowerLeft(d));
    }
    @Test
    public void addTest(){
        assertEquals(d, a.add(c));
        assertEquals(d, c.add(a));
    }
    @Test
    public void subtractTest(){
        assertEquals(a, d.subtract(c));
        assertEquals(c, d.subtract(a));
    }
    @Test
    public void oppositeTest(){
        assertEquals(b, a.opposite());
    }
}
