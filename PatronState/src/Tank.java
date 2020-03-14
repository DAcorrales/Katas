
public class Tank {
	
	private iState state;
	
	public Tank() {
		state = new TankState();
	}

	public void setState(iState newState) {
		state = newState;
	}
	
	public void moveTank() {
		state.moveTank(this);
	}
}