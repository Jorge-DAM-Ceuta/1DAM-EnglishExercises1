package gradleprojectenglish;


public class Calculator {
    
    private double operand1;
    private double operand2;
    private static double result;
    private final static double PI=3.14;
    
    public void setOperand1(double n){
    operand1=n;
    }
    public void setOperand2(double n){
    operand2=n;
    }
    public double getOperand1(){
    return operand1;
    }
    public double getOperand2(){
    return operand2;
    }
    public double getResult(){
    return result;
    }
    
    public double add(){
    return result=operand1+operand2;
    }
    
    public double substract(){
    return result=operand1-operand2;
        
    }
    public double multiply(){
    return result=operand1*operand2;
        
    }
    public double divide(){
    return result=operand1/operand2;
        
    }
    
    public double length(){
    return result= 2*PI*operand1;
        
    }
    public double area(){
    return result= PI*operand2;
        
    }
    
}
