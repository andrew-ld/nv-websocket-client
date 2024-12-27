package com.neovisionaries.ws.client;

import java.net.InetAddress;
import java.net.UnknownHostException;

public interface IDns {
    InetAddress[] resolve(String domain) throws UnknownHostException;
}
