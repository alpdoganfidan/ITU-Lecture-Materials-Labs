package Lab10;

public class Lab10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookName = "Test Book";
		String author = "John Doe";
		int shelfNo = 34;
		int pageNumber = 3;
		
		int wordsPerPage = 100;
		Novel novel = new Novel(bookName,author, shelfNo, pageNumber, wordsPerPage);

		System.out.printf("Total word count of the Novel is %d\n",novel.calculateWordsNumber());
		
		int wordsPerOddPage = 50;
		int wordsPerEvenPage = 25;
		Poem poem = new Poem(bookName,author, shelfNo, pageNumber, wordsPerOddPage, wordsPerEvenPage);
		
		System.out.printf("Total word count of the Poem is %d\n",poem.calculateWordsNumber());
		
	}

}
