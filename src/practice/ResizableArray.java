package practice;
//this is a hard coded resizable array in Java
//In java we can usually use an ArrayList if we know we need a resizable array
//basically just doubles it if it has reached capacity
public class ResizableArray {
	// initializing integer array
	private int[] items = new int[8];
	// size starts off at 0 cause we haven't added anything
	private int size = 0;

	// just returns current size
	public int size() {
		return size;
	}

	public void set(int index, int item) {
		// if index is out of bounds throw an exception

		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		items[index] = item;
	}

	public void append(int item) {
		ensureExtraCapacity();
		items[size] = item;
		size++;
	}

	private void ensureExtraCapacity() {
		if (size == items.length) {
			int[] copy = new int[size * 2];
			// handy method to copy elements over
			System.arraycopy(items, 0, copy, 0, size);
			items = copy;
		}
	}

	public int get(int index) {
		// check
		if (index < 0 || index >= size) {
			throw new ArrayIndexOutOfBoundsException(index);
		}

		return items[index];
	}

}
