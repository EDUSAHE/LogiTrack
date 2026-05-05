package com.edusahe.logitrack.utils;

import java.time.LocalDateTime;

public class TrackingGuideGenerator {
    private TrackingGuideGenerator() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static String trackingGuideGenerator() {
        LocalDateTime now = LocalDateTime.now();
        //System.out.println(now.toString());
        return now.toString();
    }

}
