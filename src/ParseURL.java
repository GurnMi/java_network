

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class ParseURL {

	public static void main(String[] args) throws IOException {
		URL opinion = null;
		URL homePage = null;
		
		try {
			homePage = new URL("http://www.dgit.or.kr");
			opinion = new URL(homePage, "SUB/?ctId=15");
			System.out.printf("protocal : %s", opinion.getProtocol());
			System.out.printf("host : %s", opinion.getHost());
			System.out.printf("port : %s", opinion.getPort());
			System.out.printf("path : %s", opinion.getPath());
			System.out.printf("filename : %s", opinion.getFile());
			
			BufferedReader br = new BufferedReader(new InputStreamReader(opinion.openStream()));
			String line = null;
			
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
			br.close();
		} catch (MalformedURLException e) {
			System.out.println("잘못된 URL 주소");
			e.printStackTrace();
		}

	}

}
