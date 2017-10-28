import java.util.*;
public class Stewie
{
	public static void main(String[] args)
	{
		drawBanner();
	}
		public static void drawBanner()
		{
			drawTop();
			drawMessage();
			drawBottom();
		}
		public static void drawTop()
		{
			System.out.println("//////////////////////");
		}
		public static void drawMessage()
		{
			System.out.println("|| Victory is mine! ||");
		}
		public static void drawBottom()
		{
			System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		}
}

