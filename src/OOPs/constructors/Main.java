package OOPs.constructors;

import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        var bankAccount1 = new BankAccount();
        System.out.println(bankAccount1.toString());

        LocalDateTime opened = LocalDateTime.of(2018, Month.JUNE, 29, 06, 30, 00);
        var bankAccount2 = new BankAccount("Tom", opened, 1000.0f);
        System.out.println(bankAccount2.toString());
    }
}
