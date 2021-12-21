package LR_6;

public class Bank<T>{
	private T id;
    private String city;
    private String nameBank;
     
    Bank(T id, String city, String nameBank){
        this.id = id;
        this.city = city;
        this.nameBank = nameBank;
    }
     
    public T getId() { return id; }
    public String getCity() { return city; }
    public String getNameBank() {return nameBank;}
    public void getInfo() {
    	if (id instanceof String)System.out.printf("%s %s находится в городе %s\n\n",id, nameBank, city);
    	else System.out.printf("Банк %s находится по координатам  %s в городе %s\n\n", nameBank, id,city);
    	}
}
