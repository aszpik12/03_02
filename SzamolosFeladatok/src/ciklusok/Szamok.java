package ciklusok;

import java.util.Scanner;

public class Szamok {
private static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int variaciougyanaz = 0;
        boolean ismetlessel = sc.next().equals("i");
        
        
        for (int k = 2; k <= 4; k++) {
            for (int j = 2; j <= 4; j++) {
                for (int i = 2; i <= 4; i++) {
                    if ((j != k && j != i) && (i != k && i != j)) {
                        System.out.println(k + "" + j + "" + i);
                        variaciougyanaz++;
                    
                    }
                }
            }
        }
        System.out.println(variaciougyanaz + "-nyi variáció ha ugyanazt nem nézük");

    }
}
