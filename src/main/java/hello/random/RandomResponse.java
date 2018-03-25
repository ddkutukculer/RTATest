package hello.random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomResponse {
    private final long id;
    private final String content;

    public RandomResponse(long id) {
        this.id = id;
        this.content = RandomStringUtils.randomAlphanumeric(15,300);
    }
    public RandomResponse(long id, String content) {
        this.id = id;
        this.content = content;
    }
    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
