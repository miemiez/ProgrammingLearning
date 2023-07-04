//fetch() 是一个现代的 Web API，用于在浏览器中进行网络请求。
/*使用 fetch() 函数，可以发送不同类型的请求，如 GET、POST、PUT、DELETE 等，并设置请求的头部、请求体、认证等相关信息。
    它返回一个 Promise，可以通过链式调用 then() 和 catch() 方法来处理异步操作的结果。*/
// fetch()功能：
//     （1）创建一个请求对象，其中包含 API 所需的相关信息。
//     （2）将该请求对象发送到提供的 API 端点。
//     （3）返回最终解析为响应对象的承诺，其中包含承诺的状态以及 API 发回的信息。

/*下面是 fetch() 函数的基本语法：
    fetch(url, options)
    .then(response => {
        // 处理响应
    })
    .catch(error => {
        // 处理错误
    });
    url：表示要请求的 URL，可以是相对 URL 或绝对 URL。
    options：一个可选的配置对象，用于指定请求的方法、头部、请求体等参数。
*/

//fetch Get
fetch("http://api-to-call.com/endpoint")
.then(response => {
    if(response.ok){
        return response.json();
    }
    throw new Error("Request failed!");
},networkError => console.log(networkError.message))
.then(jsonResponse => {
    //Code to execute with jsonResponse
})