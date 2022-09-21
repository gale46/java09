package java09;
class Caaa{
	private int value;
	public Caaa() {
		System.out.println("Value="+value);
		
	}
	public Caaa(int i) {
		value = i;
		System.out.println("Value="+value);
	}
}
public class hw9_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caaa obj01 = new Caaa();
		Caaa obj02 = new Caaa(12);
		//obj01->Caaa()
		//obj02->Caaa(int i)
		//否,只能用一個public
		//否,沒有其他class
		

	}

}
