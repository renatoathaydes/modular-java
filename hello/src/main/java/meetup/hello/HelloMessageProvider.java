package meetup.hello;

import meetup.api.MessageProvider;

public class HelloMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Hello Java Meetup!";
    }

}
