package org.fasttrackit.homework;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class QuoteService {
    private final List<Quote> quotes = new ArrayList<>();

    public QuoteService(List<Quote> quotes) {
        if (quotes != null) {
            this.quotes.addAll(quotes);
        }
    }

    public List<String> getAllQuotes() {
        List<String> quotesQuote = new ArrayList<>();
        for (Quote quote : quotes) {
            quotesQuote.add(quote.getQuote());
        }
        return quotesQuote;
    }
}
