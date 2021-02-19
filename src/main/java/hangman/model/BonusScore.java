package hangman.model;
import hangman.model.*;
public class BonusScore implements GameScore{
	public final int INITIAL_SCORE =0;
	
    /* 
    *@pre Se inicia con 0 puntos  
    *@pos El puntaje minimo es 0 
    *@param correctCount cuenta las letras correctas 
    *@param incorrectCount cuenta las letras incorrectas 
    *@throws ExeptionParametrosInvalidos deberia salir cuando se ingresan numeros o caracteres no permitidos 
    */
    @Override
    public int calculateScore(int correctCount , int incorrectCount)throws Exception{
        int score = 0;
        if(correctCount<0 || incorrectCount<0) throw new Exception(); 
        score = score-(incorrectCount*5)+(correctCount*10);
        if(score<0){
            score = 0;
        }
        return score;
    }
    public int calculateScore(char correctCount , char incorrectCount)throws Exception{
        if (true )throw new Exception();
        return 0;
    }
    public int calculateScore(char correctCount , int incorrectCount)throws Exception{
        if (true )throw new Exception();
        return 0;
    }
    public int calculateScore(int correctCount , char incorrectCount)throws Exception{
        if (true )throw new Exception();
        return 0;
    }
    @Override
    public int getInitialScore() {
    	return INITIAL_SCORE;
    }
}