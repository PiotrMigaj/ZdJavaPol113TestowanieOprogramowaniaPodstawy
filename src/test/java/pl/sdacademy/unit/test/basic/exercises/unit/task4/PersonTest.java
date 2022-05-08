package pl.sdacademy.unit.test.basic.exercises.unit.task4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void thatPersonIsAChild(){
        //given
        Person person = new Person("Jan","Kowalski",18);
        //when
        boolean result = person.isChild();
        //then
        assertTrue(result);
        assertThat(result).isTrue();
    }

    @Test
    void thatPersonIsNotAChild(){
        //given
        Person person = new Person("Jan","Kowalski",99);
        //when
        boolean result = person.isChild();
        //then
        assertFalse(result);
        assertThat(result).isFalse();
    }

}