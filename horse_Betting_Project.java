import java.util.*;
public class Derby
{
  public static void BMT() //Terminates Program
  {
      System.out.println(); 
      System.out.println("The Bet Placer Machine will now shut down");
      System.exit(0);
  }
  public static void CS(int p, double u) //Used for shortening of program and reusability of code
  {
      System.out.println(); 
      System.out.println("The Winning Horse's IN is "+p);
      System.out.println(); 
      System.out.println("Sorry, your betted horse didn't win");
      System.out.println("You lost "+u+"$, Better luck next time!");       
  }
  public static void PrizeCalculator(int p, double u, int res) //Calculates the prize amount
  {
      double q=p;
      double amt=u;
      double prize=amt+((q/100)*amt);
      System.out.println(); 
      System.out.println("Congratulations!");
      System.out.println("Your betted horse won!");  
      System.out.println("The Winning Horse's IN is "+res);
      System.out.println(); 
      System.out.println("Your prize is : "+prize+"$");  
  }
  public static void HorsesInC() //Displays info about participants of California Derby
  {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("The list of participants in California Derby are :");
        System.out.println();
        System.out.println("INs  |     Name of Horse   |        Trainer       |     Jockey");
        System.out.println("     |                     |                      |            ");      
        System.out.println("1.   |   California Chrome |      Art Sherman     | Victor Espinoza");
        System.out.println("2.   |         Orb         | Claude McGaughey III |  Joel Rosario");
        System.out.println("3.   |      Big Brown      |   Richard E. Dutrow  | Kent Desormeaux");
        System.out.println("4.   |     Lord Murphy     |      Goerge Rice     |  Charlie Shaur");
        System.out.println("5.   |   Strike The Gold   |       Nick Zito      |   Chris Atley");
        System.out.println("6.   |      Grindstone     |     D. Wayne Lukas   |  Jerry Bailey");
        System.out.println("7.   |      Ferdinand      |  Charlie Whittingham |  Bill Shoemaker");
        System.out.println("8.   |        Swaps        |      Jimmy Jones     |   Mesh Tenney");
        System.out.println("9.   |      Jet Pilot      |       Tom Smith      |   Eric Guerin");
        System.out.println("10.  |    Exterminator     |     Henry McDaniel   |  WIlliam Knapp");
        System.out.println("--------------------------------------------------------------------------");
  }
  public static void HorsesInK() //Displays info about participants of Kentucky Derby
  {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("The list of participants in Kentucky Derby are :");
        System.out.println();
        System.out.println("INs  |     Name of Horse   |        Trainer       |     Jockey");
        System.out.println("     |                     |                      |            ");      
        System.out.println("1.   |     Golden Soul     |     Joel Rosario     |  Roby Albarado");
        System.out.println("2.   |    Revolutionary    |    Rosie Napravnik   |   Calvin Borel");
        System.out.println("3.   |        Oxbow        |   Javier Castellano  | Gary L. Stevens");
        System.out.println("4.   |      Java's War     |       Mike Smith     | Julien Leparoux");
        System.out.println("5.   |      Black Onix     |      Alan Garcia     |    Joe Bravo");
        System.out.println("6.   |      Frac Daddy     |     Todd Pletcher    |  Victor Lebron");
        System.out.println("7.   |     OverAnalyze     |     Elvis Trujillo   | Rafael Bejarano");
        System.out.println("8.   |   Charming Kitten   |     Shug McGaughey   |   Edgar Prado");
        System.out.println("9.   |     GoldenCents     |       Luis Saez      |  Kevin Krigger");
        System.out.println("10.  |   Lines Of Battle   |       Jon Court      |   Ryan Moore");
        System.out.println("--------------------------------------------------------------------------");
  }
  public static void Kentucky() //Displays info about Kentucky Derby
  { 
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Here is the info about Kentucky Derby");
        System.out.println("Note : You can bet on a maximum number of 2 horses only");
        System.out.println();
        System.out.println("Profits on winning will be as follows:");
        System.out.println();
        System.out.println("Bet on 1 horse  : \t 100% cashback + 80% profit");
        System.out.println("Bet on 2 horses : \t 100% cashback + 70% profit");
        System.out.println();
        System.out.println("Inaugrated in 1875");
        System.out.println("Qualification = Three-year-olds");
        System.out.println("Race type is Thoroughbred");
        System.out.println("Track Distance is 10 furlongs");
        System.out.println("Surface is Dirt");
        System.out.println("Track is Left-handed");
        System.out.println("Situated at Churchill Downs, Louisville, Kentucky, United States");
        String link="http://www.kentuckyderby.com";
        System.out.println("Visit their website : "+link);  
        System.out.println("--------------------------------------------------------------------------");
  }
  public static void California() //Displays info about California Derby
  {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Here is the info about California Derby");
        System.out.println("Note : You can bet on a maximum number of 4 horses only");
        System.out.println();
        System.out.println("Profits on winning will be as follows:");
        System.out.println();
        System.out.println("Bet on 1 horse  : \t 100% cashback + 70% profit");
        System.out.println("Bet on 2 horses : \t 100% cashback + 60% profit");
        System.out.println("Bet on 3 horses : \t 100% cashback + 50% profit");
        System.out.println("Bet on 4 horses : \t 100% cashback + 40% profit");
        System.out.println();
        System.out.println("Inaugrated in 1876");
        System.out.println("Qualification = Three-year-olds");
        System.out.println("Race type is Thoroughbred - Flat racing");
        System.out.println("Track Distance is 8.2 furlongs");
        System.out.println("Surface is Tapeta");
        System.out.println("Track is Synthetic");
        System.out.println("Situated at Golden Gate Fields, Berkeley, California");
        System.out.println("Visit their website : www.goldengatefields.com");
        System.out.println("--------------------------------------------------------------------------");
  }
   public static void main(String args[])
     {
        int abc=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to the Horse Racing Bet Placer Machine");
        System.out.println();
        System.out.println("Through this Machine you can place bets on different derbies accross the globe");
        System.out.println(); 
        System.out.println("Press 1 to choose a Derby"); //Ask user whether he wants to place a bet or not
        System.out.println("Press 2 if you don't want to place a bet");
        int choice=in.nextInt(); //Inputs user's choice
        if (choice==2) //Determines the user's choice
        {
            System.out.println();
            System.out.println("Thank you for using our Bet Placer Machine");
            System.exit(0); //Terminates Program
        }
        while (abc==0)
        {
        if (choice==1) //Determines the user's choice
        {
            System.out.println();
            System.out.println("You can choose from the following derbies:"); //Asks the user in which derby he wants to place the bet
            System.out.println();
            System.out.println("Kentucky Derby");
            System.out.println("California Derby");
            System.out.println();
            System.out.println("Type \"vi\" to display info about the different derbies or \"bet\" to place the bet directly"); //Asks user about his opinion
            String a=in.next();       
            String x=a.toUpperCase(); //Convert String a to uppercase
            if ("VI".equals(x))
            {
                System.out.println();
                System.out.println("Press K to display info about Kentucky Derby and C to display info about California Derby and B to display info about both Derbies");
                char infochoice=in.next().charAt(0);
                //Checks wheter user wants to view  info about Kentucky Derby or California Derby or both 
                if (infochoice=='c' || infochoice=='C')
                {
                    System.out.println();
                    California();
                }
                if (infochoice=='k' || infochoice=='K')
                {
                    System.out.println();
                    Kentucky();
                }  
                if (infochoice=='b' || infochoice=='B')
                {
                    System.out.println();
                    Kentucky();
                    California();
                }
            }
            //Checks if user directly wants to place bet as well as continues the execution of program
            if ("BET".equals(x) || "VI".equals(x))
            {
                 System.out.println();
                 //Asks the user in which Derby he wants to place the bet
                 System.out.println("Press K to place bet in Kentucky Derby and C to place bet in California Derby");
                 char b=in.next().charAt(0);
                 if (b=='c' || b=='C')
                 {
                     System.out.println();
                     //Asks the user whether he wants to view list of participants or proceed to place a bet
                     System.out.println("Enter \"show\" to display participants of California Derby or \"continue\" to place bet");
                     String z=in.next();
                     z=z.toLowerCase();
                     
                     //Determines user's choice
                     if ("show".equals(z))
                        {
                            // Displays the list of participants
                            System.out.println();
                            HorsesInC();
                        }
                     if ("continue".equals(z) || "show".equals(z))
                     {
                            System.out.println();
                            System.out.println("Enter the number of horses you want to bet on");
                            int c=in.nextInt();
                            if (c>4)
                            {
                                 System.out.println();
                                 System.out.println("Sorry, you can bet only on a maximum number of 4 horses");
                                 System.exit(0);                           
                            }
                            if (c==1)
                            {
                                 System.out.println();
                                 System.out.println("Choose from the INs(Identification numbers) of the horses from 1 to 10");
                                 int h1=in.nextInt();
                                 System.out.println("Enter the amount of bet(Max 1000$)");
                                 double amt=in.nextDouble();
                                 int result=(int)Math.floor(Math.random() * (10 - 1 + 1)) + 1; //Determines a random winner
                                 System.out.println("The results have been announced!Type r to see the results.");
                                 String nul=in.next();
                                 nul=nul.toLowerCase();
                                 if ("r".equals(nul))
                                 {
                                     //checks whether user won or lost and displays the result
                                 if (result==h1)
                                 {
                                     PrizeCalculator(70,amt,result); //Calculates and displays prize money
                                 }
                                 else
                                 {
                                    CS(result,amt);
                                 }
                                }
                            }
                            if (c==2)
                            {
                                 System.out.println();
                                 System.out.println("|--------------------------------------------------------------|");
                                 System.out.println("|Warning : Betting on two horses will reduce your profit by 10%|");
                                 System.out.println("|--------------------------------------------------------------|");
                                 System.out.println("Are you sure you want to continue? Enter y or n");
                                 char war=in.next().charAt(0);
                                 if (war=='y' || war=='Y')
                                 {
                                     System.out.println();
                                     System.out.println("Choose 2 numbers from the INs(Identification numbers) of the horses from 1 to 10 on whom you want to place your bet");
                                     int h1=in.nextInt();
                                     int h2=in.nextInt();
                                     System.out.println("Enter the amount of bet(Max 1000$)");
                                     double amt=in.nextDouble();
                                     int result=(int)Math.floor(Math.random() * (10 - 1 + 1)) + 1; //Determines a random winner
                                     //checks whether user won or lost and displays the result
                                     System.out.println("The results have been announced!Type r to see the results.");
                                 String nul=in.next();
                                 nul=nul.toLowerCase();
                                 if ("r".equals(nul))
                                 {
                                     if (result==h1 || result==h2)
                                     {
                                       PrizeCalculator(60,amt,result);
                                     }
                                     else
                                     {
                                       CS(result,amt);
                                     }
                                 }
                                }
                                if (war=='n' || war=='N')
                                {
                                     BMT(); //terminates program
                                }
                            }
                            if (c==3)
                            {
                               System.out.println(); 
                               System.out.println("|----------------------------------------------------------------|");
                               System.out.println("|Warning : Betting on three horses will reduce your profit by 20%|");
                               System.out.println("|----------------------------------------------------------------|");
                               System.out.println("Are you sure you want to continue? Enter y or n");
                               char war=in.next().charAt(0); 
                               if (war=='y' || war=='Y')
                               {
                                   if (war=='y' || war=='Y')
                                   {
                                      System.out.println();
                                      System.out.println("Choose 3 numbers from the INs(Identification numbers) of the horses from 1 to 10 on whom you want to place your bet");
                                      int h1=in.nextInt();
                                      int h2=in.nextInt();
                                      int h3=in.nextInt();
                                      System.out.println("Enter the amount of bet(Max 1000$)");
                                      double amt=in.nextDouble();
                                      int result=(int)Math.floor(Math.random() * (10 - 1 + 1)) + 1; //Determines a random winner
                                      //checks whether user won or lost and displays the result
                                      System.out.println("The results have been announced!Type r to see the results.");
                                      String nul=in.next();
                                      nul=nul.toLowerCase();
                                      if ("r".equals(nul))
                                      {
                                         if (result==h1 || result==h2 || result==h3)
                                         {
                                           PrizeCalculator(50,amt,result); 
                                         }
                                         else
                                         {
                                           CS(result,amt);
                                         }
                                      }
                                   }
                               }
                               if (war=='n' || war=='N')
                               {
                                   BMT(); //terminates program
                               }
                            }
                            if (c==4)
                            {
                               System.out.println(); 
                               System.out.println("|---------------------------------------------------------------|");
                               System.out.println("|Warning : Betting on four horses will reduce your profit by 30%|");
                               System.out.println("|---------------------------------------------------------------|");
                               System.out.println("Are you sure you want to continue? Enter y or n");
                               char war=in.next().charAt(0);
                               if (war=='y' || war=='Y')
                               {
                                   if (war=='y' || war=='Y')
                                   {
                                      System.out.println();
                                      System.out.println("Choose 4 numbers from the INs(Identification numbers) of the horses from 1 to 10 on whom you want to place your bet");
                                      int h1=in.nextInt();
                                      int h2=in.nextInt();
                                      int h3=in.nextInt();
                                      int h4=in.nextInt();
                                      System.out.println("Enter the amount of bet(Max 1000$)");
                                      double amt=in.nextDouble();
                                      int result=(int)Math.floor(Math.random() * (10 - 1 + 1)) + 1; //Determines a random winner
                                      //checks whether user won or lost and displays the result
                                      System.out.println("The results have been announced!Type r to see the results.");
                                      String nul=in.next();
                                      nul=nul.toLowerCase();
                                      if ("r".equals(nul))
                                      {
                                      if (result==h1 || result==h2 || result==h3 || result==h4)
                                      {
                                        PrizeCalculator(40,amt,result); 
                                      }
                                      else
                                      {
                                        CS(result,amt);
                                      }
                                    }
                                  }
                               }
                               if (war=='n' || war=='N')
                               {
                                  BMT(); //terminates program
                               }
                            }
                     }  
                 }
                 if (b=='k' || b=='K')
                 {
                     System.out.println();
                     //Asks the user whether he wants to view list of participants or proceed to place a bet
                     System.out.println("Enter \"show\" to display participants of Kentucky or \"continue\" to place bet");
                     String z=in.next();
                      z=z.toLowerCase();
                     //Determines user's choice
                     if ("show".equals(z))
                        {
                            // Displays the list of participants
                            System.out.println();
                            HorsesInK();
                        }
                     if ("continue".equals(z) || "show".equals(z))
                     {
                          System.out.println();
                          System.out.println("Enter the number of horses you want to bet on");
                          int c=in.nextInt();
                          if (c>2)
                          {
                               System.out.println();
                               System.out.println("Sorry, you can bet only on a maximum number of 2 horses");
                               System.exit(0);                           
                          }
                          if (c==1)
                          {
                              System.out.println();
                              System.out.println("Choose from the INs(Identification numbers) of the horses from 1 to 10");
                              int h1=in.nextInt();
                              System.out.println("Enter the amount of bet(Max 1000$)");
                              double amt=in.nextDouble();
                              int result=(int)Math.floor(Math.random() * (10 - 1 + 1)) + 1; //Determines a random winner
                              System.out.println("The results have been announced!Type r to see the results.");
                              String nul=in.next();
                              nul=nul.toLowerCase();
                              if ("r".equals(nul))
                              {
                                  //checks whether user won or lost and displays the result
                                  if (result==h1)
                                  {
                                      PrizeCalculator(80,amt,result); //Calculates and displays prize money
                                  }
                                  else
                                  {
                                     CS(result,amt);
                                  }
                              }
                          }
                          if (c==2)
                          {
                              System.out.println();
                              System.out.println("|--------------------------------------------------------------|");
                              System.out.println("|Warning : Betting on two horses will reduce your profit by 10%|");
                              System.out.println("|--------------------------------------------------------------|");
                              System.out.println("Are you sure you want to continue? Enter y or n");
                              char war=in.next().charAt(0);
                              if (war=='y' || war=='Y')
                              {
                                   System.out.println();
                                   System.out.println("Choose 2 numbers from the INs(Identification numbers) of the horses from 1 to 10 on whom you want to place your bet");
                                   int h1=in.nextInt();
                                   int h2=in.nextInt();
                                   System.out.println("Enter the amount of bet(Max 1000$)");
                                   double amt=in.nextDouble();
                                   int result=(int)Math.floor(Math.random() * (10 - 1 + 1)) + 1; //Determines a random winner
                                   //checks whether user won or lost and displays the result
                                   System.out.println("The results have been announced!Type r to see the results.");
                                      String nul=in.next();
                                      nul=nul.toLowerCase();
                                      if ("r".equals(nul))
                                      {
                                   if (result==h1 || result==h2)
                                   {
                                      PrizeCalculator(70,amt,result);
                                   }
                                   else
                                   {
                                      CS(result,amt);
                                   }
                                }
                              }
                              if (war=='n' || war=='N')
                              {
                                  BMT(); //terminates program
                              }
                          }
                     }
                 }
            }
        }
        System.out.println(); 
        System.out.println("Thank you for using our machine");
        System.out.println("Do you want to place another bet?If yes then type \"y\" else type \"n\"");
        System.out.println(); 
        char xd=in.next().charAt(0);
        if (xd=='y' || xd=='Y')
        {     
        }
        if (xd=='n' || xd=='N')
        {
           abc++;
           BMT();
        }
    }
  }
}
