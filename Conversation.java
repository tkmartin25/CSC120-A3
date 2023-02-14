import java.util.Scanner;

class Conversation {

  public static void main(String[] arguments) {
    int rounds = 1;
    int x = 1;
    String user_sentence = "";

    Scanner user_rounds = new Scanner(System.in);
    Scanner userInput = new Scanner(System.in);

    System.out.println("Talk to me!");
    System.out.println("How many times do you want to talk to me? ");
    rounds = user_rounds.nextInt();
    while (x <= rounds) {
      x = x + 1;
      System.out.print("Hi! Whatcha doin'? ");
      user_sentence = userInput.nextLine();
      System.out.println(user_sentence.replace("I'm", "You are").replace("I am", "You are"));


      

    }
    // You will start the conversation here.
    user_rounds.close();
    userInput.close();
    System.out.println("Bye!");
  }}






  
