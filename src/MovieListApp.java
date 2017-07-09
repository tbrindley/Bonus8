/**
 * Created by Travis Brindley on 7/7/2017.
 * Description:  Using Objects and array lists, this program takes 100 movies and allows the user to search / display them.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class MovieListApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Movie> movieList = PopulateList.GetMovies(); //Populates movies into arraylist
        int listSize = movieList.size();

        System.out.println("Welcome to the Grand Circus Movie Application.");
        System.out.printf("We currently have %d movies in our library \n",listSize);

        do{
            System.out.println("\nWhat would you like to do?");
            System.out.println("1 for complete movie list \n"+
                    "2 to browse by genre \n" +
                    "3 to search by title \n" +
                    "4 for a general search  ");
            //validate input
            int selection = Validation.InsideRange(1,4);

            switch(selection){
                case 1: {
                    FindMovie.FullMovieList();
                    break;
                }
                case 2: {
                    FindMovie.FindbyGenre();
                    break;
                }
                case 3: {
                    FindMovie.SearchByName();
                    break;
                }
                case 4: {
                    FindMovie.GeneralSearch();
                    break;
                }
            }
            String keepLooping = Validation.YesOrNo();
            if(keepLooping.equalsIgnoreCase("n")){
                break;
            }
        }while(true);
        System.out.println("\nThanks for using the Grand Circus Movie Library");
    }
}
