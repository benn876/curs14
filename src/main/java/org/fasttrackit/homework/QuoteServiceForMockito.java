package org.fasttrackit.homework;

import lombok.Data;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

@Data
public class QuoteServiceForMockito {
    private final List<Quote> quotes = new ArrayList<>();

    @SneakyThrows
    public QuoteServiceForMockito(FileReader fileReader) {
            this.quotes.addAll(fileReader.readQuotesFromFileNonStatic("quotes"));
    }

    public List<String> getAllQuotes() {
        List<String> quotesQuote = new ArrayList<>();
        for (Quote quote : quotes) {
            quotesQuote.add(quote.getQuote());
        }
        return quotesQuote;
    }
}
