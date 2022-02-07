package com.bnta.lessons.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CalculatorTest {

    @Test
    void canAddTwoNumbers() {
        //Given
        //we want an instance/object of the class (calculator) we want to test
        Calculator calculator = new Calculator();
        int n1 = 10;
        int n2 = 10;

        //When
        int result = calculator.add(n1, n2);

        //Then
        assertThat(result).isEqualTo(20);
    }

    @Test
    void canDivideTwoNumbers() throws Exception {
        //Given
        Calculator calculator = new Calculator();
        int n1 =20;
        int n2 = 4;
        //When
        int actual = calculator.divide(n1, n2);
        //then
        int expected = 5;  //value that we as developers expect
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void canDivideWithZero() {
        //Given
        Calculator calculator = new Calculator();
        int n1 =4;
        int n2 = 0;
        //Then
        assertThatThrownBy(() -> {      //method without a name: lambda   //catching the throw using assertThatThrownBy
            //When
            calculator.divide(n1,n2);
        }).hasMessage("Cannot divide by 0");
//        int actual = calculator.divide(n1, n2);
//        //then
//        int expected = 5;  //value that we as developers expect
//        assertThat(actual).isEqualTo(expected);
    }
}