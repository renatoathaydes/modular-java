package meetup.hello.internal;

import com.athaydes.protobuf.tcp.api.RemoteServices;
import meetup.api.MessageProvider;
import meetup.hello.HelloMessageProvider;

import java.io.Closeable;
import java.io.IOException;

public class HelloRemoteMessageProvider {
    public static void main( String[] args ) throws IOException {
        Closeable server = RemoteServices.provideService(
                new HelloMessageProvider(), 8099, MessageProvider.class );

        System.out.println( "Server running on port 8099" );

        System.in.read();

        System.out.println( "Stopping server" );
        server.close();
    }
}
