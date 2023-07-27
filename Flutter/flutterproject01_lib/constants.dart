abstract class AppColors{
  //应用主题色
  static const APP_THEME = 0xff63ca6c;
  static const APPBAR = 0xffffffff;
}

abstract class AppInfos{
  static const String CLIENT_ID = 'vU2e5pK2UM3YqSdX8eWz';
  static const String CLIENT_SECRET = 'tUPKZBxQiDz7R6V5XyDzuT5MlspJEe3g';
  static const String REDIRECT_URI = 'https://www.oschina.net/news';
}

abstract class AppUrls{
  static const String HOST = 'https://www.oschina.net';

  //授权登录
  static const String OAUTH2_AUTHORIZE = HOST + '/action/oauth2/authorize';
  //獲取token
  static const String OAUTH2_TOKEN = HOST + '/action/openapi/token';
  //獲取用戶信息
  static const String OPENAPI_USER = HOST + '/action/openapi/user';

  static const String MY_INFORMATION = HOST + '/action/openapi/my_information';
  static const String MESSAGE_LIST = HOST + '/action/openapi/message_list';
}