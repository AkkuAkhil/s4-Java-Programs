import java.io.*;
class emp{
	int no,age;
	String name;
	emp(){}
	emp(int a,String b){
		no=a;
		name=b;
		System.out.println("NO : "+no+"\nNAME : "+name);
	}
	emp(int a,String b,int c){
		no=a;
		name=b;
		age=c;
		System.out.println("NO : "+no+"\nNAME : "+name+"\nAGE : "+age);
	}
	public static void main(String[] args){
		emp e1=new emp(1,"akku");
		emp e2=new emp(1,"achu",21);
	}
}