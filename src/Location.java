/**
 * This class represents a specific location in a 2D map.  Coordinates are
 * integer values.
 **/
public class Location
{
    /** X coordinate of this location. **/
    public int xCoord;

    /** Y coordinate of this location. **/
    public int yCoord;

    /** Creates a new location with the specified integer coordinates. **/
    public Location(int x, int y)
    {
        xCoord = x;
        yCoord = y;
    }

    /** Creates a new location with coordinates (0, 0). **/
    public Location()
    {
        this(0, 0);
    }

    public boolean equals(Location Loc){
        return (Loc.xCoord == this.xCoord)&&(Loc.yCoord == this.yCoord);
    }

    public int hashCode(){

        int result = 17;
        int x = xCoord; int y = yCoord;
        if (x == 0) x = 37000;
        if (y == 0) y = 86500000;
        result = 1000 * result * xCoord;
        result = 1000 * result * yCoord;
        return result;
    }
}