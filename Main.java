
/*
tvShow class to give some properties to a T.V Shows
*/

import java.util.ArrayList;

public class tvShow extends showSeason{
  
  String showGenre;
  String showName;
  Integer numSeasons;  
  
  //A tvShow has a name, number of seasons and a genre
  public tvShow(String name ,Integer numOfSeasons, String genre){
    
    numOfSeasons = numSeasons;
    name = showName;
    genre = showGenre;
      
    ArrayList<showSeason> seasons = new ArrayList<showSeason>
    for(Integer first = 1; first<numOfSeasons ;first ++){
      
      Scanner reader = new Scanner(System.in);  // Reading from System.in
      System.out.println("Enter number of Episodes in season " + first + ": ");
      Integer n = reader.nextInt()
        
      showSeason episodeList = new showSeason(n,first);
        
    }//end for loop
      
  }//end tvShow Constructor
  
  public void displaySeasons(){
    System.out.println(name + "has " + seasons + " seasons");
  }//end displaySeasons
  
  public static void main(String[] args){
    
    ArrayList<tvShow> collection = new ArrayList<tvShow>();
    
    tvShow BobsBurgers = new tvShow("Bob's Burgers" , 7 , "Comedy");
    collection.add(BobsBurgers);
    
    tvShow Chopped = new tvShow("Chopped", 35 , "Culinary");
    collection.add(Chopped);
    
    tvShow Futurama = new tvShow("Futurama", 7 , "Comedy");
    collection.add(Futurama);
    
    tvShow Sunny = new tvShow("It's Always Sunny in Philidelphia", 12 , "Comedy");
    collection.add(Sunny);
    
    tvShow Parks = new tvShow("Parks and Recreation", 7 , "Comedy");
    collection.add(Parks);
    
    for(item:collection){
      item.displaySeasons();
    }
    
  }//end main
}//end class tvshow
