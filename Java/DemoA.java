class DemoA{
	
	public static void main(String args[]){
		Child c=new Child();
		c.message();
		System.out.println(c.gold);

		System.out.println("*************");
		c.pMessage();
		System.out.println(c.pgold);

		System.out.println("*************");

		c.gMessage();
		System.out.println(c.ggold);

	}
}
