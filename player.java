
////1. Write a simple java application that creates a Player class. 
////Inherit CricketPlayer class from Player class. 
////Inherit Batsman & Bowler from CricketPlayer class. Assume suitable data and member methods.

public class player {

    String name1="virat kohali";
    String name2="dinesh kartik";
    String name3="ravindra jadeja";
    public static void main(String[] args) {
        CricketPlayer c = new CricketPlayer();
        c.Batsman();
        c.Bowler();
    }
    
}
class CricketPlayer extends player{

String name4="bhuvneshvar kumar";
String name5="shami";
String name6="dipak huda";

void Batsman(){
    System.out.println("the batsman is = "+name1);
    
    System.out.println("the batsman is = "+name2);
    
    System.out.println("the batsman is = "+name3);

    System.out.println("\nthe bowler is next line \n");
}

void Bowler(){
    System.out.println("the bowler is = "+name4);
    
    System.out.println("the bowler is  = "+name5);
    System.out.println("the bowler is = "+name6);
}
}


