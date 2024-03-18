package com.turkcell.adapters;

import com.turkcell.abstracts.ICustomerCheckService;
import com.turkcell.entities.Customer;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MernisServiceAdapter implements ICustomerCheckService {
    @Override
    public boolean checkIfRealPerson(Customer customer) {

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx"))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        }
    }
}
