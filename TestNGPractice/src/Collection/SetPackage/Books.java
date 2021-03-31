package Collection.SetPackage;

public class Books implements Comparable<Books>{

	String name;
	int cost;
	int year;
	
	Books(String name, int cost, int year){
		this.name = name;
		this.cost = cost;
		this.year = year;
	}
	
	@Override
	public int compareTo(Books b) {
		if(cost>b.cost) {
			return 1;
		}else if(cost<b.cost) {
			return -1;
		}
		return 0;
	}

}
