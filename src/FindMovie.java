/**
 * Created by Travis Brindley on 7/7/2017.
 * Description:  A list of methods used to find movies from the arraylist.
 *     User can get a list of all movies, browse by genre, search title, or search both title and genre.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class FindMovie{
    public static void FullMovieList(){
        ArrayList<Movie> movieList = PopulateList.GetMovies();
        System.out.println(movieList.toString());
    }
    public static void FindbyGenre(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What Genre would you like to search?");
        System.out.println("1 for Animated \n" +
                "2 for Comedy \n" +
                "3 for Drama \n" +
                "4 for Horror \n" +
                "5 for Musical \n" +
                "6 for Sci-Fi");

        //add validation
        int selection = Validation.InsideRange(1,6);
        scan.nextLine();
        String searchValue = null;
        if(selection == 1){
            searchValue = "animated";
        } else if (selection == 2) {
            searchValue = "comedy";
        }
        else if(selection == 3){
            searchValue = "drama";
        }
        else if(selection == 4){
            searchValue = "horror";
        }
        else if(selection == 5){
            searchValue = "musical";
        }
        else {
            searchValue = "scifi";
        }

        int movieOrGenre = 2; //2 means genre
        SearchList(searchValue, movieOrGenre);
    }
    public static void SearchByName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What movie would you like to find?");
        String searchValue = Validation.NullChecker();
        int movieorGenre = 1; // searches movie title

        SearchList(searchValue, movieorGenre);
    }
    public static void GeneralSearch(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What movie would you like to find?");
        String searchValue = Validation.NullChecker();
        int movieorGenre = 3; // searches both genre or movie title

        SearchList(searchValue, movieorGenre);
    }
    public static void SearchList(String searchValue, int movieOrGenre){
        ArrayList<Movie> movieList = PopulateList.GetMovies();
        int counter = 0;
        for(int i = 0; i < movieList.size(); i++){

            Object movie = MovieIO.getMovie(i); //Sets entire movie object to string
            String movieValue = movie.toString();

            Object movieGenre = MovieIO.getMovie(i).getGenre(); // sets movie genre to string
            String genreValue = movieGenre.toString();

            Object movieTitle = MovieIO.getMovie(i).getTitle(); //sets movie title to string
           String titleValue = movieTitle.toString();
            if(movieOrGenre == 1){
                if(titleValue.toLowerCase().contains(searchValue.toLowerCase())){
                    System.out.println(movieValue);
                    counter +=1;
                }
            }
            else if(movieOrGenre == 2){
                if(genreValue.toLowerCase().contains(searchValue.toLowerCase())){
                    System.out.println(movieValue);
                    counter +=1;
                }
            }
            else{
                if(movieValue.toLowerCase().contains(searchValue.toLowerCase())){
                    System.out.println(movieValue);
                    counter += 1;
                }
            }
        }
        if(counter == 0){
            System.out.println("I'm sorry, there are no results for your search");
        }
    }
}