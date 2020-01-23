package main.java.iterator.custom;

import java.util.ArrayList;
import java.util.List;

public class HighSchoolWithIterator {
	
	List<HistoryBook> historyBooks;
	
	public HighSchoolWithIterator() {
		this.historyBooks = new ArrayList<>();
	}

	public void addNewBook(HistoryBook book) {
		this.historyBooks.add(book);
	}

	public Iterator getHistoryBooks() {
		return new HighSchoolIterator(this.historyBooks);
	}
	
}
