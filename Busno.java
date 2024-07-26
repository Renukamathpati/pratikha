class Busno
{
	
	public static void main(String[] args)
	{
		System.out.println("start  main in busno");
		
	     String num="ka21";
		String num1="ka145";
		String num2="ka21";
		String num3="ka401";
		String num4="ka165";
		String num5="ka176";
		
		String[] busnums={num,num1,num2,num3,num4};
		
		for(int index=0;index<busnums.length;index++)
		{
			String ref=busnums[index];
			System.out.println("busno:"+ref);
		}
		System.out.println("revrse of busno");
		for(int index=busnums.length-1;index>=0;index--)
		{
			String ref=busnums[index];
			System.out.println("busno:"+ref);
			
		}
		
		System.out.println("total length of busnums"+busnums.length);
		System.out.println("end main in busno");
}
}