import meetup.api.MessageProvider;
import meetup.hello.HelloMessageProvider;

module meetup.hello {
    requires meetup.api;
    requires com.athaydes.protobuf_tcp_rpc;
    provides MessageProvider with HelloMessageProvider;
}
