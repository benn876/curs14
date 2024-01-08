import org.assertj.core.api.Assertions;
import org.fasttrackit.code.Operations;
import org.junit.jupiter.api.*;

public class OperationsTest {
    private Operations operations;

    @BeforeAll
    public static void beforeAllFunction(){
        System.out.println("Welcome to the testing area");
    }

    @BeforeEach
    public void beforeEach(){
        System.out.println("before each test");
        this.operations = new Operations();
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("The testing area has been closed");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("after each test");
    }


    @Test
    @DisplayName("WHEN sum is called on two positive numbers THEN correct sum is returned")
    public void sumTest() {
        System.out.println("test 1");
        //GIVEN
        int par1 = 4;
        int par2 = 3;

        //WHEN
        int result = operations.sum(par1, par2);

        //THEN ( 4 + 3 = 7 )
        Assertions.assertThat(result).isEqualTo(7);
    }

    @Test
    @DisplayName("WHEN sum is called on two negative numbers THEN correct sum is returned")
    public void sumNegativeNumbersTest() {
        System.out.println("test 2");
        //GIVEN
        int par1 = -4;
        int par2 = -1;

        //WHEN
        int result = operations.sum(par1, par2);

        //THEN
        Assertions.assertThat(result).isEqualTo(-5);
    }

    @Test
    @DisplayName("WHEN sum is called and one parameter is null THEN the result is 0")
    public void sumWithNullValue() {
        System.out.println("test 3");
        //GIVEN
        Integer par1 = -4;
        Integer par2 = null;

        //WHEN
        int result = operations.sum(par1, par2);

        //THEN
        Assertions.assertThat(result).isEqualTo(0);
    }

}
