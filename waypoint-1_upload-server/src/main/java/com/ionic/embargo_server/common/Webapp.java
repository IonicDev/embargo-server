package com.ionic.embargo_server.common;

import java.io.File;

/**
 * Webapp file management utility functions.
 */
public class Webapp {

    public static File getFileSEP() {
        final File folderCatalinaBase = new File(System.getProperty("catalina.base"));
        final File folderRepo = new File(folderCatalinaBase, "../..");
        return new File(folderRepo, "sep.json");
    }

    public static File getFileEmbargoMetadata() {
        final File folderCatalinaBase = new File(System.getProperty("catalina.base"));
        final File folderRepo = new File(folderCatalinaBase, "../..");
        return new File(folderRepo, "embargo.properties");
    }

    public static File getFolderEmbargoContent() {
        final File folderCatalinaBase = new File(System.getProperty("catalina.base"));
        return new File(folderCatalinaBase, "../../ionic");
    }

    public static String getEmbargoURI(final String filename) {
        return String.format("/ionic/embargo/%s", filename);
    }
}
