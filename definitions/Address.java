package de.cryptosdk.objects.definitions;

public class Address {

    // internal id
    private String id;

    // human friendly id
    private String title;

    // address name or id e.g. ABC Inc.
    private String name;

    // additional information e.g. 3rd floor
    private String additionalInformation;

    // street
    private String street;

    // street number e.g. 123b
    // not only numbers also chars possible in Germany
    private String streetNumber;

    // Zip code / PLZ (DE)
    // may not be only digits
    private String zipCode;

    // city or village
    private String city;

    // timestamp of this entry
    private long lastUpdate;
}
