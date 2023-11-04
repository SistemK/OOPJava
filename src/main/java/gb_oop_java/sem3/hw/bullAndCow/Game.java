package gb_oop_java.sem3.hw.bullAndCow;

public interface Game {
    void start();
    void restart();
    Answer inputValue(String value);
    GameStatus getGameStatus();
    void setSizeWord(Integer number);
    void setMaxTry(Integer number);
    void getLogs();
    void getStatistic();
}
