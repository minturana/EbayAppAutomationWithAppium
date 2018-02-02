package com.grab.automation.utils;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

/**
 * @author QAI
 */
public class HttpClient {

    public HttpClient() {

    }

    public ClientResponse postHttpResponse(String resourceURL, Object postBody) {
        ClientResponse response = null;

        Client client = authenticateURL();

        WebResource webResourcePost = client.resource(resourceURL);

        response = webResourcePost.type("application/json").post(
                ClientResponse.class, postBody);
        return response;
    }

    private Client authenticateURL() {
        ClientConfig clientConfig = new DefaultClientConfig();
        clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING,
                Boolean.TRUE);

        Client client = Client.create(clientConfig);
        return client;
    }
    public ClientResponse getHttpResponse(String resourceURL) {
        Client client = authenticateURL();

        WebResource webResourceGet = client.resource(resourceURL);
        ClientResponse response = webResourceGet.get(ClientResponse.class);
        return response;
    }
}