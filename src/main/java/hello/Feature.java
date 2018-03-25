package hello;

import java.util.Map;

public class Feature {

    private String type;
    private Geometry geometry;
    private Map properties;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    public Map getProperties() {
        return properties;
    }

    public void setProperties(Map properties) {
        this.properties = properties;
    }

    public Feature() {}

    public Feature(String type, Geometry geo, Map props) {
        this.type = type;
        this.geometry = geo;
        this.properties = props;
    }
}
