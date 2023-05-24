package Game;
import java.io.File;


public interface Gamo {

    String Numero = "NumberGuessGame";
    String Super = "SuperStore";
    
    String getGameName();

    void play(); // must be able to play a game

    String getScore(int x); // get a score - if there is no "score" then we

    void writeHighScore(File f);

}