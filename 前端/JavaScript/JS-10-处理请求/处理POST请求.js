// Information to reach API
const apiKey = 'df0a6212cb044277b2ea2bd90344169e';
const url = 'https://api.rebrandly.com/v1/links';

// Some page elements
const inputField = document.querySelector('#input');
const shortenButton = document.querySelector('#shorten');
const responseField = document.querySelector('#responseField');

// Asynchronous functions
const shortenUrl = () => {
  const urlToShorten = inputField.value;
  const data = JSON.stringify({destination: urlToShorten});
  
	fetch(url, {
    method: 'POST',
    headers: {
      'Content-type': 'application/json',
      'apikey': apiKey
    },
    body: data
  })
  .then(response => {
    if(response.ok){
      return response.json();/*response.json() 是 Response 对象提供的一个方法，用于读取并解析响应主体中的 JSON 数据。
      它会返回一个被解析后的 JavaScript 对象，或者在解析失败时抛出一个错误。*/
    }
    rederResponse02(response.status,response.statusText);
    throw new Error('Request failed!');
  },networkError => console.log(networkError.message))
  .then(jsonResponse => {
    renderResponse(jsonResponse);
  });
}

// Clear page and call Asynchronous functions
const displayShortUrl = (event) => {
  event.preventDefault();
  while(responseField.firstChild){
    responseField.removeChild(responseField.firstChild);
  }
  shortenUrl();
}

shortenButton.addEventListener('click', displayShortUrl);
