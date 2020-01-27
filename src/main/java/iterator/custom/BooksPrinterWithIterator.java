package main.java.iterator.custom;

public class BooksPrinterWithIterator {


	
public static void main(String[] args) {
		
		HistoryBook historyBook1 = new HistoryBook("Portugal History", "Talking about Portugal Kings", 1);
		HistoryBook historyBook2 = new HistoryBook("China History", "Talking about China History", 2);
		
		MiddleSchoolWithIterator middleSchool = new MiddleSchoolWithIterator(1);
		middleSchool.addNewBook(historyBook1, 0);
		HighSchoolWithIterator highSchool = new HighSchoolWithIterator();
		highSchool.addNewBook(historyBook1);
		highSchool.addNewBook(historyBook2);
		
		System.out.println("History books for Middle School:");
		printItems(middleSchool.getHistoryBooks());
		System.out.println("History books for High School:");
		printItems(highSchool.getHistoryBooks());
	}
	
	
	public static void printItems(Iterator booksIterator){
		while(booksIterator.hasNext()) {
			HistoryBook historyBook = (HistoryBook)booksIterator.next();
			System.out.println(historyBook.getName());
		}
		
	}

}
