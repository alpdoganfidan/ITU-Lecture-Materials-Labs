package Lab10;

public class Poem extends Book{
	private int wordsPerOddPage;
	private int wordsPerEvenPage;
	
	public Poem(String bookName, String author, int shelfNo, int pageNumber, int wordsPerOddPage, int wordsPerEvenPage) {
		super(bookName, author, shelfNo, pageNumber);
		// TODO Auto-generated constructor stub
		this.wordsPerEvenPage = wordsPerEvenPage;
		this.wordsPerOddPage = wordsPerOddPage;
	}

	@Override
	public int calculateWordsNumber() {
		// TODO Auto-generated method stub
		int evenPageCount = super.getPageNumber()/2;
		int oddPageCount = super.getPageNumber() - evenPageCount;

		return (oddPageCount)*wordsPerOddPage + (evenPageCount)*wordsPerEvenPage;
	}
	

}
