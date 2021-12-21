package LR_6;

public class Program 
{
	public static void main(String[] args) {
        
	 	Bank<String> acc1 = new Bank<String>("Банк", "Москве", "ПАО Сбербанк");
	 	acc1.getInfo();
	 	Bank<Integer> acc2 = new Bank<Integer>(12, "Санкт-Петербург", "Альфа-Банк");
	 	acc2.getInfo();
	 	Services ser = new Services(6);
	 	ser.<String>print(ser.getArray());
	}
}
