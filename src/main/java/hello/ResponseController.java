package hello;

import java.util.concurrent.atomic.AtomicLong;

import hello.random.RandomResponse;
import hello.random.RandomTrafficForecast;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/sampleJson")
    public RandomResponse greeting(@RequestParam(value="content") String name) {
        if(StringUtils.isEmpty(name)) {
            return new RandomResponse(counter.incrementAndGet());
        } else {
            return new RandomResponse(counter.incrementAndGet(), name);
        }
    }

    @RequestMapping("/forecastSample")
    public RandomTrafficForecast trafficForecast() {
       return new RandomTrafficForecast();
    }

}
