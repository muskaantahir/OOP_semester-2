public class Main { 
    public static void main(String[] args) { 
          // Create Sara with 2 dice, each having 6 sides. 
             Player player = new Player("Sara", 2, 6);  
              
             player.roll();  //Die 1 = 3 Die 2 = 2 (Random values) 
              
             System.out.println("Initial total: " + player.getTotal()); 
              
             player.rollAgain(1);
              
             System.out.println("New total    : " + player.getTotal()); 
    } 
} 