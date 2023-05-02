package it.develhope.middleware.Interceptor.Middleware2.controllers;

import it.develhope.middleware.Interceptor.Middleware2.entities.Month;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MonthController {

    @GetMapping("/month")
    public Month getMonth(HttpServletRequest request){
        Month month = (Month) request.getAttribute("MonthInterceptor-month");
        return month;
    }
}
