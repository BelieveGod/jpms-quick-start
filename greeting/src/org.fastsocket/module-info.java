/**
 * @author LTJ
 * @date 2021/6/1 17:23
 * @version 1.0
 */module org.fastsocket {
     requires com.socket;
     provides com.socket.spi.NetworkSocketProvider
             with org.fastsocket.FastNetworkSocketProvider;

}
