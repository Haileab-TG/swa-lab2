package io.haileab.bookclient.client;

import io.haileab.bookclient.model.Book;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@ConfigurationProperties(value = "haileab.book", ignoreUnknownFields = false)
public class BookRestClient {
    private final RestTemplate restTemplate;
    private static final String ISBN = "242";
    private String bookservicehost;
    private static final String BOOK_SERVICE_API = "/api/v1/books";

    public BookRestClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public void callBookController(){
        String url = bookservicehost + BOOK_SERVICE_API + "/" + ISBN;
        System.out.println(url);
        Book book = restTemplate.getForObject(url, Book.class);
        System.out.println("Book got via rest template \n" + book);
    }

    public void setBookservicehost(String bookservicehost) {
        this.bookservicehost = bookservicehost;
    }
}
