package j08;
class CTest{
	void test(int num) {
		if(num==0) {
			System.out.println("此數為0");
		}else if(num%2==0) {
			System.out.println("此數為偶數");
		}else {
			System.out.println("此數為奇數");
		}
	}
}
public class class7 {
	public static void main(String[] args) {
		CTest c = new CTest();
		c.test(3);
		c.test(8);
		c.test(0);
		
	}
}
