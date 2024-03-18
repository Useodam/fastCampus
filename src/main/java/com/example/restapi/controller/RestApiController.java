package com.example.restapi.controller;

import com.example.restapi.model.BookQueryParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping(path="/hello")
    public String hello(){
        var html ="<html> <body> <h1> Hello Spring Boot </h1> </body> </html>";

        return html;
    }

    @GetMapping("/echo/{message}/age/{age}/is-man/{isMan}")
    public String echo(@PathVariable(name = "message") String msg, @PathVariable int age,
                        @PathVariable boolean isMan){
        // @PathVariable과 주소값이 동일해야한다
        System.out.println(msg);
        System.out.println(age);
        System.out.println(isMan);

        // TODO 대문자로 변환해서 Return => toUpperCase

        // String 타입의 변수 외에 다른 타입 받아보기

        return msg.toUpperCase();
    }

    @GetMapping("/book")
    public void queryParam( @RequestParam String category,
                            @RequestParam String issuedYear,
                            @RequestParam(name="issued-month") String issuedMonth,
                            @RequestParam String issued_day)
    {
        System.out.println(category);
        System.out.println(issuedYear);
        System.out.println(issuedMonth);
        System.out.println(issued_day);

        return;
    }

    @GetMapping("/book2")
    public void queryParamDto(BookQueryParam bookQueryParam)
    {
        // 변수의 내용이 많을때 객체로 받는게 더 편하다
        System.out.println(bookQueryParam);
        return;
    }
}
