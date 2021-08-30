import java.util.Scanner;

public class Input {
    static int INTchislo1;
    static int INTchislo2;
    static String[] reserv;
    static String num1;
    static String num2;
    static String operation;


    public static String[] stroka (){
        System.out.println("Введите операцию для вычесления через пробел. Числа Арабские либо римские от 1 до 10");
      // цикл пока не введены числа от 1 до 10 в нужной системе
        do {

           try {
               Scanner scan = new Scanner(System.in);
               String stroka = scan.nextLine();

               reserv = stroka.split(" ");

                num1 = reserv[0];
                num2 = reserv[2];
                operation = reserv[1];
           }
           catch (Exception except){
               System.out.print("throws Exception //т.к. строка не является математической операцией, числа и знак должны быть введены через пробел");
               System.exit(0);
           }
           // Проверяю если введено через пробел больше операндов
           try {
               if (reserv.length > 3) throw new Exception();
           }
           catch (Exception except){
               System.out.print("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
               System.exit(0);
           }
           // Проверяю какой знак введен для операции

            try {
             if (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/")) throw new Exception();

            }
            catch(Exception except){
                System.out.print("Введена неподходящая арифметическая операция");
                System.exit(0);
            }
            // Создаю объекты со своими значениями число и система, чтобы потом можно было сравнить системы
            ZnachenieChisla chislo1 = new ZnachenieChisla(num1);
                INTchislo1 = chislo1.getINTchislo();
                String sistema1 = chislo1.getsistema();

            ZnachenieChisla chislo2 = new ZnachenieChisla(num2);
                INTchislo2 = chislo2.getINTchislo();
                String sistema2 = chislo2.getsistema();
            // проверяю что число в нужном диапазоне, сравниваю с 0 т.к. в моем алфавите в класее Chislo есть значения только от 1 до 10, остальные значения принимаются = 0
           if (INTchislo1==0 || INTchislo2==0) {
               System.out.println("Введите числа для вычесления в нужном диапазоне: от 1 до 10");
               continue;
           }
            // если все условия выполнены и числа и операция ввидены корректно, тогда проверяю систему
           try{
                if (sistema1 != sistema2) throw new Exception();
            }
            catch (Exception except){
                System.out.print("throws Exception //т.к. используются одновременно разные системы счисления");
                System.exit(0);
            }


       }
        while (INTchislo1==0 || INTchislo2==0 );


        return reserv;
    }
}
