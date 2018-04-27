import java.io.*;
class emp1{
	int no,age;
	String name;
	void create(int a,String b){
		no=a;
		name=b;
		System.out.println("NO : "+no+"\nNAME : "+name);
	}
	void create(int a,String b,int c){
		no=a;
		name=b;
		age=c;
		System.out.println("NO : "+no+"\nNAME : "+name+"\nAGE : "+age);
	}
	public static void main(String[] args){
		emp1 e1=new emp1();
		e1.create(4,"adi");
		e1.create(4,"adi",16);
	}
}