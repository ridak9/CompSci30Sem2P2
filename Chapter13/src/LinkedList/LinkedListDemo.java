package LinkedList;

public class LinkedListDemo 
{

	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();

		list.addAtFront("Sachar");
		list.addAtFront("Osborne");
		list.addAtFront("Suess");
		System.out.println("List has " + list.size() + " items.");
		System.out.println(list);

		list.addAtEnd("Blume");
		list.addAtEnd("Dahl");
		System.out.println(list);

		list.makeEmpty();
		System.out.println("List has " + list.size() + " items.");
		System.out.println(list);
		
	}

}
