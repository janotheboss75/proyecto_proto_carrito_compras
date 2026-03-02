package valdez.alejandro.carrito.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *GESTION DE INVENTARIO
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: carrito.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InventarioServiceGrpc {

  private InventarioServiceGrpc() {}

  public static final String SERVICE_NAME = "InventarioService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<valdez.alejandro.carrito.grpc.InventarioRequest,
      valdez.alejandro.carrito.grpc.InventarioResponse> getCargarInventarioMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cargarInventario",
      requestType = valdez.alejandro.carrito.grpc.InventarioRequest.class,
      responseType = valdez.alejandro.carrito.grpc.InventarioResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<valdez.alejandro.carrito.grpc.InventarioRequest,
      valdez.alejandro.carrito.grpc.InventarioResponse> getCargarInventarioMethod() {
    io.grpc.MethodDescriptor<valdez.alejandro.carrito.grpc.InventarioRequest, valdez.alejandro.carrito.grpc.InventarioResponse> getCargarInventarioMethod;
    if ((getCargarInventarioMethod = InventarioServiceGrpc.getCargarInventarioMethod) == null) {
      synchronized (InventarioServiceGrpc.class) {
        if ((getCargarInventarioMethod = InventarioServiceGrpc.getCargarInventarioMethod) == null) {
          InventarioServiceGrpc.getCargarInventarioMethod = getCargarInventarioMethod =
              io.grpc.MethodDescriptor.<valdez.alejandro.carrito.grpc.InventarioRequest, valdez.alejandro.carrito.grpc.InventarioResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "cargarInventario"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  valdez.alejandro.carrito.grpc.InventarioRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  valdez.alejandro.carrito.grpc.InventarioResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InventarioServiceMethodDescriptorSupplier("cargarInventario"))
              .build();
        }
      }
    }
    return getCargarInventarioMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InventarioServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventarioServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventarioServiceStub>() {
        @java.lang.Override
        public InventarioServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventarioServiceStub(channel, callOptions);
        }
      };
    return InventarioServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InventarioServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventarioServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventarioServiceBlockingStub>() {
        @java.lang.Override
        public InventarioServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventarioServiceBlockingStub(channel, callOptions);
        }
      };
    return InventarioServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InventarioServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InventarioServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InventarioServiceFutureStub>() {
        @java.lang.Override
        public InventarioServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InventarioServiceFutureStub(channel, callOptions);
        }
      };
    return InventarioServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *GESTION DE INVENTARIO
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void cargarInventario(valdez.alejandro.carrito.grpc.InventarioRequest request,
        io.grpc.stub.StreamObserver<valdez.alejandro.carrito.grpc.InventarioResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCargarInventarioMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service InventarioService.
   * <pre>
   *GESTION DE INVENTARIO
   * </pre>
   */
  public static abstract class InventarioServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InventarioServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service InventarioService.
   * <pre>
   *GESTION DE INVENTARIO
   * </pre>
   */
  public static final class InventarioServiceStub
      extends io.grpc.stub.AbstractAsyncStub<InventarioServiceStub> {
    private InventarioServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventarioServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventarioServiceStub(channel, callOptions);
    }

    /**
     */
    public void cargarInventario(valdez.alejandro.carrito.grpc.InventarioRequest request,
        io.grpc.stub.StreamObserver<valdez.alejandro.carrito.grpc.InventarioResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCargarInventarioMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service InventarioService.
   * <pre>
   *GESTION DE INVENTARIO
   * </pre>
   */
  public static final class InventarioServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InventarioServiceBlockingStub> {
    private InventarioServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventarioServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventarioServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public valdez.alejandro.carrito.grpc.InventarioResponse cargarInventario(valdez.alejandro.carrito.grpc.InventarioRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCargarInventarioMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service InventarioService.
   * <pre>
   *GESTION DE INVENTARIO
   * </pre>
   */
  public static final class InventarioServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<InventarioServiceFutureStub> {
    private InventarioServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InventarioServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InventarioServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<valdez.alejandro.carrito.grpc.InventarioResponse> cargarInventario(
        valdez.alejandro.carrito.grpc.InventarioRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCargarInventarioMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CARGAR_INVENTARIO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CARGAR_INVENTARIO:
          serviceImpl.cargarInventario((valdez.alejandro.carrito.grpc.InventarioRequest) request,
              (io.grpc.stub.StreamObserver<valdez.alejandro.carrito.grpc.InventarioResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCargarInventarioMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              valdez.alejandro.carrito.grpc.InventarioRequest,
              valdez.alejandro.carrito.grpc.InventarioResponse>(
                service, METHODID_CARGAR_INVENTARIO)))
        .build();
  }

  private static abstract class InventarioServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InventarioServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return valdez.alejandro.carrito.grpc.Carrito.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InventarioService");
    }
  }

  private static final class InventarioServiceFileDescriptorSupplier
      extends InventarioServiceBaseDescriptorSupplier {
    InventarioServiceFileDescriptorSupplier() {}
  }

  private static final class InventarioServiceMethodDescriptorSupplier
      extends InventarioServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    InventarioServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (InventarioServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InventarioServiceFileDescriptorSupplier())
              .addMethod(getCargarInventarioMethod())
              .build();
        }
      }
    }
    return result;
  }
}
