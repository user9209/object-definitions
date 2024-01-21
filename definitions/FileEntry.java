package de.cryptosdk.objects.definitions;

public class FileEntry {

    // internal id
    private String id;

    // human friendly id
    private String title;

    // filename
    private String filename;

    // file location, e.g. cloud storage, folder, drive, net address, ...
    private String fileLocation;

    // hash of the file, e.g. sha256:xxxx
    private String hash;

    // password for the file or credentials e.g. as json
    private String password;

    // file type e.g. pdf, veracrypt container, 7z
    private String fileType;

    // file size in bytes
    private long fileSize;

    // timestamp of this entry
    private long lastUpdate;
}
