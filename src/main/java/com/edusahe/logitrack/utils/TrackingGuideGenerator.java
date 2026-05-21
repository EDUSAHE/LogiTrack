package com.edusahe.logitrack.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TrackingGuideGenerator {
    private TrackingGuideGenerator() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static String trackingGuideGenerator() {
        return trackingGuideWithDate(LocalDateTime.now());
    }

    public static String trackingGuideWithDate(LocalDateTime now) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
        return "LTK-" + now.format(formatter);
    }


}
