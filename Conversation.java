import java.util.Scanner;
import java.util.Random;

class Conversation {
  public static void main(String[] arguments) {
    int rounds = 1;
    int counter = 1 ;
    String user_sentence = "";
    String user_reply = "";
    // array to hold replacements
    String [] canned_responses = {"Mmm-hmm.", "Okay.", "Nice.", "I see.", "I get that.", "Aha.", "Real."};
    String[][] mirrored_words = {{"you", "me"}, 
                              {"i'm", "you are"},
                              {"i", "you"},
                              {"you are", "I am"},
                              {"me", "you"},
                              {"your", "my"},
                              {"my", "your"},
                              {"i", "you"},
                              {"am", "are"}
                            
                            };

    Scanner user_rounds = new Scanner(System.in);
    Scanner userInput = new Scanner(System.in);
    Scanner userInput2 = new Scanner(System.in);

    // chatbot initiation
    System.out.println("Talk to me!");
    System.out.println("How many times do you want to talk to me? ");
    // storing how many times the user wants to talk
    rounds = user_rounds.nextInt();
    // while loop to talk user-specified number of times
    while (counter <= rounds) {
      // counter incrementer
      counter++;
      // conversation initator
      System.out.print("Hi! Whatcha doin'? ");
      // user first response
      user_sentence = userInput.nextLine();
      // format user_sentence for analysis
      // lowercase
      user_sentence = user_sentence.toLowerCase();
      // splitting to get rid of spaces
      String[] split = user_sentence.split(" ");
      // if any elemnts are mirror words, replace them and print new response with changes. Else, print ""
      // if sentence contains mirrored words:
        for (String element : split) {
          if (element == "i") {
            element.replace("i", "you");
          }
          
          }
          // Print out changed response
          System.out.println(user_sentence);
      // else:
        // generate random number
        Random random_number = new Random();
        // print random canned response using random number generated above
        System.out.println(canned_responses[random_number.nextInt(6)]);
        }
    
    // You will start the conversation here.
    user_rounds.close();
    userInput.close();
    userInput2.close();
    System.out.println("Bye!");
  
  }}







  
  
  
