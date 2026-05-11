
package mulitipkation.test;

import java.util.Scanner;
import java.util.Random;

public class MulitipkationTest {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Random random = new Random();
        for(int spelgånger = 0; spelgånger <= 5; spelgånger++)
        {
        System.out.println("svara på 5 tal i multiplications tabelen");
        int tal1 = random.nextInt(10) + 1;
        int tal2 = random.nextInt(10) + 1;
        int produkt;
        produkt = tal1 * tal2;
            System.out.println("tal 1");
            System.out.println(tal1 + "*" + tal2);
            int svar = input.nextInt();
            if(svar == produkt){
                System.out.println("rätt!");               
            }
            else{
                System.out.println("fel");
              }
        }
      }
    }
