package com.example.stock.dbservice.resource;

import java.util.List;
import java.util.stream.Collectors;

import com.example.stock.dbservice.repository.QuotesRepository;
import com.example.stock.dbservice.model.Quote;
import com.example.stock.dbservice.model.Quotes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class DbServiceResource {

    private QuotesRepository quotesRepository;

    @GetMapping("/{username}")
    public List<String> getQuotes(@PathVariable("username") final String username) {

        // quotesRepository.findByUserName(username).stream().map(quote -> {
        //     return quote.getQuote();
        // }).collect(Collectors.toList());

        return quotesRepository.findByUserName(username)
                .stream()
                .map(Quote::getQuote)
                .collect(Collectors.toList());
    }

    @PostMapping("/add")
    public List<String> add(@RequestBody final Quotes quotes) {
		return null;
    }
}