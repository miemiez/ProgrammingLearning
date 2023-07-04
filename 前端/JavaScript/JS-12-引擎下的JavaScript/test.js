function bigObjMaker() {
    const bigObj = {};
    return (key, val) => {
        bigObj[key] = val;
        console.log(bigObj);
        return key;
    }
}
let bigMemoryUser = bigObjMaker();
 
console.log(Array(10).fill(1).map((x,i) => {return bigMemoryUser(i, i);}));
