package pl.ostrowski.apigatewaydemo.properties.propertybrowser.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Property {

    private int id;
    private String title;
    private String description;
    private Contact contact;
}
