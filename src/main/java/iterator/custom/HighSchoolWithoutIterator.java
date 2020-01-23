package main.java.iterator.custom;

import java.util.ArrayList;
import java.util.List;

public class HighSchoolWithoutIterator {
	
	List<HistoryBook> historyBooks;
	
	public HighSchoolWithoutIterator() {
		this.historyBooks = new ArrayList<>();
	}

	public void addNewBook(HistoryBook book) {
		this.historyBooks.add(book);
	}

	public List<HistoryBook> getHistoryBooks() {
		return this.historyBooks;
	}
	
}
