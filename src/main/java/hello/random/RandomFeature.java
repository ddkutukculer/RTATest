package hello.random;

import hello.Feature;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.HashMap;
import java.util.Map;

public class RandomFeature extends Feature {

    public RandomFeature() {
        super(RandomStringUtils.randomAlphabetic(10), new RandomGeometry(), getRandomMap());
    }

    static Map getRandomMap() {
        Map map = new HashMap<>();
        int size = RandomUtils.nextInt(2,10);
        for(int i=0 ;i<size;i++ ){
            map.put(RandomStringUtils.randomAlphanumeric(2,20), RandomStringUtils.randomAlphanumeric(2,20));
        }
        return map;
    }
}
