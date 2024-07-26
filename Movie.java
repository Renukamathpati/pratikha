class Movie
{
	public static void main(String[] args)
	{
		System.out.println("start main in movie");
		
		String moviename="akash ";
		String moname1="milana";
		String name2="abhi";
		String name3="arasu";
		String name4="paramatma ";
		String name5="jaaki ";
		String name6="raj ";
		String name7="ram ";
		String name8="hudugaru ";
		String name9="rajakumar ";
		String name10="appu ";
		String name11="veerakannadiga ";
		String name12="pawar ";
		String name13="anjinaputra ";
		String name14="dosmanehudga ";
		String name15="ulidavaru kandante ";
		String name16="galipata ";
		String name17="maleyali joteyali ";
		String name18="kotigobba ";
		String name19="ranna ";
		String name20="mungaru male ";
		
		
		String[] names={name8,name9,name10,name11,name18,name19,name3,name4,name7,name8,name14,name20,name12,name5,name13,name12,name16,name10,name2};
		
		for(int index=0;index<names.length;index++)
			
		{
		String ref=names[index];
			System.out.println("name:"+ref);
			
		}
		System.out.println("reverse of movies");
		for(int index=names.length-1;index>=0;index--)
			
		{
		String ref=names[index];
			System.out.println("name:"+ref);
			
		}
		System.out.println("total length of names"+names.length);
		
		
		System.out.println("end main in movie");
		
		
		
	}
	}