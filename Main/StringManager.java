package gradleprojectenglish;


public class StringManager {
    
    private String s1, s2;
    
    StringManager(){
        s1=""; 
        s2="";
    }
    
    public void setS1(String x){
        s1=x;
    }
    public void setS2(String x){
        s2=x;
    }
    
    public String getS1(){
    return s1;
    }
    public String getS2(){
    return s2;
    }
    
    public boolean equalStrings(){
    /*return s1.equals(s2);*/
    /*boolean comp=(s1==s2);
    return comp;*/
        return (s1==s2);
    }
    
    public int sizeforS1(){
    return s1.length();
    }
    public int sizeforS2(){
    return s2.length();
    }
    
    public int compareStrings(){
    return s1.compareTo(s2);
    }
    
    public boolean emptyS1(){
        return s1.isEmpty();
        //return s1=="";
    }
     public boolean emptyS2(){
        return s2=="";
    }
    
     public void toLowerCaseS1(){
     s1.toLowerCase();
     }
     public void toLowerCaseS2(){
     s2.toLowerCase();
     }
     
     public void toUpperCaseS1(){
     s1.toUpperCase();
     }
     public void toUpperCaseS2(){
     s2.toUpperCase();
     }
     
     public String concatenate(){
     String a=s1;
     String result =s1.concat(s2);
     return result;
     }
     
     public void concatenateS1(String x){
     s1.concat(x);
     }
     public void concatenateS2(String x){
     s1.concat(x);
     }
}
