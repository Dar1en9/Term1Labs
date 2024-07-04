public class Num { //Класс числа
    private final int n; //целое число
    public Num(int number) {
        n = number;
    }
    public int divisors() { //метод для подсчета количества делителей
        int count = 0; //счетчик
        double sqrtNum = Math.sqrt(n); //квадратный корень n
        int i = 1;
        for (; i < sqrtNum; i++) //считаем делители до корня
            if (n % i == 0) count += 2;
        if (i == sqrtNum) count++; //если корень из числа целый
        return count;
    }
    public int gcd(int number) { //считает наибольший общий делитель числа n и number
        int a = n;
        int ost = a % number;
        while (ost != 0) { //ищем НОД
            a = number;
            number = ost;
            ost = a % number;
        }
        return number; //возвращаем НОД
    }
    public static void main(String[] args) {
        System.out.println(new Num(49).divisors());
        System.out.println(new Num(52).gcd(78));
    }
}