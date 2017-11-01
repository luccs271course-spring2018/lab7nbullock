package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  public static void main(final String[] args) {
    // DONE read successive input lines until EOF, then print out in reverse order

     Stack<String> lineStack = new Stack<String>();

    final Scanner input = new Scanner(System.in);
    String line;
    while ((line = input.nextLine()) != null) {
      lineStack.push(line);
    }

    while (lineStack.isEmpty()) {
      System.out.println(lineStack.peek());
      lineStack.pop();
    }

    


    }



  }
}
