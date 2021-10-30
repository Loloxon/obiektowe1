package agh.ics.oop;

public enum MapDirection {
    NORTH, SOUTH, WEST, EAST;
    public String toString(){
        switch(this){
            case NORTH: return "Północ";
            case EAST: return "Wschód";
            case SOUTH: return "Południe";
            case WEST: return "Zachód";
        }
        return "";
    }
    public MapDirection next(){
        switch(this){
            case NORTH: return EAST;
            case EAST: return SOUTH;
            case SOUTH: return WEST;
            case WEST: return NORTH;
            default: return NORTH;
        }
    }
    public MapDirection previous(){
        switch(this){
            case NORTH: return WEST;
            case EAST: return NORTH;
            case SOUTH: return EAST;
            case WEST: return SOUTH;
            default: return NORTH;
        }
    }
    public Vector2d toUnitVector(){
        return switch(this){
            case NORTH -> new Vector2d(0,1);
            case EAST -> new Vector2d(1,0);
            case SOUTH -> new Vector2d(0,-1);
            case WEST -> new Vector2d(-1,0);
        };
    }
//    posiada metodę toUnitVector, która zwraca jednostkowy wektor przemieszczenia typu Vector2d zgodny z orientacją na mapie, tzn. dla
//    NORTH wektor ten powinien mieć wartość (0,1), dla EAST (1,0), itd.
}
