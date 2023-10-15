package W1_Well_Designed_Apps_Rock.Step1_qwer;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class Inventory {
    private List guitars;

    public Inventory() {
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, double price,
                           GuitarSpec guitarSpec) {
        Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {

        for (Iterator iterator = guitars.iterator(); iterator.hasNext(); ) {

            Guitar guitar = (Guitar) iterator.next();

            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;

    }

    public List search(GuitarSpec guitarSpec) {
       List matchingGuitars = new LinkedList();
       for (Iterator iterator = guitars.iterator(); iterator.hasNext(); ){
            Guitar guitar = (Guitar) iterator.next();
            if (guitar.getSpec().matches(guitarSpec)){
                matchingGuitars.add(guitar);
            }
       }
       return matchingGuitars;

    }

}
