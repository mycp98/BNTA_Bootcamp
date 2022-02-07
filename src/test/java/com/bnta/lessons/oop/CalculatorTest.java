package com.bnta.lessons.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
    void canDivideTwoNumbers() {
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
}