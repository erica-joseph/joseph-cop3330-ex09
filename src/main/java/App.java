import java.util.Scanner;
/**
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erica Joseph
 */
public class App {
    public static void main(String[] args) {
        //initiate scannner
        Scanner sc = new Scanner(System.in);

        //write out
        System.out.print("What is the length of the room in question? ");
        double len = sc.nextInt();
        System.out.print("What is the width of the room in question? ");
        double wid = sc.nextInt();

        double currentSquare = len * wid;
        double neededGallon = Math.ceil(currentSquare/350);

        System.out.print("You will need to purchase "+ neededGallon +" gallons of paint to cover "+ currentSquare +" square feet.");

    }
}
