import meetup.api.MessageProvider;
import meetup.hello.HelloMessageProvider;

module meetup.hello {
    requires meetup.api;
    requires protobuf.tcp.rpc;
    provides MessageProvider with HelloMessageProvider;
}
