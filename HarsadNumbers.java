//Вывести числа Харшад, не превышающие число N (число Харшад - натуральное число, делящееся нацело
//на сумму своих цифр)
public class HarsadNumbers {
	public static void main(String[]args) {
		int N = 245, s = 0, i, n = 10, j, k = 0;
		System.out.println("Числа Харшад, не превышающие " + N + ":");
		if (N <= 9)
			for (i = 1; i <= N; i++) {
				System.out.println(i);
				k++;
			}
		else {
			for (i = 1; i <= 9; i++) {
				System.out.println(i);
				k++;
			}
			for ( ; n < N; s = 0) {
				i = n / 10;
				while (i != 0) {
					s += i % 10;
					i /= 10;
				}
				for (j = 1; j <= 10; j++, s++, n++)
					if (n > N)
						break;
					else if (n % s == 0) {
						System.out.println(n);
						k++;
					}
			}
		}
		System.out.println("Общее количество: " + k);
	}
}
