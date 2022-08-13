package gradleprojectenglish;


public class Score {
    
    private double theoryScore;
    private double codingScore;
    private static int doingExam=0;
    
    Score(){
    theoryScore=0;
    codingScore=0;
    }
    
    Score(double t, double c){
    theoryScore=t;
    codingScore=c;
    doingExam++;
    }
    
    public void setScore(double t, double c){
    theoryScore=t;
    codingScore=c;
    doingExam++;
    }
    
    public void printScore(){
    System.out.println("Score of theory: " + theoryScore + " " + "Score of coding: " + codingScore);
    }
    
    public double calculateFinalScore(){
        double tFinalScore=(theoryScore*0.4);
        double cFinalScore=(codingScore*0.6);
        return tFinalScore+cFinalScore;
    }
}
