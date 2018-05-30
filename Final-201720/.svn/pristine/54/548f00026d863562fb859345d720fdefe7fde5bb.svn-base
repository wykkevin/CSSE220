package sll;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SinglyLinkedListTest {

	SinglyLinkedList emptyList, list, list2, list3;

	@Before
	public void setUp() {
		this.emptyList = new SinglyLinkedList();
		this.list = new SinglyLinkedList();
		populateList(this.list, new String[] { "A", "B", "C", "D", "E" });

		this.list2 = new SinglyLinkedList();
		populateList(this.list2, new String[] { "w", "x", "v", "q" });

		this.list3 = new SinglyLinkedList();
		populateList(this.list3, new String[] { "1", "2", "3" });

	}

	/*
	 * Populates the list with the items in the given array, in the order
	 * they're given in the array.
	 */
	private void populateList(SinglyLinkedList list, String[] items) {
		for (int i = items.length - 1; i >= 0; i--) {
			list.addFirst(items[i]);
		}
	}

	@After
	public void tearDown() throws Exception {
		this.emptyList = null;
		this.list = null;
		this.list2 = null;
		this.list3 = null;
	}

	@Test
	public void testRemoveFirstXElements() {
		// list is A B C D E
		this.list.removeFirstXElements(2);
		assertEquals("E", list.removeLast());
		assertEquals("D", list.removeLast());
		assertEquals("C", list.removeLast());
		assertEquals(null, list.removeLast());

		// list2 is w x v q
		this.list2.removeFirstXElements(0);
		assertEquals("q", list2.removeLast());
		assertEquals("v", list2.removeLast());
		assertEquals("x", list2.removeLast());
		assertEquals("w", list2.removeLast());
		assertEquals(null, list2.removeLast());

		// list3 is 1 2 3
		this.list3.removeFirstXElements(4);
		assertEquals(null, list3.removeLast());

		// emptyList is empty
		this.list.removeFirstXElements(3);
		assertEquals(null, emptyList.removeLast());

	}

	@Test
	public void testDuplicateGivenElement() {
		// list is A B C D E
		this.list.addFirst("E");
		this.list.duplicateGivenElement("E".substring(0));
		assertEquals("E", list.removeLast());
		assertEquals("E", list.removeLast());
		assertEquals("D", list.removeLast());
		assertEquals("C", list.removeLast());
		assertEquals("B", list.removeLast());
		assertEquals("A", list.removeLast());
		assertEquals("E", list.removeLast());
		assertEquals("E", list.removeLast());
		assertEquals(null, list.removeLast());

		// list2 is w x v q
		this.list2.duplicateGivenElement("d");
		assertEquals("q", list2.removeLast());
		assertEquals("v", list2.removeLast());
		assertEquals("x", list2.removeLast());
		assertEquals("w", list2.removeLast());
		assertEquals(null, list2.removeLast());

		// list3 is 1 2 3
		this.list3.duplicateGivenElement("12".substring(1));
		// the line above is equivalent to calling duplicateGivenElement("2")
		// but
		// ensures comparisons in your list are done properly.
		assertEquals("3", list3.removeLast());
		assertEquals("2", list3.removeLast());
		assertEquals("2", list3.removeLast());
		assertEquals("1", list3.removeLast());
		assertEquals(null, list3.removeLast());

		// emptyList is empty
		this.list.duplicateGivenElement("a");
		assertEquals(null, emptyList.removeLast());

	}

	@Test
	public void testFindAndRemoveLargest() {
		// list is A B C D E
		assertEquals("E", this.list.findAndRemoveLargest());
		assertEquals("D", list.removeLast());
		assertEquals("C", list.removeLast());
		assertEquals("B", list.removeLast());
		assertEquals("A", list.removeLast());
		assertEquals(null, list.removeLast());
		
		// list2 is w x v q
		assertEquals("x", this.list2.findAndRemoveLargest());
		assertEquals("q", list2.removeLast());
		assertEquals("v", list2.removeLast());
		assertEquals("w", list2.removeLast());
		assertEquals(null, list2.removeLast());
		
		//list 3 is "1"
		this.list3.removeLast();
		this.list3.removeLast();
		assertEquals("1", this.list3.findAndRemoveLargest());
		assertEquals(null, list3.removeLast());
		
		SinglyLinkedList firstIsLargest = new SinglyLinkedList();
		populateList(firstIsLargest, new String[] {"3","2","1"});
		assertEquals("3", firstIsLargest.findAndRemoveLargest());
		assertEquals("1", firstIsLargest.removeLast());
		assertEquals("2", firstIsLargest.removeLast());
		assertEquals(null, firstIsLargest.removeLast());
		
		//empty list
		assertEquals(null, emptyList.findAndRemoveLargest());
		assertEquals(null, emptyList.removeLast());
		
	}
}
