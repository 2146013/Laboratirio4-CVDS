package hangman.model;
import hangman.model.*;
public class OriginalScore implements GameScore{
	public final int INITIAL_SCORE =100;
    /* 
    *@pre Se inicia con 100 puntos  
    *@pos El puntaje minimo es 0 ,100 menos conteo incorrecto por 10
    *@param correctCount cuenta las letras correctas 
    *@param incorrectCount cuenta las letras incorrectas 
    *@throws ExeptionParametrosInvalidos deberia salir cuando se ingresan numeros o caracteres no permitidos 
    */
    @Override
    public int calculateScore(int correctCount , int incorrectCount)throws Exception{
        int score = 100;
        if(correctCount<0 || incorrectCount<0) throw new Exception(); 
        score = score-(incorrectCount*10);
        if(score<0){
            score = 0;
        }
        return score;
    }
    @Override
    public int getInitialScore() {
    	return INITIAL_SCORE;
    }
}