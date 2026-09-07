package com.example.shipping.client;

import java.net.URI;
import java.net.http.*;

/** Calls the order service in utkarshbito/bito14304-order-service. */
public class OrderLookupClient {
    private final HttpClient http = HttpClient.newHttpClient();

    /** GET http://bito14304-order-service/api/orders/{id} */
    public String lookup(Long id) throws Exception {
        HttpRequest r = HttpRequest.newBuilder()
                .uri(URI.create("http://bito14304-order-service/api/orders/" + id)).GET().build();
        return http.send(r, HttpResponse.BodyHandlers.ofString()).body();
    }
}
