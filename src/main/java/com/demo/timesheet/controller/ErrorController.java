package com.demo.timesheet.controller;

import com.demo.timesheet.domain.HttpResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

public class ErrorController {

    @RequestMapping("/error")
    public ResponseEntity<HttpResponse> notFound404() {
        HttpResponse httpResponse = new HttpResponse(HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND,
                HttpStatus.NOT_FOUND.getReasonPhrase().toUpperCase(), "There is no mapping for this URL");
        return new ResponseEntity<>(httpResponse, HttpStatus.NOT_FOUND);
    }
}
