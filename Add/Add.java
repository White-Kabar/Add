
public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1, y =1, z;
		z = add(x, y);
		System.out.println("x = "+x+","+"y = "+y);
	}
	public static int add(int x, int y) {
		int z = x + y;
		x = 0;
		y = 0;
		return z;
	}

}
