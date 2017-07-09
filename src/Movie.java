/**
 * Created by Travis Brindley on 7/7/2017.
 * Creates the Movie objects
 */
public class Movie {
    private String title;
    private String genre;

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    @Override
    public String toString(){
        return "Movie: " + this.getTitle() + ",      Genre: " + this.getGenre() + "\n " + "--------------------------\n";
    }

}
