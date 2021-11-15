package agh.ics.oop;

public class Animal implements IMapElement{
    private MapDirection dir = MapDirection.NORTH;
    private Vector2d position;
    private IWorldMap map;
    public Animal(IWorldMap map, Vector2d initialPosition){
        this.map=map;
        this.position=initialPosition;
    }
    public Vector2d getPosition(){return position;}
    public void setPos(Vector2d pos){position=pos;}
    public MapDirection getDir(){
        return dir;
    }
    public String toString(){
        if(dir==MapDirection.NORTH) return "^";
        if(dir==MapDirection.EAST) return ">";
        if(dir==MapDirection.SOUTH) return "v";
        return "<";
    }
    public void move(MoveDirection direction){
        Vector2d add = dir.toUnitVector();
        switch(direction){
            case LEFT:
                dir=dir.previous();
                break;
            case RIGHT:
                dir=dir.next();
                break;
            case FORWARD:
                if(map.canMoveTo(position.add(add)))
                    position=position.add(add);
                break;
            case BACKWARD:
                if(map.canMoveTo(position.subtract(add)))
                    position=position.subtract(add);
                break;
        }
    }
}
