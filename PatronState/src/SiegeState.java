
public class SiegeState implements iState {

	private boolean canMove;
	private int damage;
	
	@Override
	public void moveTank(Tank context) {
		// TODO Auto-generated method stub
		
		damage = 20;
		canMove = false;
		
		System.out.println("!!!! Siege State !!!!");
		System.out.println("Movimiento: " + canMove + ". Daño actual: " + damage);
		System.out.println();
		
		System.out.println("===== Vuelta a Tank State =====");
		context.setState(new TankState());
	}
}
