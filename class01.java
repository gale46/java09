package java09;

class CRectangle {
	int width;
	int height;
	private int w;
	private int h;
	
	void CRectangle() {
		width = 10;//設數值
		height = 8;
		
		
	}

	void CRectangle(int w, int h) {//傳入w, h
		width = w;
		height = h;
		//width = this.w;//使用this
		//height = this.h;
		
	}
	
	

}

public class class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRectangle cr = new CRectangle();//建立物件
		cr.CRectangle();
		cr.CRectangle(0, 0);
		
		
	}

}
