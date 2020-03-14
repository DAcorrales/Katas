
import java.util.Scanner;

public class MainTank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Cada movimiento aumenta en 5 el daño, al momento de llegar el daño a 20 
		se cambia el estado a SiegeState, se notifica del cambio de estado y se inicia
		nuevamente el TankMode*/
		
		Tank ContextTank = new Tank();
		System.out.print("Ingrese número de movimientos a realizar: ");
		
		Scanner input = new Scanner(System.in);
        int mov = input.nextInt();
        input.close();
        
        System.out.println();
				
		for(int i=0;i<mov;i++) {
			System.out.println("Movimiento número:"+ " " + (i+1));
			ContextTank.moveTank();			
		}
	}
}