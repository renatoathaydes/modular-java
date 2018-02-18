/**
 * The core module of this Java Meetup Demo.
 */
module meetup.core {
    requires meetup.api;
    requires protobuf.tcp.rpc;
    uses meetup.api.MessageProvider;
}
