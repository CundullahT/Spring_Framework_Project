package com.cybertek.controller;

import com.cybertek.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {

    final String URI = "https://jsonplaceholder.typicode.com/users";

    private RestTemplate restTemplate;

    public HomeController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public User[] readAllUsers(){
        ResponseEntity<User[]> responseEntity = restTemplate.getForEntity(URI, User[].class);
        return responseEntity.getBody();
    }

    @GetMapping(value = "/{id}")
    public Object readUser(@PathVariable("id") Integer id){
        String URL = URI + "/{id}";
        return restTemplate.getForObject(URL, Object.class, id);        // You can put any kind of object here. For example: User.class.
                                                                        // If you use it like this you won't be able to use the constraints you put in User class.
    }

}
