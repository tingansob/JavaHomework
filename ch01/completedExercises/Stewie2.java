import java.util.*;
public class Stewie2
{
	public static void main(String[] args)
	{
		drawTop();
		drawBody();
	}
		public static void drawTop()
		{
			System.out.println("//////////////////////");
		}
		public static void drawMessage()
		{
			System.out.println("|| Victory is mine! ||");
			System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		}
		public static void drawBody()
		{
			drawMessage();
			drawMessage();
			drawMessage();
			drawMessage();
			drawMessage();
		}
}

/*
	public static void main(String[] args)
	{
		drawBanner();
	}
		public static void drawBanner()
		{
			drawTop();
			drawMessage();
	//		drawBottom();
			drawMessage();
	//		drawBottom();
			drawMessage();
	//		drawBottom();
			drawMessage();
	//		drawBottom();
			drawMessage();
	//		drawBottom();
		}
		public static void drawTop()
		{
			System.out.println("//////////////////////");
		}
		public static void drawMessage()
		{
			System.out.println("|| Victory is mine! ||");
			System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		}
		public static void drawBottom()
		{
			System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		}
		*/
