package com.edusahe.logitrack.utils;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrackingGuideGeneratorTest {


    @Test
    void trackingGuideWithFormatDate() {
        LocalDateTime date = LocalDateTime.of(2026,5,5,9,15,1);
        String result = TrackingGuideGenerator.trackingGuideWithDate(date);
        assertEquals("LTK-05052026091501", result);
    }
}