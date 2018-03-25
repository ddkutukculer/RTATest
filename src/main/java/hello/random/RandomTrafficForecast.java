package hello.random;

import hello.Feature;
import hello.SampleTrafficForecastLR;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class RandomTrafficForecast extends SampleTrafficForecastLR {

    public RandomTrafficForecast() {
        super(RandomStringUtils.randomAlphabetic(5,15),getRandomFeatures());
    }

    private static Feature[] getRandomFeatures() {

        int size = RandomUtils.nextInt(2,5);
        Feature[] feats = new Feature[size];
        for(int i = 0; i < size; i++) {
            feats[i] = new RandomFeature();
        }
        return feats;
    }

}
