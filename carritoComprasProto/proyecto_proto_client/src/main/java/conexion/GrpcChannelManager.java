package conexion;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

/**
 *
 * @author janot
 */
public class GrpcChannelManager {

    private static final String HOST = "localhost";
    private static final int PORT = 55051;

    private static ManagedChannel channel;

    private GrpcChannelManager() {}

    public static ManagedChannel getChannel() {
        if (channel == null) {
            channel = ManagedChannelBuilder
                    .forAddress(HOST, PORT)
                    .usePlaintext()
                    .build();
        }
        return channel;
    }

    public static void shutdown() {
        if (channel != null) {
            channel.shutdown();
        }
    }
}