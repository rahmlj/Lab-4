import java.util.Random;

/*
Lab 4
Partners: Ioana Guna and Louis Rahm
Date 09/16/2020
*/

class Main {
  public static void main(String[] args) {
    
    Random r =  new Random();
    int randomNum = r.nextInt(50) + 1;
    System.out.println("The Random number is: ");
    
    for (int count = randomNum; count >= 0; count --)
    System.out.println(" " + count);
      if (randomNum < 25)
        System.out.println("Ahoy mateys!");
      else if (randomNum >= 25 && randomNum <= 42)
        System.out.println("Cannonball!");
      else if (randomNum > 42)
        System.out.println("Blast Off!");

      
      

  }
}