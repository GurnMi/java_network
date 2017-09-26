

import java.net.MalformedURLException;
import java.net.URL;

public class ParseURL {

	public static void main(String[] args) {
		URL opiniion = null;
		URL homePage = null;
		
		try {
			homePage = new URL("http://www.dgit.or.kr");
			opiniion = new URL(homePage, "SUB/?ctId=15");
			System.out.printf("protocal : %s", opiniion.getProtocol());
			System.out.printf("host : %s", opiniion.getHost());
			System.out.printf("port : %s", opiniion.getPort());
			System.out.printf("path : %s", opiniion.getPath());
			System.out.printf("filename : %s", opiniion.getFile());
			
			
		} catch (MalformedURLException e) {
			System.out.println("잘못된 URL 주소");
			e.printStackTrace();
		}

	}

}
