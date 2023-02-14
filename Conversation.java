import java.util.Scanner;
import java.util.Random;

class Conversation {
  public static void main(String[] arguments) {
    int rounds = 1;
    int counter = 1 ;
    String user_sentence = "";
    String user_reply = "";
    //array to hold replacements
    String [] canned_responses = {"Mmm-hmm.", "Okay.", "Nice."};
    String[][] replacements = {{"you ", "me "}, 
                              {"i'm", "you are"},
                              {"i am", "you are"},
                              {"you are", "I am"},
                              {"me ", "you "},
                              {"your ", "my "},
                              {"my ", "your "}
                            };

    Scanner user_rounds = new Scanner(System.in);
    Scanner userInput = new Scanner(System.in);
    Scanner userInput2 = new Scanner(System.in);

    System.out.println("Talk to me!");
    System.out.println("How many times do you want to talk to me? ");
    rounds = user_rounds.nextInt();
    while (counter <= rounds) {
      counter++;
      System.out.print("Hi! Whatcha doin'? ");
      user_sentence = userInput.nextLine();

      //if (user_sentence.contains();
      //loop over the array and replace
      for(String[] replacement: replacements) {
        user_sentence = user_sentence.replace(replacement[0], replacement[1]);
      }
      System.out.println(user_sentence);
      user_reply = userInput2.nextLine();
      Random random_number = new Random();
      System.out.println(canned_responses[random_number.nextInt(3)]);


      

    }
    // You will start the conversation here.
    user_rounds.close();
    userInput.close();
    userInput2.close();
    System.out.println("Bye!");
  }}






  
  
  
