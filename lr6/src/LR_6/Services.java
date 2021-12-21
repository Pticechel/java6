package LR_6;

public class Services 
{
	private String[] array;
	public Services(int size)
	{
		array = new String[size];
		for (int i=0;i<size;i++)
		{
			array[0] = (1 +" Переводы");
			array[1] = (2 +" Заказ дебетовой карты");
			array[2] = (3 +" Заказ кредитной карты");
			array[3] = (4 +" Проверить баланс");
			array[4] = (5 +" Оформить вклад");
			array[5] = (6 +" Купить подписки");
		}
	}
	
	public String[] getArray()
	{
		return array;
	}
    public <T> void print(T[] items){
        for(T item: items){
            System.out.println(item);
        }
    }
}
