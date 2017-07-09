/**
 * Created by Travis Brindley on 7/9/2017.
 * Description:  Populates the arraylist from the switch of movie titles in MovieIO.java
 */
import java.util.ArrayList;

public class PopulateList {
    public static ArrayList<Movie> GetMovies(){
        //populate movie list
        ArrayList<Movie> movieList = new ArrayList();

        for(int i = 1; i <= 100; i++){
            movieList.add(MovieIO.getMovie(i));
        }
        return movieList;
    }
}
