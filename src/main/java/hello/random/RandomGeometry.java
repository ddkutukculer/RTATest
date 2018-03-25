package hello.random;

import hello.Geometry;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class RandomGeometry  extends Geometry {

    public RandomGeometry () {
        super(RandomStringUtils.randomAlphabetic(10), getRandomFloatArray());
    }

    private static float[] getRandomFloatArray() {

        int i = RandomUtils.nextInt(6, 10);
        float[] coord = new float[i];
        for(int j=0;j<i;j++)
            coord[j] = RandomUtils.nextFloat();

       return coord;
    }
}
