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
    public static void main(String[] args) {
        System.out.println(new Num(49).divisors());
    }
}