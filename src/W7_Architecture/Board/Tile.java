package W7_Architecture.Board;

import W7_Architecture.Unit.Unit;

import java.util.LinkedList;
import java.util.List;

public class Tile {

    private List units;

    public Tile() {
        units = new LinkedList();
    }

    protected void addUnit(Unit unit) {
        units.add(unit);
    }

    protected void removeUnit(Unit unit) {
        units.remove(unit);
    }
    protected void removeUnit() {

    }
    protected List getUnits()
    {
        return units;
    }


}
