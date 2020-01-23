package main.java.iterator.custom;

public class MiddleSchoolWithIterator{
	
	HistoryBook[] historyBooks;
	
	public MiddleSchoolWithIterator(int numberBooks) {
		this.historyBooks = new HistoryBook[numberBooks];
	}
	

	public void addNewBook(HistoryBook book, int position) {
		this.historyBooks[position] = book;
	}

	public Iterator getHistoryBooks() {
		return new MiddleSchoolIterator(this.historyBooks);
	}
	

}
