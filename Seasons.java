
/*
tvShow class to give some properties to a T.V Shows
*/

public class showSeason extends tvShow{
  
  Integer numEpisodes;  
  
  //tv show seasons have episodes
  public showSeason(Integer episodes){
    episodes = numEpisodes;
  }//end 
  
  public void displayEpisodes(){
    System.out.println(name + "has " + seasons + " seasons");
  }//end displaySeasons
  
  public static void main(String[] args){
    
  }//end main
}//end class tvshow
