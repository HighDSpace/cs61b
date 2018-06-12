import list.*;

public class hostileApplication {
	public static void main(String[] args) {
		DList myList = new DList();
  		DList newList = new DList();
	  	System.out.println("Try to print 'sentinel': ");
  		newList.insertFront("hello");
  		System.out.println(myList.prev(newList.front()).item);
  	}
} 