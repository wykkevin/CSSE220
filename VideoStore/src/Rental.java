/**
 * This class represents a customer renting a movie.
 * 
 * @author wilkin
 *
 */
public class Rental {
	
	private Movie movie;
	private int daysRented;
	
	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}
	
	public int getDaysRented() {
		return this.daysRented;
	}
	
	public Movie getMovie() {
		return this.movie;
	}

	double computeMovieAmount() {
		double MovieAmount = 0.0;
		
		//Determine amounts for each line
		switch(getMovie().getPriceCode()) {
			case Movie.REGULAR: 	//$2.00 for 2 day rental, and $1.50 for each additional day
				MovieAmount += 2.0;
				if(getDaysRented() > 2)
					MovieAmount += (getDaysRented() - 2) * 1.5;
				break;
			case Movie.NEW_RELEASE: //$3.00 per day
				MovieAmount += getDaysRented() * 3;
				break;
			case Movie.CHILDRENS:   //$1.50 for 3 day rental, and $1.50 for each additional day
				MovieAmount += 1.5;
				if(getDaysRented() > 3)
					MovieAmount += (getDaysRented() - 3) * 1.5;
				break;
		}//end switch
		return MovieAmount;
	}

}
