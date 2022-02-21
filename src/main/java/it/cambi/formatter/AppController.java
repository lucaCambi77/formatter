/*
 * Copyright (c) 2022
 */
package it.cambi.formatter;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/endpoint")
public class AppController {

    @RequestMapping(method = RequestMethod.GET, produces = { MediaType.APPLICATION_JSON_VALUE })
    @ResponseStatus(code = HttpStatus.OK)
    public String helloWorld(@RequestParam String name) {
        return "Hi from " + name;
    }

}
