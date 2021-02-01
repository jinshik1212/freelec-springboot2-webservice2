package com.jskim.book.springboot.web;

import com.jskim.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController  // 컨트롤러를 JSON 을 반환하는 컨트롤러로 만듦
public class HelloController {

    @GetMapping("/hello")  // HTTP Method인 GET 요청 받을 수 있는 API 만들어 줌
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name,
                                     @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }

}

