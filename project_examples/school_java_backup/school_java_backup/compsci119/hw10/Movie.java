//alan kelsey   
//alankelsey@u.boisestate.edu
//
//program to store movie info
//

public class Movie 
{
    private String title;
    private int length;
    private String rating;


    public void setTitle(String titleString )
    {      
        title = titleString;

    }

    public void setLength (int lengthInt)
    {
        length = lengthInt;
    }

    public void setRating (String ratingString)
    {
        rating = ratingString;
    }
    
    public String getTitle()
    {
        return title;
    }

    public int getLength()
    {
        return length;
    }

    public String getRating()
    {
        return rating;
    }
}
