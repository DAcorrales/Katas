
import java.util.Scanner;

public class MainTank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Cada movimiento aumenta en 5 el da�o, al momento de llegar el da�o a 20 
		se cambia el estado a SiegeState, se notifica del cambio de estado y se inicia
		nuevamente el TankMode*/
		
		Tank ContextTank = new Tank();
		System.out.print("Ingrese n�mero de movimientos a realizar: ");
		
		Scanner input = new Scanner(System.in);
        int mov = input.nextInt();
        input.close();
        
        System.out.println();
				
		for(int i=0;i<mov;i++) {
			System.out.println("Movimiento n�mero:"+ " " + (i+1));
			ContextTank.moveTank();			
		}
	}
}