package javaprogramsforinterview;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo {

	public static void main(String[] args) {
		
		Date d = new Date();
		
		SimpleDateFormat sdf= new SimpleDateFormat("M/d/yyyy");
		System.out.println(d.toString());
		System.out.println(sdf.format(d));

	}

}
