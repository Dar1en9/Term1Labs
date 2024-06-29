//Возвести каждую цифру числа N в степень, равную количеству цифр N, и суммировать, используя
//конструкцию switch-case
public class ArmstrongNumbers {
	public static void main(String[]args) {
		int N = 2581, p, i, sum = 0, p2 = 2, p3 = 3, p5 = 5, p7 = 7;
		p = countDigits(N);
		p2 = pow(p2, p);
		p3 = pow(p3, p);
		p5 = pow(p5, p);
		p7 = pow(p7, p);
		for(i = 1; i <= p; i++) {
			switch(N % 10) {
				case 1:
					sum += 1;
					break;
				case 2:
					sum += p2;
					break;
				case 3:
					sum += p3;
					break;
				case 4:
					sum += p2 * p2;
					break;
				case 5:
					sum += p5;
					break;
				case 6:
					sum += p2 * p3;
					break;
				case 7:
					sum += p7;
					break;
				case 8:
					sum += p2 * p2 * p2;
					break;
				case 9:
					sum += p3 * p3;
					break;
			}
			N /= 10;
		}
		System.out.println(sum);
	}
	static int countDigits(int num) {
		int amount = 0;
		while (num != 0) {
			amount += 1;
			num /= 10;
		}
		return amount;
	}
	static int pow(int n, int p) {
		int kv = n * n, p2, res = 1;
		p2 = p / 2;
		for(int i = 1; i <= p2; i ++)
			res *= kv;
		if (p % 2 != 0)
			res *= n;
		return res;
	}
}

