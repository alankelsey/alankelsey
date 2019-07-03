// An application class to test the "Movie" class
// // By Michael Stuart <michaelstuart@boisestate.edu>
//
public class MovieTester
{
    public static void main(String[] args)
    {
        final String TITLE_1 = "Pirates of the Caribbean";
        final int LENGTH_1 = 143;
        final String RATING_1 = "PG-13";
                
        Movie pirates = new Movie();
        pirates.setTitle(TITLE_1);
        pirates.setLength(LENGTH_1);
        pirates.setRating(RATING_1);
                                          
        final String TITLE_2 = "Harry Potter and the Deathly Hallows: Part 2";
        final int LENGTH_2 = 130;
        final String RATING_2 = "PG-13";
        Movie potter = new Movie();
        potter.setTitle(TITLE_2);
        potter.setLength(LENGTH_2);
        potter.setRating(RATING_2);
        
        System.out.println("If the Movie class is working correctly, the data");
        System.out.println("on both sides of the '<=>' should be identical");
        System.out.println();
        
        System.out.println(TITLE_1 + " <=> " + pirates.getTitle());
        System.out.println(LENGTH_1 + " <=> " + pirates.getLength());
        System.out.println(RATING_1 + " <=> " + pirates.getRating());
        System.out.println();
        System.out.println(TITLE_2 + " <=> " + potter.getTitle());
        System.out.println(LENGTH_2 + " <=> " + potter.getLength());
        System.out.println(RATING_2 + " <=> " + potter.getRating());
    }
}
