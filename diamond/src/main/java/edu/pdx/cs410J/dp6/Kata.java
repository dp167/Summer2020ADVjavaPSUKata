package edu.pdx.cs410J.dp6;
/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
  static char[] Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

  public static void main(String[] args) {

    String temp = args[0];
    char abs = temp;
    int ascii = Integer.parseInt(temp);
    System.out.println(temp);


  }
}
/*

  A
 B B
C   C

J = direction down
K = driection over  K = J - N

 */