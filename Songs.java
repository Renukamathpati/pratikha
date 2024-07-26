class Songs
{
	
	public static void main(String[] args)
	{
		System.out.println("start main in songs");
		
		
	    String songname="amma i love u ";
		String songname1="appa i love u";
		String songname2="rajakumara";
		String songname3="kanmani anboda";
		String songname4="paramatma ";
		String songname5="mellage dhyanisu";
		String songname6="nooru janmaku";
		String songname7="mungaru maleye";
		String songname8="galipata ";
		String songname9="jote joteyali ";
		
		
		String[] songs={songname,songname2,songname3,songname4,songname5,songname6,songname7,songname8,songname9};
		
		for(int index=0;index<songs.length;index++)
		{
			String ref=songs[index];
			System.out.println("songname:"+ref);
			
		}
		System.out.println("reverse of songs");
		for(int index=songs.length-1;index>=0;index--)
		{
			String ref=songs[index];
			System.out.println("songname:"+ref);
			
		}
		System.out.println("total length of songs"+songs.length);
		System.out.println("end main in songs");
	}
	}