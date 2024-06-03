package com.example.back.actuator.config;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.actuate.web.exchanges.HttpExchangeRepository;
import org.springframework.boot.actuate.web.exchanges.Include;
import org.springframework.boot.actuate.web.exchanges.servlet.HttpExchangesFilter;
import org.springframework.stereotype.Component;

@Component
public class TraceRequestFilter extends HttpExchangesFilter {

    public TraceRequestFilter(HttpExchangeRepository repository) {
        super(repository, Include.defaultIncludes());
    }

    @Override
    protected boolean shouldNotFilter(HttpServletRequest request){
        return request.getServletPath().contains("actuator") || request.getServletPath().contains("h2-console");
    }
}
