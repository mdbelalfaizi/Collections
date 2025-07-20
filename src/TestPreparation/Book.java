package TestPreparation;

import java.util.Comparator;

class Book implements Comparator<Book> {  
    int id;  
    String name, author, publisher;  
    int quantity;  
    // Constructor to initialize Book object  
    public Book(int id, String name, String author, String publisher, int quantity) {  
        this.id = id;  
        this.name = name;  
        this.author = author;  
        this.publisher = publisher;  
        this.quantity = quantity;  
    }  
    
    
    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	// compareTo method to compare Books based on 'id'  
    public int compareTo(Book b) {  
        if(b.quantity>this.quantity)
        	return 1;
        else if(b.quantity<this.quantity)
        	return -1;
        else
        	return 0;
    }
	@Override
	public int compare(Book o1, Book o2) {
		
	if(o1.id>o2.id)
		return 1;
	else if(o1.id<o2.id)
		return -1;
	else
		return 0;
				 
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", quantity="
				+ quantity + "]";
	}
    
	
   
}  
