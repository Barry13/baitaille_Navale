package modele;

public class Case {
	int x;
	int y;
	boolean touché = false;
	
	public Case(){
		
	}
	public Case(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public boolean isTouché() {
		return touché;
	}
	public void setTouché(boolean touché) {
		this.touché = touché;
	}
}
