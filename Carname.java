class Carname
{
	public static void main(String[] args)
	{
		System.out.println("start main in carname");
		
		String name="thar ";
		String name1="swift";
		String name2="kia";
		String name3="hyundai";
		String name4="mahindra ";
		String name5="xuv";
		String name6="rose roise ";
		String name7="ambasider";
		String name8="aoudee";
		String name9="scorpio";
		String name10="toyota";
		String name11="mg ";
		String name12="skoda";
		String name13="maruti ";
		String name14="huda";
		
		String[] cars={name,name2,name3,name4,name5,name6,name7,name8,name9,name10,name11,name12,name13,name14};
		
		for(int index=0;index<cars.length;index++)
		{
			String ref=cars[index];
			System.out.println("cars:"+ref);
		}
		System.out.println("reverse of cars");
		for(int index=cars.length-1;index>=0;index--)
		{
			String ref=cars[index];
			System.out.println("cars:"+ref);
		}
		System.out.println("total length of cars"+cars.length);
	
	System.out.println("end main in carname");
	}
	
}