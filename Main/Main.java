package gradleprojectenglish;

import java.util.Scanner;

public class Main {

    public static int six(){
    
    Scanner scan=new Scanner(System.in);
    int number, previous, result;    
    
    System.out.println("Write a number: ");     
    number=scan.nextInt();
    previous=number;
    result=number;
            
        do{
            System.out.println("Write a number: ");     
            number=scan.nextInt();
                
            if(number>previous){
                System.err.println("Error");
            }else{
                previous=number;
                result+=number;
            }
        }while(number>0);
            return result;
    }
    
    
    public static void multiplicationTables(){
    
    int i, j, tables=1;    
        
        for(i=1; i<=10; i++){
        
            for(j=1; j<=10; j++){
            
                tables=i*j;
                System.out.println(tables);
            }
            System.out.println("");
        }
    }
    
    public static void fibonacciSequence(){
    
    int n1=0,n2=1,n3=0;
        
        for(int i=2; n3<1000; i++){
            n3=n1+n2;
            
            if(n3<1000){
                System.out.println(n3);
                n1=n2;
                n2=n3;
            }
        }
    }
    
    public static void main(String[] args) {
    
    //System.out.println(six());    
     
    //multiplicationTables();
    
    //fibonacciSequence();
    
    /*Calculator cal=new Calculator();
    
    cal.setOperand1(30);
    cal.setOperand2(15);
   
    cal.getOperand1();
    cal.getOperand2();
    cal.getResult();
    
    cal.add();
    cal.substract();
    cal.multiply();
    cal.divide();
    cal.length();
    cal.area();
    
    System.out.println(cal.add());*/
    
    
    /*StringManager st=new StringManager();
    
    st.setS1("Two");
    st.setS2("Three");
    
    System.out.println(st.getS1());
    System.out.println(st.getS2());
    
    System.out.println(st.equalStrings());
    
    System.out.println(st.sizeforS1());
    System.out.println(st.sizeforS2());
    
    System.out.println(st.compareStrings());
    System.out.println(st.emptyS1());
    System.out.println(st.concatenate());*/
    
    
    /*Score one=new Score(7, 9);
    one.printScore();
    System.out.println(one.calculateFinalScore());*/
    
    VideogameCompany v=new VideogameCompany();
    
    
    
    }
}