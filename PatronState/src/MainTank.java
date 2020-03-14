
public class MainTank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tank ContextTank = new Tank();
		
		for(int i=0;i<=10;i++) {
			System.out.println("Movimiento número:"+ " " + (i+1));
			ContextTank.moveTank();			
		}
	}
}