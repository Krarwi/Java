import java.util.Scanner; // Imports it

public class JavaGameshow {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int question = 0;
        int questionmove = 0;
        System.out.println("Welcome to the Java gameshow!!!");
        System.out.println("this was a pain to program");
        try {
                Thread.sleep(1000); // Waits 3 seconds
            } catch (InterruptedException e) { // Stops it from erroring
                e.printStackTrace();
            }
        System.out.println("Select your prefered difficulty: ");
        System.out.println("1- Practice ");
        System.out.println("2- Normal ");
        String choice12 = scanner.next();
        
        if (choice12.equals("1")) {
                System.out.println("You chose practice difficulty");
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                            do {
                System.out.println("Who was the leader of France in the early 1800s?");
                System.out.println("1- Napoleon Bonaparte");
                System.out.println("2- Louis XVI");
                System.out.println("3- Francois Marie Charles Fourier");
                System.out.println("Enter your choice or type q to quit:");

                String choice = scanner.next(); // Takes the user input util scanner into use

                if (choice.equals("1")) { // If you type "1" then you get this
                    System.out.println("You chose number 1!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace(); // I dont know what the fuck this does but ok
                    }
                    System.out.println("Correct!");
                    System.out.println("Onto to the next question!");
                    question = question + 1; // Makes you move onto the next question
                } else if (choice.equals("2")) {
                    System.out.println("You chose number 2!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Wrong!");
                    System.out.println("Better luck next time.");
                } else if (choice.equals("3")) {
                    System.out.println("You chose number 3!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace(); 
                    }
                    System.out.println("Wrong!");
                    System.out.println("Better luck next time.");
                } else if (choice.equalsIgnoreCase("q")) {
                    System.out.println("The game will end now!");
                    break;
                } else {
                    System.out.println("Not a choice, try again");
                }
            } while (question == 0);  // I dont know why Java puts the while at the bottom and makes you put a "do" statement, its utterly fucking stupid

            do {
                System.out.println("What was a major event that happened in 2008?");
                System.out.println("1- Operation Desert Storm");
                System.out.println("2- The Star Wars reboot movies came out");
                System.out.println("3- The Stock Market Crash");
                System.out.println("Enter your choice or type q to quit:");

                String choice = scanner.next();

                if (choice.equals("1")) {
                    System.out.println("You chose number 1!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Wrong!");
                    System.out.println("Better luck next time.");
                } else if (choice.equals("2")) {
                    System.out.println("You chose number 2!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Wrong!");
                    System.out.println("Better luck next time.");
                } else if (choice.equals("3")) {
                    System.out.println("You chose number 3!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Correct!");
                    System.out.println("Onto to the next question!");
                    question = question + 1;
                } else if (choice.equalsIgnoreCase("q")) {
                    System.out.println("The game will end now!");
                    break;
                } else {
                    System.out.println("Not a choice, try again");
                }
            } while (question == 1);

            do {
                System.out.println("Who is the creator of Minecraft?");
                System.out.println("1- Markus Persson");
                System.out.println("2- Jens Bergensten");
                System.out.println("3- Microsoft");
                System.out.println("Enter your choice or type q to quit:");

                String choice = scanner.next();

                if (choice.equals("1")) {
                    System.out.println("You chose number 1!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Correct!");
                    System.out.println("Onto the next question!");
                    question = question + 1;
                } else if (choice.equals("2")) {
                    System.out.println("You chose number 2!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Wrong!");
                    System.out.println("Better luck next time.");
                } else if (choice.equals("3")) {
                    System.out.println("You chose number 3!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Wrong!");
                    System.out.println("Better luck next time.");
                } else if (choice.equalsIgnoreCase("q")) {
                    System.out.println("The game will end now!");
                    break;
                } else {
                    System.out.println("Not a choice, try again");
                }
            } while (question == 2);
            
            do {
                System.out.println("Who was the 43rd President of the United States?");
                System.out.println("1- Donald Trump");
                System.out.println("2- Barack Obama");
                System.out.println("3- George Bush");
                System.out.println("Enter your choice or type q to quit:");

                String choice = scanner.next();

                if (choice.equals("1")) {
                    System.out.println("You chose number 1!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Wrong!");
                    System.out.println("Better luck next time.");
                } else if (choice.equals("2")) {
                    System.out.println("You chose number 2!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Wrong!");
                    System.out.println("Better luck next time.");
                } else if (choice.equals("3")) {
                    System.out.println("You chose number 3!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Correct!");
                    System.out.println("Onto the next question!");
                    question = question + 1;
                } else if (choice.equalsIgnoreCase("q")) {
                    System.out.println("The game will end now!");
                    break;
                } else {
                    System.out.println("Not a choice, try again");
                }
            } while (question == 3);
            
            do {
                System.out.println("What is the current world population?");
                System.out.println("1- 7.9 billion");
                System.out.println("2- 8 billion");
                System.out.println("3- 7 billion");
                System.out.println("Enter your choice or type q to quit:");

                String choice = scanner.next();

                if (choice.equals("1")) {
                    System.out.println("You chose number 1!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Wrong!");
                    System.out.println("Better luck next time.");
                } else if (choice.equals("2")) {
                    System.out.println("You chose number 2!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Correct!");
                    System.out.println("Onto the next question!");
                    question = question + 1;
                } else if (choice.equals("3")) {
                    System.out.println("You chose number 3!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Wrong!");
                    System.out.println("Better luck next time.");
                } else if (choice.equalsIgnoreCase("q")) {
                    System.out.println("The game will end now!");
                    break;
                } else {
                    System.out.println("Not a choice, try again");
                }
            } while (question == 4);
            
            System.out.println("You got " + question + " questions right!");
            scanner.close(); // Closes the user input scanner thing
      } else if (choice12.equals("2")) {
                System.out.println("You chose normal difficulty");
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        try {
                Thread.sleep(3000); // Waits 3 seconds
            } catch (InterruptedException e) { // Stops it from erroring
                e.printStackTrace();
            }
                            do {
                System.out.println("Who was the leader of France in the early 1800s?");
                System.out.println("1- Napoleon Bonaparte");
                System.out.println("2- Louis XVI");
                System.out.println("3- Francois Marie Charles Fourier");
                System.out.println("Enter your choice or type q to quit:");

                String choice = scanner.next();

                if (choice.equals("1")) {
                    System.out.println("You chose number 1!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Correct!");
                    System.out.println("Onto to the next question!");
                    question = question + 1;
                    questionmove = questionmove + 1;
                } else if (choice.equals("2")) {
                    System.out.println("You chose number 2!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Wrong!");
                    System.out.println("Better luck next time.");
                    questionmove = questionmove + 1;
                } else if (choice.equals("3")) {
                    System.out.println("You chose number 3!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace(); 
                    }
                    System.out.println("Wrong!");
                    System.out.println("Better luck next time.");
                    questionmove = questionmove + 1;
                } else if (choice.equalsIgnoreCase("q")) {
                    System.out.println("The game will end now!");
                    break;
                } else {
                    System.out.println("Not a choice, try again");
                }
            } while (questionmove == 0);

            do {
                System.out.println("What was a major event that happened in 2008?");
                System.out.println("1- Operation Desert Storm");
                System.out.println("2- The Star Wars reboot movies came out");
                System.out.println("3- The Stock Market Crash");
                System.out.println("Enter your choice or type q to quit:");

                String choice = scanner.next();

                if (choice.equals("1")) {
                    System.out.println("You chose number 1!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Wrong!");
                    System.out.println("Better luck next time.");
                    questionmove = questionmove + 1;
                } else if (choice.equals("2")) {
                    System.out.println("You chose number 2!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Wrong!");
                    System.out.println("Better luck next time.");
                    questionmove = questionmove + 1;
                } else if (choice.equals("3")) {
                    System.out.println("You chose number 3!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Correct!");
                    System.out.println("Onto to the next question!");
                    question = question + 1;
                    questionmove = questionmove + 1;
                } else if (choice.equalsIgnoreCase("q")) {
                    System.out.println("The game will end now!");
                    break;
                } else {
                    System.out.println("Not a choice, try again");
                }
            } while (question == 1);

            do {
                System.out.println("Who is the creator of Minecraft?");
                System.out.println("1- Markus Persson");
                System.out.println("2- Jens Bergensten");
                System.out.println("3- Microsoft");
                System.out.println("Enter your choice or type q to quit:");

                String choice = scanner.next();

                if (choice.equals("1")) {
                    System.out.println("You chose number 1!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Correct!");
                    System.out.println("Onto the next question!");
                    question = question + 1;
                    questionmove = questionmove + 1;
                } else if (choice.equals("2")) {
                    System.out.println("You chose number 2!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Wrong!");
                    System.out.println("Better luck next time.");
                    questionmove = questionmove + 1;
                } else if (choice.equals("3")) {
                    System.out.println("You chose number 3!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Wrong!");
                    System.out.println("Better luck next time.");
                    questionmove = questionmove + 1;
                } else if (choice.equalsIgnoreCase("q")) {
                    System.out.println("The game will end now!");
                    break;
                } else {
                    System.out.println("Not a choice, try again");
                }
            } while (question == 2);
            
            do {
                System.out.println("Who was the 43rd President of the United States?");
                System.out.println("1- Donald Trump");
                System.out.println("2- Barack Obama");
                System.out.println("3- George Bush");
                System.out.println("Enter your choice or type q to quit:");

                String choice = scanner.next();

                if (choice.equals("1")) {
                    System.out.println("You chose number 1!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Wrong!");
                    System.out.println("Better luck next time.");
                    questionmove = questionmove + 1;
                } else if (choice.equals("2")) {
                    System.out.println("You chose number 2!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Wrong!");
                    System.out.println("Better luck next time.");
                    questionmove = questionmove + 1;
                } else if (choice.equals("3")) {
                    System.out.println("You chose number 3!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Correct!");
                    System.out.println("Onto the next question!");
                    question = question + 1;
                    questionmove = questionmove + 1;
                } else if (choice.equalsIgnoreCase("q")) {
                    System.out.println("The game will end now!");
                    break;
                } else {
                    System.out.println("Not a choice, try again");
                }
            } while (question == 3);
            
            do {
                System.out.println("What is the current world population?");
                System.out.println("1- 7.9 billion");
                System.out.println("2- 8 billion");
                System.out.println("3- 7 billion");
                System.out.println("Enter your choice or type q to quit:");

                String choice = scanner.next();

                if (choice.equals("1")) {
                    System.out.println("You chose number 1!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Wrong!");
                    System.out.println("Better luck next time.");
                    questionmove = questionmove + 1;
                } else if (choice.equals("2")) {
                    System.out.println("You chose number 2!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Correct!");
                    System.out.println("Onto the next question!");
                    question = question + 1;
                    questionmove = questionmove + 1;
                } else if (choice.equals("3")) {
                    System.out.println("You chose number 3!");
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Wrong!");
                    System.out.println("Better luck next time.");
                    questionmove = questionmove + 1;
                } else if (choice.equalsIgnoreCase("q")) {
                    System.out.println("The game will end now!");
                    break;
                } else {
                    System.out.println("Not a choice, try again");
                }
            } while (question == 4);
            System.out.println("You got " + question + " questions right!");
            scanner.close();
            } 
    }
    }
