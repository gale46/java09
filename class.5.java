package j08;

class CBox {
	int lenght;
	int width;
	int height;

	int volume() {
		return lenght * width * height;
	}

	int surfaceArea() {
		return lenght * width * 6;
	}

	void showData() {
		System.out.println(lenght + " " + width + " " + height);
	}

	void showAll() {
		showData();
		System.out.println(surfaceArea());
		System.out.println(volume());

	}

}

public class j5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CBox box = new CBox();
		box.height = 1;
		box.lenght = 1;
		box.width = 1;
		box.showAll();

	}

}
