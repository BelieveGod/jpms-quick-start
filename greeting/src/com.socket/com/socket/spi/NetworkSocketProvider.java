package com.socket.spi;

import com.socket.NetworkSocket;

/**
 * @author LTJ
 * @version 1.0
 * @date 2021/6/1 17:19
 */
public abstract  class NetworkSocketProvider {
    protected NetworkSocketProvider() { }
    public abstract NetworkSocket openNetworkSocket();
}
