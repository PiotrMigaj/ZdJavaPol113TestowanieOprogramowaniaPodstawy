package pl.sdacademy.unit.test.basic.exercises.task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @BeforeEach
    void message(){
        System.out.println("Hello test!");
    }

    @Test
    void shouldTransferMoney() {
        //given
        Account credit = new Account(1000,
                "21111111111111111111111113",
                new Customer("Jan","Nowak"));
        Account debit = new Account(2000,
                "21111111111111111111111111",
                new Customer("Ala","Kowalska"));
        //when
        debit.transferMoney(credit,100);
        //then
        assertEquals(1100,credit.getBalance());
        assertEquals(1900,debit.getBalance());

    }

    @Test
    void shouldNotTransferMoneyIfCreditAccountIsWrong(){

        //given
        Account credit = new Account(1000,
                "2111111111111111111111111d",
                new Customer("Jan","Nowak"));
        Account debit = new Account(2000,
                "21111111111111111111111111",
                new Customer("Ala","Kowalska"));
        //when
        debit.transferMoney(credit,100);
        //then
        assertEquals(1000,credit.getBalance());
        assertEquals(2000,debit.getBalance());
    }

    @Test
    void shouldNotTransferMoneyIfAmountIsGreaterThanBalance(){
        //given
        //given
        Account credit = new Account(1000,
                "21111111111111111111111113",
                new Customer("Jan","Nowak"));
        Account debit = new Account(2000,
                "21111111111111111111111114",
                new Customer("Ala","Kowalska"));
        //when
        debit.transferMoney(credit,10000);
        //then
        assertEquals(1000,credit.getBalance());
        assertEquals(2000,debit.getBalance());
    }
}