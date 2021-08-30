import java.util.HashMap;
import java.util.*;

public class ZnachenieChisla {

    private String sistema = null;
    private int chislo = 0;


    public ZnachenieChisla (String num) {

        HashMap<String, Integer> RIM = new HashMap<>();
        RIM.put("I", 1);
        RIM.put("II", 2);
        RIM.put("III", 3);
        RIM.put("IV", 4);
        RIM.put("V", 5);
        RIM.put("VI", 6);
        RIM.put("VII", 7);
        RIM.put("VIII", 8);
        RIM.put("IX", 9);
        RIM.put("X", 10);

        HashMap<String, Integer> ARAB = new HashMap<>();
        ARAB.put("1", 1);
        ARAB.put("2", 2);
        ARAB.put("3", 3);
        ARAB.put("4", 4);
        ARAB.put("5", 5);
        ARAB.put("6", 6);
        ARAB.put("7", 7);
        ARAB.put("8", 8);
        ARAB.put("9", 9);
        ARAB.put("10", 10);

        for (var pair : RIM.entrySet()) {
            if (num.equalsIgnoreCase(pair.getKey())) {
                this.chislo = pair.getValue();
                this.sistema = "RIM";
            }
        }


            for (var pair : ARAB.entrySet()) {
                if (num.equalsIgnoreCase(pair.getKey())) {
                    this.chislo = pair.getValue();
                    this.sistema = "ARAB";
                }
            }

    }
    public String getsistema(){
        return this.sistema;
    }
    public int getINTchislo(){
        return this.chislo;
    }
}
