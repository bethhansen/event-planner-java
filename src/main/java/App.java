import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    
    System.out.println("Welcome to Trivassi's event planning let us handle the event for you!");
    System.out.println("How many guests do you expect to have?");
    int inputGuests = Integer.parseInt(myConsole.readLine());
    System.out.println("What type of cuisine would you like to have - 'Mexican': $5/plate, 'Italian': $10/plate or 'French': $15/plate ");
    String inputFood = myConsole.readLine();
    System.out.println("Would you like to have a 'Cash Bar' or 'Open Bar'?");
    String inputBeverages = myConsole.readLine();
    System.out.println("Cool now for the last question...Would you like to have a 'DJ' or 'Live Band'?");
    String inputEntertainment = myConsole.readLine();

    Event userEvent = new Event(inputGuests, inputFood, inputBeverages, inputBeverages);

    System.out.println("Looks like your total will be $" + userEvent.calcPrice());
  }
}
