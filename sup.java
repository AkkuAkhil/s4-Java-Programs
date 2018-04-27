//use of SUPER

class per{
	int id;
	String name;
	per(int x,String y){
		this.id=x;
		this.name=y;
	}
}

class emp extends per {
	double f;
	emp(int x,String y,double z){
		super(x,y);
		this.f=z;
		System.out.println("Id is "+id+"\nName is "+name+"\nSalary is "+f);
	}
}

class sup{
	public static void main(String args[]){
		emp e1=new emp(1,"akku",466.87);
	}
}