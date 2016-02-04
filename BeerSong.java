public class BeerSong{

	public static void Ninety_Nine_Bottles_of_Beer(){
            
            for(int i = 99; i != -1; i--){
	    	if( i != 1 ){
		System.out.println(i + " bottles of beer on the wall, " + i +" bottles of beer"); 
                    }
                     if( i == 1){
                       System.out.println("1 bottle of beer on the wall, 1 bottle of beer");     
                        }if(i == 0) {
                        	System.out.println( "take one down, pass it around, no more bottles of beer on the wall.");     
                                
              }
           }
	}

	
	public static void main(String[] args){
	Ninety_Nine_Bottles_of_Beer();
	}
        
}

}
