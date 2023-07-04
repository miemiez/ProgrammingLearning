// Information to reach API
const url = 'https://api.datamuse.com/words?';
const queryParams = 'rel_jja=';

// Selecting page elements
const inputField = document.querySelector('#input');
const submit = document.querySelector('#submit');
const responseField = document.querySelector('#responseField');

// Asynchronous function
// Code goes here
const getSuggestions = async() => {
  const wordQuery = fetch(inputField.value);
  const endpoint = url + queryParams + wordQuery;/*wordQuery 实际上是一个 Promise 对象，
  它尚未解决为具体的响应数据。但是，在拼接 endpoint 字符串时，JavaScript 会自动将 Promise 
  对象转换为相应的字符串表示形式。这个字符串表示形式通常是 "[object Promise]"。*/
  try{
    const response = await fetch(endpoint,{
      cache: 'no-cache'
    });
    if(response.ok){
      const jsonResponse = await response.json();
      renderResponse(jsonResponse);
    }
  }catch(error){
    console.log(error);
  }
}

// Clear previous results and display results to webpage
const displaySuggestions = (event) => {
  event.preventDefault();
  while(responseField.firstChild){
    responseField.removeChild(responseField.firstChild)
  }
  getSuggestions();
}

submit.addEventListener('click', displaySuggestions);
