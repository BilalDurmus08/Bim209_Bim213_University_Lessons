package W5_1_Good_Design_Flexible_Software;

public enum Type {

    ACOUSTIC, ELECTRIC;

    public String toString() {
        switch(this) {
            case ACOUSTIC: return "acoustic";
            case ELECTRIC: return "electric";
            default:       return "unspecified";
        }
    }
}
