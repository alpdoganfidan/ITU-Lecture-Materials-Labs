package Lab7;

import java.time.LocalDate;

public class Rental {
	private Movie movie;
	private LocalDate rentalDate, dueDate;

	
	public Rental(Movie movie, LocalDate rentalDate, LocalDate dueDate) {
		
		if (dueDate.isBefore(rentalDate))
			throw new IllegalArgumentException("RentalDate must be before DueDate.");

		this.setMovie(movie);
		this.setRentalDate(rentalDate);
		this.setDueDate(dueDate);
	}


	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public LocalDate getRentalDate() {
		return rentalDate;
	}

	public void setRentalDate(LocalDate rentalDate) {
		this.rentalDate = rentalDate;
	}
	
}
