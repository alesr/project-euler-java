import java.math.BigInteger;

public class Euler97 {

	public static void main(String[] args) {

		BigInteger modulus = BigInteger.TEN.pow(10);
		BigInteger n = BigInteger.valueOf(2).modPow(BigInteger.valueOf(7830457), modulus);
		n = n.multiply(BigInteger.valueOf(28433)).mod(modulus);
		n = n.add(BigInteger.ONE).mod(modulus);
		String s = String.format("%010d", n);
		System.out.println(s);
	}
}