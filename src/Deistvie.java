public class Deistvie {

    public static int getsumm(int chislo1, int chislo2, String operation) {
        String[] znak = new String[]{"+", "-", "*", "/"};
        int summ=0;

        if (operation.equals(znak[0])) summ = chislo1 + chislo2;
        else if (operation.equals(znak[1])) summ = chislo1 - chislo2;
        else if (operation.equals(znak[2])) summ = chislo1 * chislo2;
        else if (operation.equals(znak[3])) summ = (int) (chislo1 / chislo2);
        return summ;
    }
}