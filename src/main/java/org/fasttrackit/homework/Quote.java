package org.fasttrackit.homework;

import lombok.Builder;
import lombok.Data;

@Data
public class Quote {
    private static Integer count = 1;
    private final int id;
    private final String author;
    private final String quote;
    private Boolean favourite = false;

    @Builder(toBuilder = true)
    public Quote(String author, String quote){
        this.id = count;
        this.author = author;
        this.quote = quote;
        count++;
    }
}
