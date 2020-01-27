package main.java.iterator.custom;

public class MiddleSchoolWithoutIterator{
	
	HistoryBook[] historyBooks;
	
	public MiddleSchoolWithoutIterator(int numberBooks) {
		this.historyBooks = new HistoryBook[numberBooks];
	}
	

	public void addNewBook(HistoryBook book, int position) {
		this.historyBooks[position] = book;
	}

	public HistoryBook[] getHistoryBooks() {
		return this.historyBooks;
	}
	
}
