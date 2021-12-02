/*Reginah Chuhi
CIS219
Tuesday and Thursday 3:30pm*/

public class Project1 {

	public static void main(String[] args) {
		//Creates an array to store generated numbers
		 int[] randomNum= new int[20];

		for(int i=1; i<randomNum.length;++i) {
			//Generates random numbers between 1 and 30
			randomNum[i]=(int)(Math.random()*30);	
	
			for(int j=1; j<i;++j) {
				if(randomNum[i]==randomNum[j]) {
					i--;
					break;
				}
			}
            
	}for(int i=1; i<randomNum.length;++i) {
		//prints out the generated numbers
		
		System.out.println(randomNum[i]);
	}
	}}

