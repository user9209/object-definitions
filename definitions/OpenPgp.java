package de.cryptosdk.objects.definitions;

public class OpenPgp {

    // internal id
    private String id;

    // human friendly id
    private String title;

    // user information
    private String[] userId;

    // email addresses
    private String[] email;

    // data of the certificate
    private String certData;

    // data of the private key in encrypted form
    private String privateKeyData;

    // timestamp of this entry
    private long lastUpdate;
}
