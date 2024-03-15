package new2;

public class SunMoon {

	public static void main(String[] args) {
		for(int i=1;i<=1000;i++)
			/*	{
					if(i>0)
					{
						if(i%3==0&&i%5==0)
						{
							System.out.println("sun & moon " +i);
						}
						else if(i%5==0)
						{
							System.out.println("moon " +i);
						}
						else if(i%3==0)
						{
							System.out.println("sun " +i);
						}
						
					}
					
				}*/
				{
					if(i%3==0)
					{
						System.out.println("sun " +i);
					}
					if(i%5==0)
					{
						System.out.println("moon " +i);
					}
					if(i%3==0&&i%5==0)
					{
						System.out.println("sun and moon " +i);
					}
				}

	}

}
