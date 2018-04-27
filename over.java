//overriding
class india{
	void india(){
		System.out.println("Inside india");
	}
}
class kerala extends india{
	void kerala(){
		super();
		System.out.println("inside kerala");
	}
}
class tcr extends kerala{
	void tcr(){
		super();
		System.out.println("Inside tcr");
	}
}

class over{
	public static void main(String args[]){
		tcr t = new tcr();
	}
}