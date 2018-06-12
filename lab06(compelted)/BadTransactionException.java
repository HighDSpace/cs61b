/* BadTransactionException.java */

/**
 *  Implements an exception that should be thrown for bad transaction.
 **/
public class BadTransactionException extends Exception {
  /**
   *  Creates an exception object for bad transaction.
   **/
  public BadTransactionException(int badAmount) {
    super("Invalid amount: " + badAmount);
  }
}