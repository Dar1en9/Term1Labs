//Вывести первые 7 чисел Мерсена (число Мерсена - простое число, которое может быть представлено в виде
//(2^p)-1, где p - тоже простое число)
public class MersennePrime {
	public static void main(String[]args) {
		int p = 3, i, x = 1, n = 1;
		double kvp, kvx;
		System.out.print(3);
		for ( ; n < 7; p += 2){
			kvp = Math.sqrt(p);
			for (i = 3; i <= kvp; i += 2)
				if (p % i == 0)
					break;
			if (i > kvp) {
				x ++; 
				x *= 4;
				x --;
				kvx = Math.sqrt(x);
				for (i = 3; i <= kvx; i += 2)
					if (x % i == 0)
						break;
				if (i > kvx) {
					System.out.print(", " + x);
					n ++;
				}
			}
		}
	}
}
