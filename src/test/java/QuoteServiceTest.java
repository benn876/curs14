import org.assertj.core.api.Assertions;
import org.assertj.core.groups.Tuple;
import org.fasttrackit.homework.Quote;
import org.fasttrackit.homework.QuoteService;
import org.junit.jupiter.api.Test;

import java.util.List;

public class QuoteServiceTest {

    @Test
    public void testCorrectParameterCreation() {
        //GIVEN
        List<Quote> quotes = List.of(Quote.builder()
                .quote("bla bla")
                .author("Beni")
                .build());

        //WHEN
        QuoteService quoteService = new QuoteService(quotes);

        //THEN
        Assertions.assertThat(quoteService.getQuotes()).hasSize(1);
    }

    @Test
    public void testNullAsParameter() {
        QuoteService quoteService = new QuoteService(null);
        Assertions.assertThat(quoteService.getQuotes()).isEmpty();
    }

    @Test
    public void testGetAllQuotes() {
        //GIVEN
        List<Quote> quotes = List.of(Quote.builder()
                        .quote("bla bla")
                        .author("Beni")
                        .build(),
                Quote.builder()
                        .quote("A fi sau a nu fi")
                        .author("Schecspeer")
                        .build()
        );
        QuoteService quoteService = new QuoteService(quotes);

        //WHEN
        List<String> result = quoteService.getAllQuotes();

        Assertions.assertThat(result).hasSize(2)
                .containsExactlyInAnyOrder("A fi sau a nu fi", "bla bla");

        Assertions.assertThat(quoteService.getQuotes()).extracting("author", "id")
                .containsExactlyInAnyOrder(Tuple.tuple("Beni", 2), Tuple.tuple("Schecspeer", 3));
    }
}
