/**
 * A linked list node that contains a value and 
 * a pointer to the next node in the list. This allows
 * for iterating over this list because each node is linked
 * to the following node based on the next reference.
 */
public class LinkedList {
  public int value;
  public LinkedList next;

  LinkedList(int _value) {
    value = _value;
    next = null;
  }
}