//Посчитать сдачу
public class Program {
	public static void main(String[]args) {
		int pound_cost = 10, shilling_cost = 5, penny_cost = 10; //цена в фунтах, шиллингах и пенни
		int pound_cash = 50, shilling_cash = 0, penny_cash = 12; //полученные наличные
		int change = ((pound_cash - pound_cost) * 12 * 20 + (shilling_cash - shilling_cost) * 20 +
				penny_cash - penny_cost);
		System.out.println(change < 0 ? "Недостаточно средств" : (change == 0 ? "Нет сдачи" : "Сдача - фунты: " +
				change / 240 + " шиллинги: " + change % 240 / 20 + " пенни: " + change % 20));
	}
}
