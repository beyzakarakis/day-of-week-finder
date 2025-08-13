/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whichday;

//Scanner objesi olusturulmasi icin java util altindaki Scanner sinifi import edilir.
import java.util.Scanner;

/**
 *
 * @author Beyza Karakis 1921221026
 */
public class Prob2BeyzaKarakis {

    public static void main(String[] args) {
        //Kullanicidan alinan yil, ay ve ay gunune gore haftanin gununu hesaplama.

        //Kullanicidan input almak icin Scanner objesi olusturuyorum.
        Scanner input = new Scanner(System.in);
        //Kullaniciya ne istedigimiz bilmesi icin mesaj birakiyorum.
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int dayOfthemonth = input.nextInt();


        /* Ay ve ayin gunu belli araliklar icinde oldugundan if/else ile kontrol sagladim.
Kullanici bu araliklar disinda girince program hata veriyor ve sonlaniyor. */
        //Ayin 1 ile 12 arasinda olmasi kontrolu
        if (month <= 12 && month >= 1) {
            // Burada kullanici ayi 1 girerse 13'e, 2 girerse 14'e donusturup, yili bir onceki yil yapacagim.
            if (month == 1) {
                month = 13;
                year = year - 1;
            }
            if (month == 2) {
                month = 14;
                year = year - 1;
            }
//Ayin gununun 1 ile 31 arasinda olmasi kontrolu
            if (dayOfthemonth <= 31 && dayOfthemonth >= 1) {
                int day = ((dayOfthemonth + (26 * (month + 1)) / 10) + (year % 100) + ((year % 100) / 4) + ((year / 100) / 4) + (5 * (year / 100))) % 7;
                // Switch/case ile hangi sayi cikarsa ona gore gun yazdirma islemi yaptim. 
                switch (day) {
                    case 0:
                        System.out.println("Day of the week is Saturday");
                        break;
                    case 1:
                        System.out.println("Day of the week is Sunday");
                        break;
                    case 2:
                        System.out.println("Day of the week is Monday");
                        break;
                    case 3:
                        System.out.println("Day of the week is Tuesday");
                        break;
                    case 4:
                        System.out.println("Day of the week is Wednesday");
                        break;
                    case 5:
                        System.out.println("Day of the week is Thursday");
                        break;
                    case 6:
                        System.out.println("Day of the week is Friday");
                        break;
                    default:
                        System.out.println("An error occurred.");
                }

            } else {
                System.out.println("An error occurred.");
            }
        } else {
            System.out.println("An error occurred.");
        }

    }

}
