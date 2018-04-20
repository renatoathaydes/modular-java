/**
 * The core module of this Java Meetup Demo.
 */
module meetup.core {
    requires meetup.api;
    requires com.athaydes.protobuf_tcp_rpc;
    uses meetup.api.MessageProvider;
}
