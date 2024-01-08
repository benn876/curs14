import org.assertj.core.api.Assertions;
import org.fasttrackit.code.NullValueInListException;
import org.fasttrackit.code.TDD;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Create a function TDD.find that receives a list and a number and returns the index or -1 if not found
 */
public class TDDTest {

    @Test
    public void instantiateClass() {
        TDD tdd = new TDD();
    }

    @Test
    public void callMethod() {
        TDD tdd = new TDD();
        tdd.find(new ArrayList<>(), 4);
    }

    @Test
    public void methodReturnsAnInt() {
        TDD tdd = new TDD();
        Integer result = tdd.find(new ArrayList(), 4);
        Assertions.assertThat(result).isEqualTo(-1);
    }

    @Test
    public void methodReturnsIndexIfFound() {
        //GIVEN
        TDD tdd = new TDD();
        List<Integer> numbers = Arrays.asList(1, 4, 5);
        Integer numberToBeFound = 4;

        //WHEN
        Integer result = tdd.find(numbers, numberToBeFound);

        //THEN
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void methodReturnsMinusOneIfNotFound() {
        //GIVEN
        TDD tdd = new TDD();
        List<Integer> numbers = Arrays.asList(1, 4, 5);
        Integer numberToBeFound = 6;

        //WHEN
        Integer result = tdd.find(numbers, numberToBeFound);

        //THEN
        Assertions.assertThat(result).isEqualTo(-1);
    }

    @Test
    public void methodReturnsMinusOneIfTheListIsEmpty() {
        //GIVEN
        TDD tdd = new TDD();
        List<Integer> numbers = new ArrayList<>();
        Integer numberToBeFound = 6;

        //WHEN
        Integer result = tdd.find(numbers, numberToBeFound);

        //THEN
        Assertions.assertThat(result).isEqualTo(-1);
    }

    @Test
    public void methodThrowsAnErrorIfOneValueInListIsNull() {
        //GIVEN
        TDD tdd = new TDD();
        List<Integer> numbers = Arrays.asList(1, null, 5);
        Integer numberToBeFound = 6;

        //THEN
        org.junit.jupiter.api.Assertions.assertThrows(NullValueInListException.class, () -> tdd.find(numbers, numberToBeFound));
    }

    @Test
    public void methodReturnsMinusOneIfTheNumberToBeFoundIsNull(){
        //GIVEN
        TDD tdd = new TDD();
        List<Integer> numbers = Arrays.asList(1, 4, 5);
        Integer numberToBeFound = null;

        //WHEN
        Integer result = tdd.find(numbers, numberToBeFound);

        //THEN
        Assertions.assertThat(result).isEqualTo(-1);
    }
}
