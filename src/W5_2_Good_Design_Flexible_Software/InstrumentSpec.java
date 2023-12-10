package W5_2_Good_Design_Flexible_Software;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InstrumentSpec {
    public Map properties;

    public InstrumentSpec(Map properties) {
        if (properties == null) {
            this.properties = new HashMap<>();
        } else {
            this.properties = new HashMap(properties);
        }
    }

    public Object getProperty(String property) {
        return properties.get(property);
    }

    public Map getProperties() {
        return properties;
    }

    public boolean matches(InstrumentSpec otherSpec) {
        for (Iterator iterator = otherSpec.getProperties().keySet().iterator();
             iterator.hasNext();) {
                String propertyName = (String) iterator.next();
            if (!(getProperty(propertyName).equals(otherSpec.getProperty(propertyName)))){
                return false;
            }
        }
return true;
    }

}


