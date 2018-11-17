package pl.ostrowski.apigatewaydemo.properties.propertybrowser.services;

import pl.ostrowski.apigatewaydemo.properties.propertybrowser.model.Property;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MockPropertyService {

    private static List<Property> properties = new ArrayList<Property>();

    static {
        properties.add(new Property(1, "Działka 1000m2", "", null));
        properties.add(new Property(2, "Mieszkanie 89m2", "", null));
        properties.add(new Property(3, "Dom 200m2", "", null));
        properties.add(new Property(4, "Pole z marchwia 4 hektary", "", null));
        properties.add(new Property(5, "Jezioro", "", null));
        properties.add(new Property(6, "Chata drewniana", "", null));
    }

    public List<Property> getPropertiesList() {
        return properties;
    }

}
