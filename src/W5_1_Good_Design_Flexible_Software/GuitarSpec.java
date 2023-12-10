package W5_1_Good_Design_Flexible_Software;

public class GuitarSpec extends InstrumentSpec {
    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type, int numStrings, Wood backWood, Wood topWood) {
        super(builder, model, type, backWood, topWood);
        this.numStrings = numStrings;
    }

    @Override
    public boolean matches(InstrumentSpec otherSpec) {
        if (!(super.matches(otherSpec)))
            return false;
        if (!(otherSpec instanceof GuitarSpec))
            return false;
        GuitarSpec guitarSpec = (GuitarSpec) otherSpec;
        if (numStrings !=  guitarSpec.numStrings) {
            return false;
        }
        return true;
    }


}
