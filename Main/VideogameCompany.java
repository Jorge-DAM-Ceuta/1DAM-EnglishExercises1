package gradleprojectenglish;

import java.util.Scanner;

public class VideogameCompany {
    
    private Scanner scan=new Scanner(System.in);
    private String nameoftheGame;
    private String genre;
    private int recommendAge;
    private String synopsis;
    
    public void readGameDetails(){
    
    System.out.println("Insert the name of the game: ");
        nameoftheGame=scan.nextLine();
        
    System.out.println("Insert a genre: ");    
        genre=scan.nextLine();
        
    System.out.println("Inset the recommend age: ");    
        recommendAge=scan.nextInt();
        
    System.out.println("Insert the synopsis: ");    
        synopsis=scan.nextLine();
    }
    
    public void summary(){
    
    System.out.println("Name of the game: " + nameoftheGame);
    System.out.println("Genre: " + genre);
    System.out.println("Recommend age: " + recommendAge);
    System.out.println("Synopsis: " + synopsis);
    }
    
    //Getters
    
    public String getNameoftheGame(){
    return nameoftheGame;
    }
    public String getGenre(){
    return genre;
    }
    public int getRecommendAge(){
    return recommendAge;
    }
    public String getSynopsis(){
    return synopsis;
    }
    
    //Setters
    
    public void setNameoftheGame(String n){
    nameoftheGame=n;
    }
    public void setGenre(String g){
    genre=g;
    }
    public void setRecommendAge(int r){
    recommendAge=r;
    }
    public void setSynopsis(String s){
    synopsis=s;
    }
}
