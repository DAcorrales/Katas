
public class TankState implements iState {
	
	private boolean canMove;
	private int damage;

	@Override
	public void moveTank(Tank context) {
		// TODO Auto-generated method stub
		
		canMove = true;
		damage = damage + 5;
		if(damage == 20) {
			context.setState(new SiegeState());
		}
		System.out.println("Tank State");
		System.out.println("Movimiento: " + canMove + ". Daño actual: " + damage);
		System.out.println();
	}
}