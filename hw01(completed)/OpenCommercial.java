/* OpenCommercial.java */

import java.net.*;
import java.io.*;

/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();

    /* Replace this comment with your solution.  */
    String str_url = "http://www."+inputLine+".com/" ;
    URL url = new URL(str_url);
    BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
    print_lines(reader, 5);
  }

  private static void print_lines (BufferedReader reader, int i) throws Exception{
    String i_line = reader.readLine();
    if (i <= 0) {
      return;
    }
    else {
      print_lines(reader, i-1);
    }
    System.out.println(i_line);
  }




}