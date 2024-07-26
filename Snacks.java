class Snacks
{
	
	public static void main(String[] args)
	{
		System.out.println("start  main in snacks");
		
		String name="samosa";
		String name1="bhel";
		String name2="momos";
		String name3="vada pav";
		String name4="maddur vade ";
		String name5="bonda";
		String name6="sevpuri ";
		String name7="dhokla";
		String name8="aloo bonda ";
		String name9="maggi";
		String name10="manchuri";
		String name11="bhaji ";
		String name12="noodles";
		String name13="ragada ";
		String name14="masalapuri";
		String name15="kachori";
		String name16="katlet";
		String name17="sevpoori ";
		String name18="aloo tikka ";
		String name19="khakra ";
		String name20="pav bhaji";
		String name21="french fries";
		String name22="pakhora";
		String name23="papada";
		String name24="pani puri";
		
		
		String[] snacks={name,name2,name3,name4,name5,name6,name7,name8,name9,name10,name11,name12,name13,name14,name15,name15,name16,name17,name18,name19,name20,name21,name22,name23,name24};
		
		for(int index=0;index<snacks.length;index++)
		{
			String ref=snacks[index];
			System.out.println("snacks:"+ref);
		}
		System.out.println("reverse of snacks");
		for(int index=snacks.length-1;index>=0;index--)
		{
			String ref=snacks[index];
			System.out.println("snacks:"+ref);
			
		}
		
		System.out.println("total length of snacks"+snacks.length);
	System.out.println("end main in snacks");
	}
}


		
		
		