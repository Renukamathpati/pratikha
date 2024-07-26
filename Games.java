class Games
{
	public static void main(String[] args)
	{
	
	
	System.out.println("start  main in games");
		
		String name="ludo ";
		String name1="candicrush";
		String name2="pubg";
		String name3="free fire";
		String name4="temple run ";
		String name5="subway surface";
		String name6="carem ";
		String name7="ches";
		String name8="snake ladder ";
		String name9="car racing ";
		
		String[] games={name,name2,name3,name4,name5,name6,name7,name8,name9};
		
		for(int index=0;index<games.length;index++)
		{
			String ref=games[index];
			System.out.println("games:"+ref);
		}
		System.out.println("after reversing array");
		for(int index=games.length-1; index>=0;index--)
		{
			String ref=games[index];
			System.out.println("games:"+ref);
		}
		System.out.println("total length of games"+games.length);
		System.out.println("end main in games");
}
}