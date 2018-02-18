import meetup.api.MessageProvider;
import meetup.goodbye.GoodbyeMessageProvider;

module meetup.goodbye {
    requires meetup.api;
    provides MessageProvider with GoodbyeMessageProvider;
}
