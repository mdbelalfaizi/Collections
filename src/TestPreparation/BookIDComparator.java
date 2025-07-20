package TestPreparation;

import java.util.Comparator;

public class BookIDComparator implements Comparator<Book> {

	
	@Override
	public int compare(Book o1, Book o2) {
		if(o1.id>o2.id)
			return -1;
		else if(o1.id<o2.id)
			return 1;
		else
			return 0;
					 
		}
	}

