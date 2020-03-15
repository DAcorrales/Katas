
import java.util.Scanner;
public class MainViking {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fly fly = new Fly();
		Walk walk = new Walk();
		Viking vikingo = new Viking(walk);

        System.out.println(" *********************************************");
        System.out.println(" *****         Acción a realizar         *****");
        System.out.println(" ***** S: Terminar                       *****");
        System.out.println(" ***** W: Cambiar a modo Walk            *****");
        System.out.println(" ***** F: Cambiar a modo Fly             *****");
        System.out.println(" ***** M: Mover                          *****");
        System.out.println(" *********************************************");
        
        String accion = "";
        while(!accion.equals("S")) {
        	
    		System.out.print("Acción a realizar:" );
    		Scanner input = new Scanner(System.in);
    		accion = input.next();        	
    		accion = accion.toUpperCase();
    		
            switch (accion){
            	case "F":
            		vikingo.setMoveBehavior(fly);
            		System.out.println(" ***** Modo Fly activo ***** ");
            		break;
            	case "W":
            		vikingo.setMoveBehavior(walk);
            		System.out.println(" ***** Modo Walk activo ***** ");
            		break;
            	case "M":
                    vikingo.move();
                    System.out.println("Posición actual: " + vikingo.position);
                    break;
            	case "S":
            		input.close();
            		System.out.println("Fin de ejecución");
            		break;
            }    		
        }
	}
}
