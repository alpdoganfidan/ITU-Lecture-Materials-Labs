package Lab10;

public class Novel extends Book{
	private int wordsPerPage;
	
	public Novel(String bookName, String author, int shelfNo, int pageNumber, int wordsPerPage) {
		super(bookName, author, shelfNo, pageNumber);
		// TODO Auto-generated constructor stub
		this.wordsPerPage = wordsPerPage;
	}

	@Override
	public int calculateWordsNumber() {
		// TODO Auto-generated method stub
		
		return wordsPerPage*super.getPageNumber();
	}
}
