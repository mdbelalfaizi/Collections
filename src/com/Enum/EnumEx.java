package com.Enum;

public class EnumEx {
	
	public  enum   days {
		SUN(10),MON(9),TUE(7),WED(6),THUR(5),FRI(4),SAT(2);
		
		private int data;
		private days(int data) {
			this.data = data;
		}


		public  static String belal() {
			return "this is belal";
		}

	}

	public static void main(String[] args) {
		
		EnumEx ex=new EnumEx();
		days d=days.FRI;
		System.out.println(d);
	    days.belal();
	    System.out.println(days.values());
	
		

	}

}
