import meetup.api.MessageProvider;
import meetup.hello.HelloMessageProvider;

module meetup.hello {
    requires meetup.api;
    provides MessageProvider with HelloMessageProvider;
}
