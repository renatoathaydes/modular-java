package meetup.core;

import com.athaydes.protobuf.tcp.api.RemoteServices;
import meetup.api.MessageProvider;

import java.io.Closeable;
import java.io.IOException;

public class RemoteMain {
    public static void main( String[] args ) throws IOException {
        MessageProvider remoteMessageProvider = RemoteServices.createClient(
                MessageProvider.class, "localhost", 8099 );

        System.out.println( remoteMessageProvider.getMessage() );

        ( ( Closeable ) remoteMessageProvider ).close();
    }
}
