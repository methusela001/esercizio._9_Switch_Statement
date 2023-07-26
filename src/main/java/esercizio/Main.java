package esercizio;

import java.util.Scanner;

//  Switch Statement
public class Main {
    /*
       Loop infinite times asking the user to input a number between 1 and 10
      Print the name of the number (e.g. 5 --> five)
      If the user input a number lower than 1 or greater than 10, print Cannot give you the name
     */
    public static void main(String[] args) {
        int number = 7;
           while (true){

            System.out.println("inserisci un numero da 1 a 10");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();

                       switch (number){

                            case 1:
                                System.out.println("uno");
                                break;
                            case 2:
                                System.out.println("due");
                                break;
                            case 3:
                                System.out.println("tre");
                                break;
                            case 4:
                                System.out.println("quattro");
                                break;
                            case 5:
                                System.out.println("cinque");
                                break;
                            case 6:
                                System.out.println("sei");
                                break;
                            case 7:
                                System.out.println("sette");
                                break;
                            case 8:
                                System.out.println("otto");
                                break;
                            case 9:
                                System.out.println("nove");
                                break;
                            case 10:
                                System.out.println("dieci");
                                break;
                            default:
                                System.out.println("The emd ");

                        }        }

                }

    }

           /* switch (number){
                case 1 ->       System.out.println("one");
                case 2 ->       System.out.println("two");
                case 3 ->       System.out.println("three");
                case 4 ->       System.out.println("four");
                case 5 ->       System.out.println("five");
                case 6 ->       System.out.println("six");
                case 7 ->       System.out.println("seven");
                case 8 ->       System.out.println("eight");
                case 9 ->       System.out.println("nine");
                case 10 ->      System.out.println("ten");
                default ->      System.out.println("end");




            }
        }
    }
}
*/
