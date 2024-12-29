import java.util.Random;
import java.util.Scanner;

public class RPS {
  @SuppressWarnings("resource")
  public static void main(String[] args) {
    int i;
    int cpoint = 0;
    int upoint = 0;
    Random rnd = new Random();
    Scanner sc = new Scanner(System.in);
    int cinp = rnd.nextInt(3);

    System.out.println("Welcome to the Game of Rock Paper and Scissors");
    System.out.print("Enter Your Name: ");
    String name = sc.nextLine();

    System.out.print("Enter the number of rounds: ");
    int round = sc.nextInt();
    
    for(i = 0; i < round; i++){
      System.out.printf("\n---------------------------Round %d---------------------------- \n1 for Rock \t 2 for Paper \t 3 for Scissors\n" , i + 1);
      System.out.print("Enter your Choice:");
      int uinp = sc.nextInt();
      System.out.println();
      uinp--;
      switch (cinp) {
        case 0 -> {
            switch (uinp) {
                case 0 -> System.out.println("You both choosed Rock. It's a tie");
                case 1 -> {
                    System.out.println("Computer choosed Rock\tYou choosed Paper\nCongratulation! You Won this Round.");
                    upoint++;
                }
                case 2 -> {
                    System.out.println("Computer choosed Rock\tYou choosed Scissors\nOops! Computer won this Round.");
                    cpoint++;
                }
                default -> System.out.println("Invalid Input\n");
            }
        }
        case 1 -> {
            switch (uinp) {
                case 0 -> {
                    System.out.println("Computer choosed Paper\tYou choosed Rock\nOops! Computer won this Round.");
                    cpoint++;
                }
                case 1 -> System.out.println("You both choosed Paper. It's a tie");
                case 2 -> {
                    System.out.println("Computer choosed Paper\tYou choosed Scissors\nCongratulation! You won this Round.");
                    upoint++;
                }
                default -> System.out.println("Invalid Input\n");
            }
        }
        case 2 -> {
            switch (uinp) {
                case 1 -> {
                    System.out.println("Computer choosed Scissors\tYou choosed Paper\nOops! Computer Won this Round.");
                    cpoint++;
                }
                case 2 -> System.out.println("You both choosed Scissors. It's a tie");
                case 0 -> {
                    System.out.println("Computer choosed Scissors\tYou choosed Rock\nCongratulation! You Won won this Round.");
                    upoint++;
                }
                default -> System.out.println("Invalid Input");
            }
        }
        default -> {
          System.out.println("Something went Wrong!");
        }
      }
      System.out.printf("\nRound Points \tComputer point = %d\t %s point = %d.\n" , cpoint , name , upoint);
    }
    if (cpoint == upoint){
      System.out.printf("\nFinal Points \tComputer point = %d\t %s point = %d.\nIt's a Draw." , cpoint , name , upoint);
    }
    else if(cpoint < upoint){
      System.out.printf("\nFinal Points \tComputer point = %d\t %s point = %d.\nCongratulation! %s won this Game." , cpoint ,name , upoint , name);
    }
    else{
      System.out.printf("\nFinal Points \tComputer point = %d\t %s point = %d.\nOpps! %s lost this Game." , cpoint , name, upoint , name);
    }
    System.out.println("\nThank you for playing the game!");
    }
  }