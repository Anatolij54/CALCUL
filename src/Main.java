import java.util.*;

public class Main {
    public static void main(String[] args) {

// получаю "правильный" массив строк в которых хранятся числа и операция согласно условию
        String[] mass = Input.stroka();

       String num1 = mass[0];
       String operation = mass[1];
       String num2 = mass[2];
        // получаю число int 1 и систему, они одинаковые с int2
        ZnachenieChisla chislo1 = new ZnachenieChisla(num1);
        int INTchislo1 = chislo1.getINTchislo();
        String sistema1 = chislo1.getsistema();
        // получаю число int 2
        ZnachenieChisla chislo2 = new ZnachenieChisla(num2);
        int INTchislo2 = chislo2.getINTchislo();
// Произвожу арифметическую операцию
       int deistvie = Deistvie.getsumm(INTchislo1, INTchislo2, operation);

        Print.printsumm(deistvie, sistema1);

        }
    }

