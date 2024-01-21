package de.cryptosdk.objects.definitions;

public class Account {

    // internal id
    private String id;

    // human friendly id
    private String title;

    // username for login
    private String username;

    // account password for login
    private String password;

    // account email for messages and account recovery
    private String email;

    // account MFA settings
    private String multiFactorAuthorisation;

    // urls to the services
    private String[] urls;

    // account id by provider e.g. customer id
    private String accountIdByProvider;

    // notices to the account e.g. extra information
    private String notices;
    
    // timestamp of this entry
    private long lastUpdate;
}
