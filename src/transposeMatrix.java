import java.util.Random;
public class transposeMatrix {
    static int[][] newArray(int sz1, int sz2){ //создает массив заданной размерности
        int[][] x;
        x = new int[sz1][];
        int i;
        for (i = 0; i < x.length; i++)
            x[i] = new int[sz2];
        return x;
    }
    static void print(int[][] x) { //выводит элементы массива как матрицу
        for (int[] a :x) {
            for (int p:a)
                System.out.printf("%5d", p);
            System.out.println();
        }
    }
    static void randomize(int[][] x) { //заполняет массив заданной размерности рандом. числами от -99 до 99
        Random r = new Random();
        int i, j;
        for (i = 0; i < x.length; i++)
            for (j = 0; j < x[i].length; j++)
                x[i][j] = r.nextInt()%100;
    }
    static int[][] rectangle(int[][] x){ //для прямоугольной матрицы
        int[][] y = new int[x[0].length][];
        int i, j;
        for(i = 0; i < y.length; i++)
            y[i] = new int[x.length];
        for(i = 0; i < x.length; i++)
            for(j = 0; j < x[0].length; j++)
                y[j][i] = x[i][j];
        return y;
    }
    static void square(int[][] x){ //для квадратной матрицы
        int temp;
        for(int i = 0; i < x.length; i++)
            for(int j = i+1; j < x.length; j++) {
                temp = x[j][i];
                x[j][i] = x[i][j];
                x[i][j] = temp;
            }
    }
    public static void main(String[]args) {
        int[][] x = newArray(4, 4); //задаем матрицу размером 4 на 4
        randomize(x);
        print(x); //выводим ее с рандомными значениями
        System.out.println();
        if(x.length != x[0].length)
            x = rectangle(x);
        else
            square(x);
        print(x);

    }
}
