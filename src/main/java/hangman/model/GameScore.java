package hangman.model;
public interface GameScore{
	public final int INITIAL_SCORE =0;
    public int calculateScore(int correctCount , int incorrectCount)throws Exception;
    public int getInitialScore();
}

