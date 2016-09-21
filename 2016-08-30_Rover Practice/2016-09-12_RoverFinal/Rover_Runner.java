
/**
 * Write a description of class Rover_Runner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class Rover_Runner
{        
    
    public static void main(String args[]){
        // Make a Scanner
        SimpleScanner input = new SimpleScanner();
        
        System.out.println("What is your rover's name?");
        String name;
        name = input.readString();
        System.out.println("Your rover is " + name + ".");
        
        Rover r1 = new Rover(name);
        boolean running = true;
        int power = 100;
        String exitCommand = "quit";
        
        System.out.println();
        System.out.println("___________________________________");
        System.out.println("              Commands");
        System.out.println(" move: To move a distance forward.");
        System.out.println("       right: to turn right.");
        System.out.println("        left: to turn left.");
        System.out.println("    picture: to take a picture.");
        System.out.println("     quit: to stop the program.");
        System.out.println("    charge: to charge your rover.");
        System.out.println("___________________________________");
        System.out.println();
        
        while (running) {                
            System.out.println(name + " is " + power + " percent charged.");
                if (power <= 0){
                    System.out.println(name + " has run out of power.");
                    running = false;
                }
                else{
                    System.out.println("Enter a command:");
                    String command = input.readString();
                    
                        if(command.equals("move")){
                            power -= 25;
                            r1.move();
                            System.out.println(name + " moved.");
                        }
                        else if(command.equals("right")){
                            r1.rotateRight();
                        }
                        else if(command.equals("left")){
                            r1.rotateLeft();
                        }
                        else if(command.equals("picture")){
                            power -= 15;
                            System.out.println("____________________________________");
                            System.out.println("             Filters");
                            System.out.println("             hipster");
                            System.out.println("        black and white");
                            System.out.println("            no filter");
                            System.out.println("____________________________________");
                            System.out.println("What filter would you like to use?");
                            String filter = input.readString();
                                if (filter.equals("hipster")){
                                    r1.takePicture();
                                    System.out.println("while using the " + filter + " filter.");
                                }
                                else if (filter.equals("black and white")){
                                    r1.takePicture();
                                    System.out.println("while using the " + filter + " filter.");
                                }
                                else if (filter.equals("no filter")){
                                    r1.takePicture();
                                    System.out.println("while using the " + filter + " filter.");
                                }
                                else{
                                    System.out.println("Not a vaild filter name.");
                        }
                        }
                        else if(command.equals("charge")){
                            power = 100;
                            System.out.println(name + "has charged to " + power + " percent.");
                        }
                        else if(command.equals("quit")){
                            running = false;
                        }
                        else{
                            System.out.print("Invalid Command");
                        }
            }
        }
        System.out.println("Goodbye");
    }
}
