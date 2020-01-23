package main.java.iterator.custom;

import java.util.List;

public class BooksPrinterWithIterator {

	public static void main(String[] args) {
		
		HistoryBook historyBook1 = new HistoryBook("Portugal History", "Talking about Portugal Kings", 1);
		HistoryBook historyBook2 = new HistoryBook("China History", "Talking about China History", 2);
		
		MiddleSchoolWithoutIterator middleSchool = new MiddleSchoolWithoutIterator(1);
		middleSchool.addNewBook(historyBook1, 0);
		HighSchoolWithoutIterator highSchool = new HighSchoolWithoutIterator();
		highSchool.addNewBook(historyBook1);
		highSchool.addNewBook(historyBook2);
		
		System.out.println("History books for Middle School:");
		printBooksMiddleSchoolWithoutIterator(middleSchool);
		System.out.println("History books for High School:");
		printBooksHighSchoolWithoutIterator( highSchool);
		

	}
	
	
	public static void printBooksHighSchoolWithoutIterator(HighSchoolWithoutIterator highSchool){
		List<HistoryBook> booksList = highSchool.getHistoryBooks();
		for(int i = 0; i < booksList.size(); i++) {
			System.out.println(booksList.get(i).getName());
		}
		
	}
	
	public static  void printBooksMiddleSchoolWithoutIterator(MiddleSchoolWithoutIterator middleSchool){
		HistoryBook[] booksArray = middleSchool.getHistoryBooks();
		for(int i = 0; i < booksArray.length; i++) {
			System.out.println(booksArray[i].getName());
		}
	}

}
