package main.java.iterator.custom;

import java.util.List;

public class HighSchoolIterator implements Iterator{
	
	private List<HistoryBook> historyBooks;
	private int position;
	
	public HighSchoolIterator(List<HistoryBook> historyBooks) {
		this.historyBooks = historyBooks;
	}
	

	@Override
	public boolean hasNext() {
		if(this.position >= historyBooks.size()) {
			return false;
		}else {
			return true;
		}
			
	}

	@Override
	public Object next() {
		HistoryBook historyBook = this.historyBooks.get(position);
		this.position = this.position + 1;
		return historyBook;
	}

}
