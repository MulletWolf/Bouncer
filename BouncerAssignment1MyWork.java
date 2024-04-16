import javax.swing.JOptionPane;
public class BouncerAssignment1MyWork {

	public static void main(String[] args) {
		int queueanswer=JOptionPane.showConfirmDialog(null, "Are there customers in the queue");
		int over18answer =0;
		int drunkAnswer=0;
		int currentCapacity =0;
		int maxCapacity=4;
		int leaveanswer=0;
	

		while(queueanswer==0 ) {
		
			over18answer = JOptionPane.showConfirmDialog(null, " Are you over 18");
		
			if(over18answer == 0 ) {
				drunkAnswer =JOptionPane.showConfirmDialog(null, "Are you drunk");
				
				
					if(drunkAnswer ==1){
					JOptionPane.showMessageDialog(null, "You can enter the nightclub");
					currentCapacity++;	
					}
					else{
					JOptionPane.showMessageDialog(null, "Please leave the nightclub");
					}
							
			}else{
				JOptionPane.showMessageDialog(null,"Go home, you are too young!" );
				
			}		
		
			//write a message to user stating how many people in club
			
			
			leaveanswer =JOptionPane.showConfirmDialog(null, "Is anyone ready to leave the club?");
			
			if(leaveanswer==0) {
				
				currentCapacity--;
				
				JOptionPane.showMessageDialog(null, "There are customers: "+currentCapacity );
			
			}
				
			}//end while
		
			while(queueanswer==0 && currentCapacity<maxCapacity);
				
				JOptionPane.showMessageDialog(null, "Club is full");
				JOptionPane.showMessageDialog(null, "There are customers:"+currentCapacity);
			
			
	}//end main

}//end class
