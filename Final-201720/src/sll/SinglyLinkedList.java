package sll;

/*
 * A linked list class for storing Strings
 */
public class SinglyLinkedList {

	private class Node {
		public Node(String data, Node next) {
			this.data = data;
			this.next = next;
		}

		public String data;
		public Node next;
	}

	private Node first;

	public SinglyLinkedList() {
		first = null;
	}

	@Override
	public String toString() {
		String toReturn = "[";
		Node current = first;
		while (current != null) {
			if (current != first) {
				toReturn += "->";
			}
			toReturn += current.data;
			current = current.next;
		}
		toReturn += "]";
		return toReturn;
	}

	/**
	 * Removes the first X elements from the list.
	 * 
	 * For example, consider the list: "A" -> "B" -> "C" -> "D" -> "E"
	 * 
	 * removeFirstXElements(2) results in "C" -> "D" -> "E"
	 * removeFirstXElements(0) results in "A" -> "B" -> "C" -> "D" -> "E"
	 * removeFirstXElements(10) results in an empty list
	 * 
	 * If the number of elements to remove is greater than the number of
	 * elements in the list, the list should be empty when the method completes.
	 *
	 */
	public void removeFirstXElements(int numToRemove) {
		Node current = this.first;
		if (numToRemove == 0) {
			return;
		}
		if (current == null) {
			return;
		}
		for (int i = 0; i < numToRemove - 1; i++) {
			if (current.next != null) {
				current.next = current.next.next;
			} else {
				removeLast();
				return;
			}
		}
		this.first = current.next;
	}

	/**
	 * Creates a new entry for the given element after all occurrences of the
	 * given element. If the given element does not occur, the list is
	 * unchanged.
	 * 
	 * For example:
	 * 
	 * Calling duplicateGivenElements("B") on "A" -> "B" -> "C" results in "A"
	 * -> "B" -> "B" -> "C"
	 * 
	 * Calling duplicateGivenElements("A") on "A" -> "B" -> "A" results in "A"
	 * -> "A" -> "B" -> "A" -> "A"
	 * 
	 * Calling duplicateGivenElements("D") on "A" -> "B" -> "C" results in "A"
	 * -> "B" -> "C"
	 * 
	 */
	public void duplicateGivenElement(String value) {
		Node current = this.first;
		if (current == null) {
			return;
		}
		while (current.next != null) {
			if (current.data.equals(value)) {
				Node duplicateNode = new Node(value, current.next);
				current.next = duplicateNode;
				current = current.next;
			}
			current = current.next;
		}
		if (current.data.equals(value)) {
			Node duplicateNode = new Node(value, null);
			current.next = duplicateNode;
		}
	}

	/**
	 * Find and remove the largest element in the list. Strings can be compared
	 * using the compareTo method, like this:
	 * 
	 * string1.compareTo(string2)
	 * 
	 * If string1 is less than string2, compareTo will return a value less than
	 * zero.
	 * 
	 * If string1 is equal to string2, compareTo will return zero.
	 * 
	 * If string1 is greater than string2, compareTo will return a value greater
	 * than zero.
	 * 
	 * 
	 * For example: "A" -> "B" -> "C" -> "D" .findAndRemoveLargest() returns "D"
	 * and the list is updated to "A" -> "B" -> "C"
	 * 
	 * "E" -> "B" -> "C" -> "D" .findAndRemoveLargest() returns "E" and the list
	 * is updated to "B" -> "C" -> "D"
	 * 
	 * "E" .findRemoveLargest() return "E" and the list is update to an empty
	 * list
	 * 
	 * If the list is empty, return null.
	 * 
	 * You may assume that the largest value will not be duplicated.
	 */
	public String findAndRemoveLargest() {
		Node largest = this.first;
		while (largest != null) {
			Node compare = largest.next;
			while (compare != null) {
				if (compare.data.compareTo(largest.data) > 0) {
					largest = compare;
				}
				compare = compare.next;
			}
			String largestString = largest.data;
			if (largest == this.first) {
				removeFirstXElements(1);
			} else if (largest.next != null) {
				Node current = this.first;
				while (current.next != null) {
					if (current.next.equals(largest)) {
						current.next = current.next.next;
						return largestString;
					}
					current = current.next;
				}
			} else {
				removeLast();
			}
			return largestString;
		}
		return null;
	}

	/**
	 * Adds a string as the new first element of this list
	 * 
	 * Note - you should not need to modify this function!
	 * 
	 */
	public void addFirst(String newData) {
		Node newNode = new Node(newData, first);
		this.first = newNode;
	}

	/**
	 * Removes the last element of this list Returns the data of the element
	 * that is removed
	 * 
	 * If the list is empty, returns null
	 * 
	 * Note - you should not need to modify this function!
	 * 
	 */
	public String removeLast() {
		// empty list
		if (first == null)
			return null;

		// one element list
		if (first.next == null) {
			String data = first.data;
			first = null;
			return data;
		}

		// the rest
		Node current = first;
		while (current.next.next != null) {
			current = current.next;
		}
		String data = current.next.data;
		current.next = null;
		return data;
	}

}