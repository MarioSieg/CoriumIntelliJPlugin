package de.pinsrq.sdk.corium.module;

import org.apache.commons.lang.SystemUtils;

public class CoriumSdkHelper {

    private CoriumSdkHelper() { }

    public static String concatExecutableName(final String baseName) {
        return SystemUtils.IS_OS_WINDOWS ? baseName + ".exe" : baseName;
    }
}
