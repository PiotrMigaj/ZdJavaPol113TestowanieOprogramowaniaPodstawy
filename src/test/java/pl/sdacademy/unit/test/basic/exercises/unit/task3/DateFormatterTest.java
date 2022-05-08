package pl.sdacademy.unit.test.basic.exercises.unit.task3;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {

    @Test
    void shouldReturnFormatDateToYearDayMonth() {
        //given
        DateFormatter dateFormatter = new DateFormatter();
        LocalDate input = LocalDate.of(2000,1,20);
        String expectedResult="2000-20-01";
        //when
        String result = dateFormatter.formatDate(input);
        //then
        assertEquals(expectedResult,result);
        assertThat(result).isEqualTo(expectedResult);
    }
}