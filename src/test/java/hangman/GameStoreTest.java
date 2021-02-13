import org.junit.Assert;
import org.junit.Test;
public class GameScoreTest{
    /* OriginalScore 
    caso 1: correctCount<0
    caso 2 : 0 < IncorrectCount < 10
    caso 3: IncorrectCount>11 
    caso 4 : IncorrectCount y correctCount deben ser numeros
    Frontera :  IncorrectCount=-1
                IncorrectCount=0
                IncorrectCount=1
                IncorrectCount=9
                IncorrectCount=10
                IncorrectCount=11

    */

     /* BonusScore 
    caso 1: correctCount<0
    caso 2: 2*IncorrectCount <= correctCount
    caso 3: IncorrectCount y correctCount deben ser numeros
    Frontera :  IncorrectCount=-1
                IncorrectCount=0
                IncorrectCount=1
                2*IncorrectCount=correctCount
                2*IncorrectCount=correctCount-1
                2*IncorrectCount=correctCount+1

    */

     /* PowerScore 
    caso 1: correctCount<0
    caso 2: 2*IncorrectCount <= correctCount
    caso 3: IncorrectCount y correctCount  deben ser numeros
    Frontera :  IncorrectCount=-1
                IncorrectCount=0
                IncorrectCount=1
                2*IncorrectCount=correctCount
                2*IncorrectCount=correctCount-1
                2*IncorrectCount=correctCount+1

    */



    @Test 
    public void prueba (){

    }
    
}
