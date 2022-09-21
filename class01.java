package java09;

class CRectangle {
	int width;
	int height;
	private int w;
	private int h;
	
	void CRectangle() {
		width = 10;
		height = 8;
		
		
	}

	void CRectangle(int w, int h) {
		width = w;
		height = h;
		//width = this.w;
		//height = this.h;
		
	}
	
	

}

public class class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRectangle cr = new CRectangle();
		cr.CRectangle();
		cr.CRectangle(0, 0);
		
		
	}

}
