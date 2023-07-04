const data = JSON.stringify({destination:'aaaaa'});
const data2 = "{\"destination\":\"aaaaa\"}";
console.log(data == data2);//true

const textBlob = new Blob(['Hello, World!','ee'], { type: 'text/plain'});
console.log(textBlob.size);//15
console.log(textBlob.type);//text/plain
console.log(textBlob.slice(0,1));//blob.slice(start, end, contentType)：从 Blob 对象中截取一部分数据，并返回新的 Blob 对象。
console.log(URL.createObjectURL(textBlob));//URL.createObjectURL(blob)：创建一个临时 URL，用于访问 Blob 对象。
