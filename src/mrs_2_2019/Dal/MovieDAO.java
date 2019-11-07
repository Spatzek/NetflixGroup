package MRS_2_2019.Dal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import mrs_2_2019.be.Movie;
import java.util.List;

/**
 *
 * @author chri9
 */
public class MovieDAO {
    private static final String MOVIE_SOURCE = "data/movie_titles.txt";
    public List<Movie> getAllMovies() throws FileNotFoundException, IOException
    {
        File file = new File(MOVIE_SOURCE);
        System.out.println("is it there:" + file.canRead());
        BufferedReader br = new BufferedReader(new FileReader(file));

        while(true)
        {
        String aLineOfText = br.readLine();
        if(aLineOfText == null)
        {
            break;
        } else
        {
        System.out.println(aLineOfText);
        }
        }
        return null;

    }
    public static void main(String[] args) throws IOException
    {
        MovieDAO movieDao = new MovieDAO();
        movieDao.getAllMovies();
    }
}