import org.junit.Assert;
import org.junit.Test;
public class GameScoreTest{
    /* OriginalScore 
    caso 1: correctCount<0 and IncorrectCount<0
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
    caso 1: correctCount<0 and IncorrectCount<0
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
    caso 1: correctCount<0 and IncorrectCount<0 
    caso 2 : IncorrectCount y correctCount deben ser numeros
    Frontera :  IncorrectCount=-1
                IncorrectCount=0
                IncorrectCount=1
                correctCount > 3
                correctCount= 3
                correctCount < 3
            

    */



    @Test 
    public void OriginalScoreTest1(){
        try {
            OriginalScore score = new OriginalScore().calculateScore(-6,0);
        }
        catch(Exeption e){
            Assert.assertTrue(true);
        }

    }

    @Test 
    public void OriginalScoreTest2(){
        OriginalScore score = new OriginalScore().calculateScore(0,8);
        Assert.assertEquals(20,score,0);
    }

    @Test 
    public void OriginalScoreTest3(){
        OriginalScore score = new OriginalScore().calculateScore(0,11);
        Assert.assertEquals(0,score,0);
    }

    @Test 
    public void OriginalScoreTest4(){
        try {
            OriginalScore score = new OriginalScore().calculateScore(k,0);
        }
        catch(Exeption e){
            Assert.assertTrue(true);
        }

    }

    @Test 
    public void OriginalScoreFrontera1(){
        try {
            OriginalScore score = new OriginalScore().calculateScore(0,-1);
        }
        catch(Exeption e){
            Assert.assertTrue(true);
        }

    }

    @Test 
    public void OriginalScoreFrontera2(){
        OriginalScore score = new OriginalScore().calculateScore(0,0);
        Assert.assertEquals(100,score,0);
    }

    @Test 
    public void OriginalScoreFrontera3(){
        OriginalScore score = new OriginalScore().calculateScore(0,1);
        Assert.assertEquals(90,score,0);
    }

    @Test 
    public void OriginalScoreFrontera4(){
        OriginalScore score = new OriginalScore().calculateScore(0,9);
        Assert.assertEquals(10,score,0);
    }

    @Test 
    public void OriginalScoreFrontera5(){
        OriginalScore score = new OriginalScore().calculateScore(0,10);
        Assert.assertEquals(0,score,0);
    }

    @Test 
    public void OriginalScoreFrontera6(){
        OriginalScore score = new OriginalScore().calculateScore(0,11);
        Assert.assertEquals(0,score,0);
    }

    @Test 
    public void BonusScoreTest1(){
        try {
            BonusScore score = new BonusScore().calculateScore(-3,0);
        }
        catch(Exeption e){
            Assert.assertTrue(true);
        }

    }

    @Test 
    public void BonusScoreTest2(){
        BonusScore score = new BonusScore().calculateScore(3,6);
        Assert.assertEquals(0,score,0);
    }

    @Test 
    public void BonusScoreTest3(){
        try {
            BonusScore score = new BonusScore().calculateScore(l,m);
        }
        catch(Exeption e){
            Assert.assertTrue(true);
        }

    }

    @Test 
    public void BonusScoreFrontera1(){
        try {
            BonusScore score = new BonusScore().calculateScore(0,-1);
        }
        catch(Exeption e){
            Assert.assertTrue(true);
        }
    }

    @Test 
    public void BonusScoreFrontera2(){
        BonusScore score = new BonusScore().calculateScore(0,0);
        Assert.assertEquals(0,score,0);
    }

    @Test 
    public void BonusScoreFrontera3(){
        BonusScore score = new BonusScore().calculateScore(0,1);
        Assert.assertEquals(0,score,0);
    }

    @Test 
    public void BonusScoreFrontera4(){
        BonusScore score = new BonusScore().calculateScore(5,10);
        Assert.assertEquals(0,score,0);
    }

    @Test 
    public void BonusScoreFrontera5(){
        BonusScore score = new BonusScore().calculateScore(2,6);
        Assert.assertEquals(0,score,0);
    }

    @Test 
    public void BonusScoreFrontera6(){
        BonusScore score = new BonusScore().calculateScore(8,14);
        Assert.assertEquals(10,score,0);
    }


    @Test 
    public void PowerScoreTest1(){
        try {
            PowerScore score = new PowerScore().calculateScore(0,-7);
        }
        catch(Exeption e){
            Assert.assertTrue(true);
        }
    }

    @Test 
    public void PowerScoreTest2(){
        try {
            PowerScore score = new PowerScore().calculateScore(0,a);
        }
        catch(Exeption e){
            Assert.assertTrue(true);
        }
    }

    @Test 
    public void PowerScoreFrontera1(){
        try {
            PowerScore score = new PowerScore().calculateScore(0,-1);
        }
        catch(Exeption e){
            Assert.assertTrue(true);
        }
    }

    @Test 
    public void PowerScoreFrontera2(){
        PowerScore score = new PowerScore().calculateScore(0,0);
        Assert.assertEquals(0,score,0);
    } 

    @Test 
    public void PowerScoreFrontera3(){
        PowerScore score = new PowerScore().calculateScore(0,1);
        Assert.assertEquals(0,score,0);
    }  

    @Test 
    public void PowerScoreFrontera4(){
        PowerScore score = new PowerScore().calculateScore(4,0);
        Assert.assertEquals(500,score,0);
    } 

    @Test 
    public void PowerScoreFrontera5(){
        PowerScore score = new PowerScore().calculateScore(3,0);
        Assert.assertEquals(125,score,0);
    } 

    @Test 
    public void PowerScoreFrontera6(){
        PowerScore score = new PowerScore().calculateScore(2,0);
        Assert.assertEquals(25,score,0);
    } 

}
