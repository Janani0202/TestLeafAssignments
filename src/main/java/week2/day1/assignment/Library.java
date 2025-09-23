package week2.day1.assignment;

public class Library {
	
	//addbook method
	public String addBook(String booktitle) {
		System.out.println("Book added successfully");
		System.out.println(booktitle);
		return booktitle;
	}
	//issue book method
	public void issuebook() {
		System.out.println("Book issued successfully");
		
	}
	public static void main(String[] args) {
		Library l1 = new Library();
		l1.addBook("Wings of fire");
		l1.issuebook();
	}

}
