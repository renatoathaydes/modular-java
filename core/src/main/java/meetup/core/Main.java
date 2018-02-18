package meetup.core;

import meetup.api.MessageProvider;

import java.util.ServiceLoader;

public class Main {

    public static void main( String[] args ) {
        ServiceLoader<MessageProvider> serviceLoader = ServiceLoader.load( MessageProvider.class );
        for ( MessageProvider provider : serviceLoader ) {
            System.out.println( provider.getMessage() );
        }
    }

}
