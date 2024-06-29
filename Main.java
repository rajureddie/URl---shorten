package URLshortner;

import java.util.Scanner;


public class Main{
   public static void main (String args[]){

   
   Scanner sc = new Scanner(System.in);
   Urlshortner urlshortner = new Urlshortner();
  

  
  while(true){
   System.out.println(" ");
   System.out.println("------CHOOSE OPTION------");
   System.out.println(" ");
   System.out.println("1. Shorten the url");
   System.out.println("2. get the original url");
   System.out.println("3. Exit");
   System.out.println(" ");
   int choice = sc.nextInt();
   sc.nextLine();
   switch ((choice)) {
      case 1:
         System.out.println("Enter the original url");
         String userurl = sc.nextLine();
         String shorturl = urlshortner.shortenurl(userurl);
         System.out.println(" ");
         System.out.println("Shortened URL: " + shorturl);
         
         break;
         case 2:
            System.out.println("Enter the Shorten url");
            String systemurl=sc.nextLine();
            System.out.println(" ");
            System.out.println("Original URL is " + urlshortner.getoriginalurl(systemurl));
            break;
         case 3:
            System.out.println("Exiting ....");
            sc.close();
            return;
      default:
      System.out.println(" ");
      System.out.println("Invalid Choice. Please try again");
         break;
   }
  }
}
  
}