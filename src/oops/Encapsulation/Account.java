package Encapsulation;

//public class Account {
//
//		// TODO Auto-generated method stub
//		       private int min_Bal=500;
//		                // +
//		       //using setters and getters
//
//			public int get_Min_Bal() {
//				return min_Bal;
//			}
//
//			public void set_Min_Bal(int min_Bal) {
//				this.min_Bal = min_Bal;
//			}
//		       
//		       }
public class Account{
    private int min_Bal=500;
             // +
    //using setters and getters
    public void set_Min_Bal(int bal){
     this.min_Bal = bal;
    }
    public int get_Min_Bal(){
     return this.min_Bal;
    }
}
	


