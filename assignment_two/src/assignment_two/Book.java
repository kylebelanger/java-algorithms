package assignment_two;

public class Book {
    private String author;
    private int ID;

    public Book() {
      this.ID = 0;
    }
    public Book(int ID) {
      this.ID = ID;
      this.author = "George Orwell";
    }
    public Book(int ID, String author) {
      this.ID = ID;
      this.author = author;
    }
    
    public int getID() {
    	return ID;
    }

    public void print() {
      System.out.println("ID: " + ID + " - Author: " + author);
    }
}
