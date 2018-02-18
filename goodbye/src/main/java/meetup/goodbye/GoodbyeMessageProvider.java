package meetup.goodbye;

import meetup.api.MessageProvider;

public class GoodbyeMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Goodbye Java Meetup!";
    }

}
