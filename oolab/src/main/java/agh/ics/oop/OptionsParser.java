package agh.ics.oop;
import java.util.ArrayList;

public class OptionsParser {
    public static ArrayList<MoveDirection> parse(String[] args){
        ArrayList<MoveDirection>A=new ArrayList<>();
        for(String arg:args){
            switch (arg) {
                case "f", "forward" -> A.add(MoveDirection.FORWARD);
                case "b", "backward" -> A.add(MoveDirection.BACKWARD);
                case "r", "right" -> A.add(MoveDirection.RIGHT);
                case "l", "left" -> A.add(MoveDirection.LEFT);
            }
        }
        return A;
    }
}
