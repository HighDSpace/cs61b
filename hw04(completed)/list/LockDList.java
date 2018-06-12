
package list;

public class LockDList extends DList {
	public void lockNode(DListNode node) {
		if(node instanceof LockDListNode) {
			LockDListNode theNode = (LockDListNode)node;
			theNode.isLocked = true;
		}	
	}

  	protected DListNode newNode(Object item, DListNode prev, DListNode next) {
    	return new LockDListNode(item, prev, next);
  	}

    public void remove(DListNode node) {
  		if(node instanceof LockDListNode) {
  			LockDListNode theNode = (LockDListNode)node;
  			if(theNode.isLocked) {
  				return;
  			}
  		}
  		super.remove(node);
  	}	

  	public static void main(String[] args) {
  	  	LockDList myList = new LockDList();

  	  	System.out.println("Test insertFront(), isEmpty(), length(), toString(): ");
	  	myList.insertFront("2");
	  	myList.insertFront("1");
	  	myList.insertFront("0");
	  	System.out.println("What's in the list: " + myList);
	  	System.out.println("Is the list empty: " + myList.isEmpty());
	  	System.out.println("What's the list's length: " + myList.length());
	  	System.out.println();
	  	System.out.println();
	
	  	System.out.println("Test insertBack(), isEmpty(), length(), toString(): ");
		myList.insertBack("3");
		myList.insertBack("4");  	
	  	System.out.println("What's in the list: " + myList);
	  	System.out.println("Is the list empty: " + myList.isEmpty());
	  	System.out.println("What's the list's length: " + myList.length());
	  	System.out.println();
	  	System.out.println();
	
	  	System.out.println("Test front(): ");
	  	System.out.println(myList.front().item);
	  	System.out.println();
	  	System.out.println();
	
	  	System.out.println("Test back(): ");
	  	System.out.println(myList.back().item);
	  	System.out.println();
	  	System.out.println();
	
	  	System.out.println("Test next(): ");
	  	System.out.println("What's in the second node: " + myList.next(myList.front()).item);
	  	System.out.println();
	  	System.out.println();
	
	  	System.out.println("Test prev(): ");
	  	System.out.println("What's in the second node from the back: " + myList.prev(myList.back()).item);
	  	System.out.println();
	  	System.out.println();
	
	  	System.out.println("Test insertAfter(): ");
	  	myList.insertAfter("0.5", myList.front());
	  	System.out.println(myList);
	  	System.out.println();
	  	System.out.println();
	
	  	System.out.println("Test insertBefore(): ");
	  	myList.insertBefore("3.5", myList.back());
	  	System.out.println(myList);
	  	System.out.println();
	  	System.out.println();
	
	  	System.out.println("Test remove(): ");
	  	myList.remove(myList.back());
	  	System.out.println(myList);
	  	System.out.println();
	  	System.out.println();	

	  	System.out.println("Test lockNode(): ");
	  	myList.lockNode(myList.back());
	  	myList.remove(myList.back());
	  	System.out.println(myList);
	  	System.out.println();
	  	System.out.println();	
	}

}