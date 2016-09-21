package conflict;

public class Konflikt01 {
	
	public int durchmesser(int x) {
		return x*2;
	}
	
	public int umfang(int d) {
		
		if(durchmesser(3)>0){
			return d*3;
		}
		
		return 0;
	}
	
	
}
