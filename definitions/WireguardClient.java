package de.cryptosdk.objects.definitions;

public class WireguardClient {

    // internal id
    private String id;

    // human friendly id
    private String title;

    // user information
    private String privateKey;

    // client addresses
    private String[] clientIp;

    // dns servers
    private String[] dnsServer;

    // public key of the gateway
    private String peerPublicKey;

    // optional pre shared symmetric key
    private String presharedKey;

    // allowed networks and addresses
    private String[] allowedIPs;

    // endpoint incl. port number
    // ipv4, ipv6, dns-name, port
    private String endpoint;

    // keep a live, default 25 sec
    private int persistentKeepalive;

    // timestamp of this entry
    private long lastUpdate;
}
