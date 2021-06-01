package com.greetings;

import com.socket.NetworkSocket;
import org.astro.World;

/**
 * @author LTJ
 * @version 1.0
 * @date 2021/6/1 16:39
 */
public class Main {
    public static void main(String[] args) {
        System.out.format("Greetings %s!%n", World.name());
        NetworkSocket s = NetworkSocket.open();
        System.out.println(s.getClass());
    }
}
