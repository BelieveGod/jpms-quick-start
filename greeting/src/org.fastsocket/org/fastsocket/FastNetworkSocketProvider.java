package org.fastsocket;

import com.socket.NetworkSocket;
import com.socket.spi.NetworkSocketProvider;

/**
 * @author LTJ
 * @version 1.0
 * @date 2021/6/1 17:24
 */
public class FastNetworkSocketProvider extends NetworkSocketProvider {

    @Override
    public NetworkSocket openNetworkSocket() {
        return new FastNetworkSocket();
    }
}
