package agh.ics.oop;
import java.util.ArrayList;

public class World {
    public static void main(String[] args){
        Animal an = new Animal();
        ArrayList<MoveDirection>A;
        A = OptionsParser.parse(args);
        for(MoveDirection i:A) {
            an.move(i);
        }
        System.out.println(an);
    }
}

//bermaj@gmail.com