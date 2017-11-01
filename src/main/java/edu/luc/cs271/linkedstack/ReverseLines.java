package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  public static void main(final String[] args) {
    // DONE read successive input lines until EOF, then print out in reverse order

    /* Stack<String> lineStack = new Stack<String>();

    final Scanner input = new Scanner(System.in);
    String line;
    while ((line = input.nextLine()) != null) {
      lineStack.push(line);
    }

    while (lineStack.isEmpty()) {
      System.out.println(lineStack.peek());
      lineStack.pop();
    }*/
    System.out.println("ReversedLines Executed");
    final Scanner input = new Scanner(System.in);
    printReverse(input);
  }

  private static void printReverse(final Scanner input) {
    // DONE recursively read and print successive input lines until EOF, then print them out in
    // reverse order
    String line;
    LinkedStack<String> newStack = new LinkedStack<String>();
    while ((line = input.nextLine()) != null) {
      if (line == null) {
        break;
      } else {
        newStack.push(line);
        System.out.println("Push Executed");
        printReverse(input);
      }
    }
    while (!newStack.isEmpty()) {
      System.out.println(newStack.pop());
    }
  }
}
