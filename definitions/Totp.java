package de.cryptosdk.objects.definitions;

/**
 * Based on RFC 6238
 *
 * How to use TOTP see also <a href="https://github.com/user9209/qrtan/blob/master/src/main/java/de/cryptosdk/totp/QrTan.java">example</a>.
 *
 * Base32 lib e.g. org.apache.commons.codec.binary.Base32;
 *
 * calc: e.g. currentBucket = Math.floorDiv(getTime(), getTimePeriod())
 */
public class Totp {

    // internal id
    private String id;

    // human friendly id, label for entry
    private String label;

    // service issued MFA
    private String issuer;

    // secret, by default 32 chars in base32 encoding
    private String secret;

    // url to the service
    private String url;

    // time to refresh pin default 30 sec
    private int timePeriod = 30;

    // Hashing algorithm, default SHA1
    private String hash = "SHA1";

    // length of the pin, default 6, better 8
    private int digitLength = 6;

    // secret length, default 32, better 64
    private int secretLength = 32;

    // timestamp of this entry
    private long lastUpdate;
}
