package java09;
class op{
	void add2n(int n) {
		int count = 0;
		for(int i = 1;i<=n;i++) {//從1加到n
			count+=i;
		}
		System.out.println(count);//印出總數
	}
}

public class java06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		op op = new op();
		op.add2n(5);
		op.add2n(10);

	}

}
