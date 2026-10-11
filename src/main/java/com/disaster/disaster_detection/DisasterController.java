
package com.disaster.disaster_detection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class DisasterController {

    @GetMapping("/api/disaster/status")
    public Map<String, String> getStatus() {
        return Map.of(
            "project", "Disaster Detection System",
            "status", "Backend is running",
            "message", "API connected successfully"
        );
    }
}
