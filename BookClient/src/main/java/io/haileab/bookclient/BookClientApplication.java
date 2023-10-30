package io.haileab.bookclient;

import io.haileab.bookclient.client.BookRestClient;
import io.haileab.bookclient.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BookClientApplication {



    public static void main(String[] args) {
      ConfigurableApplicationContext context = SpringApplication.run(BookClientApplication.class, args);
      context.getBean(BookRestClient.class).callBookController();
    }



}
