package LR_6;

public class Services 
{
	private String[] array;
	public Services(int size)
	{
		array = new String[size];
		for (int i=0;i<size;i++)
		{
			array[0] = (1 +" ��������");
			array[1] = (2 +" ����� ��������� �����");
			array[2] = (3 +" ����� ��������� �����");
			array[3] = (4 +" ��������� ������");
			array[4] = (5 +" �������� �����");
			array[5] = (6 +" ������ ��������");
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
