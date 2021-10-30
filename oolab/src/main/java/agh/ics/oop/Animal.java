package agh.ics.oop;

public class Animal {
    private MapDirection dir = MapDirection.NORTH;
    private Vector2d position = new Vector2d(2,2);
    public Vector2d getPos(){
        return position;
    }
    public void setPos(Vector2d npos){
        position=npos;
    }
    public MapDirection getDir(){
        return dir;
    }
    public String toString(){
        return dir+", "+position;
    }
    public void move(MoveDirection direction){
        Vector2d add;
        switch(direction){
            case LEFT:
                dir=dir.previous();
                break;
            case RIGHT:
                dir=dir.next();
                break;
            case FORWARD:
                add=dir.toUnitVector();
                position=position.add(add);
                break;
            case BACKWARD:
                add=dir.toUnitVector();
                position=position.subtract(add);
                break;
        }
        switch(position.x){
            case 5:
                position=position.subtract(new Vector2d(1,0));
                break;
            case -1:
                position=position.add(new Vector2d(1,0));
                break;
        }
        switch(position.y){
            case 5:
                position=position.subtract(new Vector2d(0,1));
                break;
            case -1:
                position=position.add(new Vector2d(0,1));
                break;
        }
    }
}
