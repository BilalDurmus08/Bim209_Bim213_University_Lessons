package W5_Good_Design_Flexible_Software;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List inventory;
    public Inventory(){
        inventory = new LinkedList();
    }
    public void addInstrument(String serialNumber, double price, InstrumentSpec spec){
        Instrument instrument = null;
        if (spec instanceof GuitarSpec){
            instrument = new Guitar(serialNumber, price, (GuitarSpec) spec);
        } else if (spec instanceof  MandolinSpec) {
            instrument = new Mandolin(serialNumber, price, (MandolinSpec) spec);
        }
        inventory.add(instrument);
    }
    public Instrument get(String serialNumber){
        for (Iterator iterator = inventory.iterator(); iterator.hasNext(); ){
            Instrument instrument = (Instrument) iterator.next();
            if (instrument.getSerialNumber().equals(serialNumber)){
                return instrument;
            }
        }
   return null;
    }

    public List search (MandolinSpec spec){
        List matchingMandolins = new LinkedList();
        for (Iterator iterator = inventory.iterator(); iterator.hasNext(); ) {
            Instrument instrument = (Instrument) iterator.next();
            if (instrument instanceof Mandolin  && instrument.getSpec().equals(spec)){
                matchingMandolins.add(instrument);
            }

        }
        return matchingMandolins;

    }





}
