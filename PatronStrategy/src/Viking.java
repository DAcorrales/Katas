
public class Viking {
	
	int position;
	iMovimiento moveBehavior;

	public Viking(iMovimiento moveBehavior){
		this.moveBehavior = moveBehavior;
	}

	public void setMoveBehavior(iMovimiento moveBehavior) {
		this.moveBehavior = moveBehavior;
	}
	
	public void move() {
		this.position = moveBehavior.move(this.position);
	}
}