package W5_2_Good_Design_Flexible_Software;

public enum InstrumentType {

    GUITAR, BANJO, DOBRO, FIDDLE, BASS, MANDOLIN;

    public String toString() {
        switch(this) {
            case GUITAR:   return "Guitar";
            case BANJO:    return "Banjo";
            case DOBRO:    return "Dobro";
            case FIDDLE:   return "Fiddle";
            case BASS:     return "Bass";
            case MANDOLIN: return "Mandolin";
            default:       return "Unspecified";
        }
    }
}
