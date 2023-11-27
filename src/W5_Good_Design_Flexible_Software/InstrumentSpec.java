package W5_Good_Design_Flexible_Software;

public class InstrumentSpec {
    Builder builder;
    String model;
    Type type;
    Wood backWood;
    Wood topWood;

    public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public boolean matches(InstrumentSpec otherSpec){
        if (builder != otherSpec.builder)
            return false;
        if (model != null && !model.equals("") && !model.equals(otherSpec.model))
            return false;
        if (type != otherSpec.type)
            return false;
        if (backWood != otherSpec.backWood)
            return false;
        if (topWood != otherSpec.topWood){
            return false;
        }

        return true;
    }



}
