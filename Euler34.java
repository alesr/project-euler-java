public class Euler34 {

	public String start(){
		int sum = 0;
		// 9!*9 digitos <  10000000
		int limit = 10000000;
		for (int i = 3; i < limit; i++) {
			if (i == digitFactSum(i)) {
				sum += i;
			}
		}
		return Integer.toString(sum);
	}

	// 1!...9!
	public static int[] Fact = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};

	public static int digitFactSum(int x) {

		int sum = 0;
		while (x != 0) {
			sum += Fact[x % 10];
			x /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Euler34 a = new Euler34();
		//String s;
		System.out.println(a.start());
	}
}