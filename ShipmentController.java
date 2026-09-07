package com.example.shipping.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/shipments")
public class ShipmentController {

    @GetMapping("/{id}")
    public Map<String, Object> track(@PathVariable Long id) {
        return Map.of("id", id, "state", "IN_TRANSIT");
    }

    @PostMapping("/dispatch")
    public Map<String, Object> dispatch(@RequestParam Long orderId) {
        return Map.of("orderId", orderId, "state", "DISPATCHED");
    }
}
