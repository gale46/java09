
class CSphere {
    private int x;
    private int y;
    private int z;
    private int radius;

    void setLcation() {
        x = 3;
        y = 4;
        z = 5;
    }

    public void setRadius() {
        radius = 1;
    }

    double surfaceAreas() {
        return 4 * 3.14 * Math.pow(radius, 2);

    }

    double volume() {
        return 4 / 3 * 3.14 * Math.pow(radius, 3);
    }

    void showCenter() {
        
        System.out.printf("(%d,%d,%d)\n",x ,y ,z );
    }
}

public class main1 {
    public static void main(String[] args) {
        CSphere cs = new CSphere();
        cs.setLcation();
        cs.setRadius();
        cs.setRadius();
        cs.surfaceAreas();
        cs.showCenter();
    }
}
