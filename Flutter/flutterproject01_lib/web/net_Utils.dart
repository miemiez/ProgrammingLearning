import 'package:http/http.dart' as http;

class NetUtils {
  static Future<String> get(String url,Map<String,dynamic> params) async{
    if(url != null && params != null && params.isNotEmpty){
      StringBuffer str = StringBuffer("?");
      params.forEach((key, value) {
        str.write("$key=$value&");
      });
      String paramStr = str.toString().substring(0,str.length-1);
      url += paramStr;
    }
    http.Response response = await http.get(Uri.parse(url));
    return response.body;
  }

  static Future<String> post(String url,Map<String,dynamic> params) async{
    http.Response response = await http.post(url as Uri,body:params);
    return response.body;
  }
}