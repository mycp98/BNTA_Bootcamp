import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;  //above is better

public class MyFirstTest {
    //hello is the name of my method

    @Test                  //int result = 4+4;  (testing this)
    void hello1(){
        //Given
        int numberOne = 4;
        int numberTwo = 4;
        //When
        int result = numberOne + numberTwo;
        //Then
       // assertEquals(9, result);    gives the same but below is better:
        assertThat(result).isEqualTo(9);
    }

    @Test
    void hello2(){

    }
}
