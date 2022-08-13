package gradleprojectenglish;

import java.util.Scanner;

public class FoodCompany {
    
    private Scanner scan=new Scanner(System.in);
    private int hamburgers;
    private int frenchFries;
    private int friedChicken;
    private int cola;
    private static int clients;
    
        FoodCompany(){
        hamburgers=0;
        frenchFries=0;
        friedChicken=0;
        cola=0;
        }

        FoodCompany(int h, int ff, int fc, int c){
        hamburgers=h;
        frenchFries=ff;
        friedChicken=fc;
        cola=c;
        }
    
    
    public void printStock(){
    System.out.println("Hamburgers: " + hamburgers);
    System.out.println("Kg of french fries: " + frenchFries);
    System.out.println("Pieces of fried chicken: " + friedChicken);
    System.out.println("Liters of cola: " + cola);
    }
    
    public void addStock(String food, int quantity){
        
        switch(food){
        
            case "Hamburger":
                hamburgers=(hamburgers+quantity);
                break;
                
            case "French fries":
                frenchFries=(frenchFries+quantity);
                break;
                
            case "Fried chicken":
                friedChicken=(friedChicken+quantity);
                break;
                
            case "Cola":
                cola=(cola+quantity);
                break;
        }
    clients++;
    }
    
    public void order(String food, int quantity){
        
        System.out.println("Select a type of food: Hamburger, French fries, Fried chicken or Cola");
        food=scan.nextLine();
        
        System.out.println("Select the quantity");
        quantity=scan.nextInt();
        
        switch(food){
        
            case "Hamburger":
                hamburgers=(hamburgers-quantity);
                break;
                
            case "French fries":
                frenchFries=(frenchFries-quantity);
                break;
                
            case "Fried chicken":
                friedChicken=(friedChicken-quantity);
                break;
                
            case "Cola":
                cola=(cola-quantity);
                break;
        }
        clients++;
    }   
    
    public void daysFor(int count){
    
        
        
    }
    
}
