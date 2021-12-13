package agh.ics.oop;
import java.util.ArrayList;
import java.util.List;

public class OptionsParser {
    public static ArrayList<MoveDirection> parse(String args){
        ArrayList<MoveDirection>A=new ArrayList<>();
        for(int i=0;i<args.length();i++){
            switch (args.charAt(i)) {
                case 'f':
                    A.add(MoveDirection.FORWARD);
                    break;
                case 'b':
                    A.add(MoveDirection.BACKWARD);
                    break;
                case 'r':
                    A.add(MoveDirection.RIGHT);
                    break;
                case 'l':
                    A.add(MoveDirection.LEFT);
                    break;
                case ' ':
                    break;
                default:
                    throw new IllegalArgumentException(args.charAt(i) + " is not legal move specification");
            }
        }
        return A;
    }
}
