package main.java.iterator.custom;

public class MiddleSchoolIterator  implements Iterator{
	
	private HistoryBook[] historyBooks;
	private int position;
	
	public MiddleSchoolIterator(HistoryBook[] historyBooks) {
		this.historyBooks = historyBooks;
	}

	@Override
	public boolean hasNext() {
		if(this.position >= historyBooks.length || historyBooks[position] == null) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public Object next() {
		HistoryBook historyBook = this.historyBooks[this.position];
		position = this.position + 1;
		return historyBook;
	}

}
