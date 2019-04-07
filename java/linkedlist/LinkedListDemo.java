/**
 * This is a demonstration of a simple Java linked list.
 *
 * The first step is to call a method that creates a linked list
 * using our LinkedList class.
 * 
 * The next step is to iterate over it printing the value of
 * each node.
 */
public class LinkedListDemo {
  public static void main(String args[]) {
    // build our linked list
    LinkedList first = buildList(10);
  
    // test our linked list
    LinkedList current = first;
    while(current.next != null) {
      System.out.println(current.value);
      current = current.next;
    }
  }

  /**
   * Builds a linked list with numbers based on the set
   * amount.
   * 
   * @param {int} amount The number of nodes to add.
   * @return {LinkedList}
   */
  private static LinkedList buildList(int amount) {
    LinkedList first = new LinkedList(0);
    LinkedList current = first;
    for (int i = 1; i <= amount; i++) {
      LinkedList nextList = new LinkedList(i);
      current.next = nextList;
      current = nextList;
    }

    return first;
  }
}