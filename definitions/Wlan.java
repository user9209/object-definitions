package de.cryptosdk.objects.definitions;

public class Wlan {

    // internal id
    private String id;

    // human friendly id
    private String title;

    // wlan ssid
    private String ssid;

    // wlan password for wpa 2/3
    private String password;

    // geolocation of the network
    private String location;

    // timestamp of this entry
    private long lastUpdate;
}
