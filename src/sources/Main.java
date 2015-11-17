package sources;

public class Main {

	public static void main(String[] args) {
		Matrix m = new Matrix(2, 2);
		m.makeRandomMatrix(2, 2);
		m.toString();
		System.out.println("\n");
		
		Matrix k = new Matrix(2, 3);
		k.makeRandomMatrix(2, 3);
		k.toString();
		System.out.println("\n");
		
		m.multiplyByMatrix(k);
		m.toString();
	//dummy for git verification
	}
}
