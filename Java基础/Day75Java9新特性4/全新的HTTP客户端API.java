package Day75Java9新特性4;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class 全新的HTTP客户端API {
	/*
	 * HTTP（超文本传输协议），用于传输网页的协议，早在1997年被采用在目前的1.1版本中，知道2015年，HTTP2才成为标准
	 * 
	 * HTTP/1.1和HTTP/2的主要区别：
	 *     主要区别是如何在客户端和服务器之间构建和传输数据。【HTTP/1.1依赖于请求/响应周期】
	 *     【HTTP/2允许服务器“push”数据：它可以发送比客户端请求更多的数据】，这使得它可以优先处理并发送对于首先加载网页至关重要的数据
	 * 
	 * Java9中有新的方式来处理HTTP调用，它提供了一个新的HTTP客户端【HTTPClient】，
	 * 它将代替仅适用于blocking模式的HttpURLConnection（HttpURLConnection是在HTTP1.0的时代创建的，并使用了协议无关的方法），
	 * 并提供对WebSocket和HTTP/2的支持。
	 */
	//【jdk9中，使用HttpClient替换原有的HttpURLConnection】
//	public static void main() {
//		try {
//			HttpClient client = HttpClient.newHttpClient();
//			
//			HttpRequest req = HttpRequest.newBuilder(URI.create("http://www.baidu.com")).GET().build();
//			
//			HttpResponse<String> response = null;
//			
//			response = client.send(req,HttpResponse.BodyHandler.asString());  【通过client去发送一个请求，获取响应】
//			System.out.println(response.statusCode());  【获取响应码】
//			System.out.println(response.version().name());  【获取响应所对应的协议的版本名】
//			System.out.println(response.body());  【获取相应体】
//		}catch(IOException e) {
//			e.printStackTrace();
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
//	}
}
