package hello;

public class SampleTrafficForecastLR {

    private String type;
    private Feature[] features;

    public SampleTrafficForecastLR()  {}

    public SampleTrafficForecastLR(String type, Feature[] features) {
        this.type = type;
        this.features = features;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Feature[] getFeatures() {
        return features;
    }

    public void setFeatures(Feature[] features) {
        this.features = features;
    }
}
