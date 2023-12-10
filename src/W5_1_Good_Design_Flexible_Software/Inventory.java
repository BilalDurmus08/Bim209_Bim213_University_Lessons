package W5_1_Good_Design_Flexible_Software;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Instrument> inventory;
    public Inventory(){
        inventory = new LinkedList<>();
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
        for (Iterator<Instrument> iterator = inventory.iterator(); iterator.hasNext(); ){
            Instrument instrument = iterator.next();
            if (instrument.getSerialNumber().equals(serialNumber)){
                return instrument;
            }
        }
   return null;
    }

    public List search (InstrumentSpec spec){
        List<Instrument> matchingInstruments = new LinkedList<Instrument>();
        for (Iterator<Instrument> iterator = inventory.iterator(); iterator.hasNext(); ) {
            Instrument instrument = iterator.next();
            if (instrument.getSpec().equals(spec)){
                matchingInstruments.add(instrument);
            }

        }
        return matchingInstruments;

    }





}
