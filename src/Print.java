public class Print {
    public static void printsumm(int summ, String sistema) {
        if (sistema.equals("ARAB"))
            System.out.print(summ);
        else {
            try {
                if (summ < 1) throw new Exception();
            }
            catch(Exception except){
                System.out.print("throws Exception //т.к. в римской системе нет чисел меньше 1");
                System.exit(0);
            }
            System.out.print(ARABtoRIM.RomanNumerals(summ));
        }
    }
}
