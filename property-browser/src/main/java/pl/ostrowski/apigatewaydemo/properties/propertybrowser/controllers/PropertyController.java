package pl.ostrowski.apigatewaydemo.properties.propertybrowser.controllers;

import pl.ostrowski.apigatewaydemo.properties.propertybrowser.model.Property;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.ostrowski.apigatewaydemo.properties.propertybrowser.services.MockPropertyService;

import java.util.List;

@RestController
public class PropertyController {

    @Autowired
    private MockPropertyService mockPropertyService;

    @GetMapping("/properties")
    public ResponseEntity<List<Property>> listOfProperties() {
        return ResponseEntity.ok(mockPropertyService.getPropertiesList());
    }

}
