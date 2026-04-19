package com.devaman.pagaar.Controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.webmvc.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemeErrorController implements ErrorController {

    @RequestMapping("/error")
    public ResponseEntity<String> handleError(HttpServletRequest req){
        Object statusCode = req.getAttribute("jakarta.servlet.error.status_code");
        System.out.println(req);
        Integer status = (statusCode != null) ? Integer.parseInt(statusCode.toString()) : 500;
        String memeHtml = "<html><body>"+ "<h1>Error Code:" + statusCode+ "</h1>" + "<img src='https://http.cat/" +status+ " alt='Cat'/>";

        return new ResponseEntity<>(memeHtml, HttpStatus.valueOf(status));
    }
}
