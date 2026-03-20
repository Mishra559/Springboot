package in.ashokit.App;

import in.ashokit.App.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorAppApplicationTests {


    @Autowired
    private CalculatorService calculatorService;

    @ParameterizedTest
    @CsvSource({"1,2,3","5,6,11","9,8,17"})
    public void testAdd(int a, int b, int expectedResult) {
        int actualResult = calculatorService.add( a, b);
        Assertions.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testIsEven() {
        boolean actualResult = calculatorService.isEven(10);
        Assertions.assertEquals(true, actualResult);
    }


    @Test
    public void testIsEven2() {
        boolean actualResult = calculatorService.isEven(23);
        Assertions.assertFalse(actualResult);
    }

    @ParameterizedTest
    @ValueSource(ints = {10, 20, 30,40,50,60})
    public void isEvenTest(int num) {
        boolean actualResult = calculatorService.isEven(num);
        Assertions.assertEquals(true, actualResult);
    }

}
