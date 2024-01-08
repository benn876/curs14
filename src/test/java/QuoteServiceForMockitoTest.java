import org.assertj.core.api.Assertions;
import org.fasttrackit.homework.FileReader;
import org.fasttrackit.homework.Quote;
import org.fasttrackit.homework.QuoteServiceForMockito;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

import java.io.FileNotFoundException;
import java.util.List;

public class QuoteServiceForMockitoTest {
    @Test
    public void testGetQuotes() throws FileNotFoundException {
        FileReader fileReader = Mockito.mock(FileReader.class);
        Mockito.when(fileReader.readQuotesFromFileNonStatic(ArgumentMatchers.any())).thenReturn(List.of(
                Quote.builder()
                        .author("test")
                        .quote("test22222")
                        .build()
        ));
        QuoteServiceForMockito quoteServiceForMockito = new QuoteServiceForMockito(fileReader);
        Assertions.assertThat(quoteServiceForMockito.getQuotes()).hasSize(1);
    }
}
