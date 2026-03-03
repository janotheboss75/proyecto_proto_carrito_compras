package valdez.alejandro.carrito.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *GESTION DE PRODUCTOS
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: carrito.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProductoServiceGrpc {

  private ProductoServiceGrpc() {}

  public static final String SERVICE_NAME = "ProductoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<valdez.alejandro.carrito.grpc.ProductoRequest,
      valdez.alejandro.carrito.grpc.ProductoResponse> getListarProductosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listarProductos",
      requestType = valdez.alejandro.carrito.grpc.ProductoRequest.class,
      responseType = valdez.alejandro.carrito.grpc.ProductoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<valdez.alejandro.carrito.grpc.ProductoRequest,
      valdez.alejandro.carrito.grpc.ProductoResponse> getListarProductosMethod() {
    io.grpc.MethodDescriptor<valdez.alejandro.carrito.grpc.ProductoRequest, valdez.alejandro.carrito.grpc.ProductoResponse> getListarProductosMethod;
    if ((getListarProductosMethod = ProductoServiceGrpc.getListarProductosMethod) == null) {
      synchronized (ProductoServiceGrpc.class) {
        if ((getListarProductosMethod = ProductoServiceGrpc.getListarProductosMethod) == null) {
          ProductoServiceGrpc.getListarProductosMethod = getListarProductosMethod =
              io.grpc.MethodDescriptor.<valdez.alejandro.carrito.grpc.ProductoRequest, valdez.alejandro.carrito.grpc.ProductoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listarProductos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  valdez.alejandro.carrito.grpc.ProductoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  valdez.alejandro.carrito.grpc.ProductoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductoServiceMethodDescriptorSupplier("listarProductos"))
              .build();
        }
      }
    }
    return getListarProductosMethod;
  }

  private static volatile io.grpc.MethodDescriptor<valdez.alejandro.carrito.grpc.ProductoRequest,
      valdez.alejandro.carrito.grpc.ProductoResponse> getEscucharNuevosProductosMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "escucharNuevosProductos",
      requestType = valdez.alejandro.carrito.grpc.ProductoRequest.class,
      responseType = valdez.alejandro.carrito.grpc.ProductoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<valdez.alejandro.carrito.grpc.ProductoRequest,
      valdez.alejandro.carrito.grpc.ProductoResponse> getEscucharNuevosProductosMethod() {
    io.grpc.MethodDescriptor<valdez.alejandro.carrito.grpc.ProductoRequest, valdez.alejandro.carrito.grpc.ProductoResponse> getEscucharNuevosProductosMethod;
    if ((getEscucharNuevosProductosMethod = ProductoServiceGrpc.getEscucharNuevosProductosMethod) == null) {
      synchronized (ProductoServiceGrpc.class) {
        if ((getEscucharNuevosProductosMethod = ProductoServiceGrpc.getEscucharNuevosProductosMethod) == null) {
          ProductoServiceGrpc.getEscucharNuevosProductosMethod = getEscucharNuevosProductosMethod =
              io.grpc.MethodDescriptor.<valdez.alejandro.carrito.grpc.ProductoRequest, valdez.alejandro.carrito.grpc.ProductoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "escucharNuevosProductos"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  valdez.alejandro.carrito.grpc.ProductoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  valdez.alejandro.carrito.grpc.ProductoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductoServiceMethodDescriptorSupplier("escucharNuevosProductos"))
              .build();
        }
      }
    }
    return getEscucharNuevosProductosMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductoServiceStub>() {
        @java.lang.Override
        public ProductoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductoServiceStub(channel, callOptions);
        }
      };
    return ProductoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductoServiceBlockingStub>() {
        @java.lang.Override
        public ProductoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductoServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductoServiceFutureStub>() {
        @java.lang.Override
        public ProductoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductoServiceFutureStub(channel, callOptions);
        }
      };
    return ProductoServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *GESTION DE PRODUCTOS
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void listarProductos(valdez.alejandro.carrito.grpc.ProductoRequest request,
        io.grpc.stub.StreamObserver<valdez.alejandro.carrito.grpc.ProductoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListarProductosMethod(), responseObserver);
    }

    /**
     */
    default void escucharNuevosProductos(valdez.alejandro.carrito.grpc.ProductoRequest request,
        io.grpc.stub.StreamObserver<valdez.alejandro.carrito.grpc.ProductoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEscucharNuevosProductosMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ProductoService.
   * <pre>
   *GESTION DE PRODUCTOS
   * </pre>
   */
  public static abstract class ProductoServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ProductoServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ProductoService.
   * <pre>
   *GESTION DE PRODUCTOS
   * </pre>
   */
  public static final class ProductoServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ProductoServiceStub> {
    private ProductoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductoServiceStub(channel, callOptions);
    }

    /**
     */
    public void listarProductos(valdez.alejandro.carrito.grpc.ProductoRequest request,
        io.grpc.stub.StreamObserver<valdez.alejandro.carrito.grpc.ProductoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListarProductosMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void escucharNuevosProductos(valdez.alejandro.carrito.grpc.ProductoRequest request,
        io.grpc.stub.StreamObserver<valdez.alejandro.carrito.grpc.ProductoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getEscucharNuevosProductosMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ProductoService.
   * <pre>
   *GESTION DE PRODUCTOS
   * </pre>
   */
  public static final class ProductoServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ProductoServiceBlockingStub> {
    private ProductoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<valdez.alejandro.carrito.grpc.ProductoResponse> listarProductos(
        valdez.alejandro.carrito.grpc.ProductoRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListarProductosMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<valdez.alejandro.carrito.grpc.ProductoResponse> escucharNuevosProductos(
        valdez.alejandro.carrito.grpc.ProductoRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getEscucharNuevosProductosMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ProductoService.
   * <pre>
   *GESTION DE PRODUCTOS
   * </pre>
   */
  public static final class ProductoServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ProductoServiceFutureStub> {
    private ProductoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductoServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_LISTAR_PRODUCTOS = 0;
  private static final int METHODID_ESCUCHAR_NUEVOS_PRODUCTOS = 1;

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
        case METHODID_LISTAR_PRODUCTOS:
          serviceImpl.listarProductos((valdez.alejandro.carrito.grpc.ProductoRequest) request,
              (io.grpc.stub.StreamObserver<valdez.alejandro.carrito.grpc.ProductoResponse>) responseObserver);
          break;
        case METHODID_ESCUCHAR_NUEVOS_PRODUCTOS:
          serviceImpl.escucharNuevosProductos((valdez.alejandro.carrito.grpc.ProductoRequest) request,
              (io.grpc.stub.StreamObserver<valdez.alejandro.carrito.grpc.ProductoResponse>) responseObserver);
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
          getListarProductosMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              valdez.alejandro.carrito.grpc.ProductoRequest,
              valdez.alejandro.carrito.grpc.ProductoResponse>(
                service, METHODID_LISTAR_PRODUCTOS)))
        .addMethod(
          getEscucharNuevosProductosMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              valdez.alejandro.carrito.grpc.ProductoRequest,
              valdez.alejandro.carrito.grpc.ProductoResponse>(
                service, METHODID_ESCUCHAR_NUEVOS_PRODUCTOS)))
        .build();
  }

  private static abstract class ProductoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return valdez.alejandro.carrito.grpc.Carrito.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductoService");
    }
  }

  private static final class ProductoServiceFileDescriptorSupplier
      extends ProductoServiceBaseDescriptorSupplier {
    ProductoServiceFileDescriptorSupplier() {}
  }

  private static final class ProductoServiceMethodDescriptorSupplier
      extends ProductoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductoServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProductoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductoServiceFileDescriptorSupplier())
              .addMethod(getListarProductosMethod())
              .addMethod(getEscucharNuevosProductosMethod())
              .build();
        }
      }
    }
    return result;
  }
}
