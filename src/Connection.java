import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Connection {
	public static int getConCode(String url) {
		if(url==null) {
			System.err.println("URL is Null . please give valid one");
			return 0;
		}
		int code = 0;
		try {
			URL url2 = new URL(url);
			HttpsURLConnection conn= (HttpsURLConnection)url2.openConnection();
			conn.setConnectTimeout(1000);
			code = conn.getResponseCode();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Connection failure. Please check printStack below");
			e.printStackTrace();
			
		} 
		
			return code;
		
	}
	
	public static void main(String[] args) {
		int code = Connection.getConCode("https://example.com");
		System.out.println(code==200?"Connection successful.HTTP Code:"+code:"");
	}
}
