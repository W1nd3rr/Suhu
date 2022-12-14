
package quizz;

import java.util.Scanner;

public class Quizz {
//menentukan cuaca
    public static void main(String[] args) {
        int suhu;
        Scanner input = new Scanner (System.in);
        System.out.print(" masukkan Suhu : ");
        suhu = input.nextInt();
        if (suhu >= 32 )
        {
            System.out.println("Cuaca Sangat Panas");
        }
        else if (suhu < 32 && suhu >= 27)
        {
            System.out.println("Cuaca Panas");
        }
        else if (suhu > 5 && suhu < 15)
        {
            System.out.println(" Cuaca Dingin ");
        }
        else if (suhu <= 5)
        {
            System.out.println("Suhu Sangat Dingin");
        }
        else
        {
            System.out.println("Cuaca Normal");
        }
    }
    
}
