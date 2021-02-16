package hangman.model;
import hangman.model.*;
import java.lang.Math;
public class PowerScore implements GameScore{
    /* 
    *@pre Se inicia con 0 puntos  
    *@pos El puntaje minimo es 0  y el maximo 500
    *@param correctCount cuenta las letras correctas 
    *@param incorrectCount cuenta las letras incorrectas 
    *@throws ExeptionParametrosInvalidos deberia salir cuando se ingresan numeros o caracteres no permitidos 
    */
    @Override
    public int calculateScore(int correctCount , int incorrectCount)throws Exception{
        int score = 0;
        if(correctCount<0 || incorrectCount<0) throw new Exception(); 
        score = score-(incorrectCount*8)+((int)Math.pow(5,correctCount));
        if(score<0 || correctCount ==0){
            score = 0;
        }
        else if(score>500){
            score = 500;
        }
        return score;
    }
}