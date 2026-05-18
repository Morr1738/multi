
package mulitipkation.test;

import java.util.Scanner;
import java.util.Random;

public class MulitipkationTest {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Random random = new Random();
      int rättsvar = 0;
      System.out.println("svara på 5 tal i multiplications tabelen");
        for(int spelgånger = 1; spelgånger <= 5; spelgånger++)
        {
        int tal1 = random.nextInt(10) + 1;
        int tal2 = random.nextInt(10) + 1;
        int produkt;
        produkt = tal1 * tal2;
            System.out.println("tal " + spelgånger);
            System.out.println(tal1 + "*" + tal2);
            int svar = input.nextInt();
            if(svar == produkt){
                System.out.println("rätt!");
                rättsvar++;
            }
            else{
                System.out.println("fel");
              }
        }
        System.out.println("du fick " + rättsvar + " av 5");
      }
    }
