import {greet as greeterEspanol} from './JS-06-模块1';
import {greet as greeterFrancais} from './JS-06-模块2';
//用 {原名 as 新名} 这种方式解决重名问题
greeterEspanol();
greeterFrancais();