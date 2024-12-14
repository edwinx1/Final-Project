class InputValidator {

  public int getUserInput(Scanner scanner) 
  {
      while 
      (!scanner.hasNextInt()) {
            System.out.println("Invaid entry, please enter a number.");
         scanner.next();
        }
     return scanner.nextInt();
    }
}