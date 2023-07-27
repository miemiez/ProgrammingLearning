// main(){
//   print('你好dart');
// }
typedef WWW = String Function(int a);
void main(){
  //WWW b;
  print('你好dart');

  void f1(int a){
    print(a*a);
  }

  String f2(int a){
    print('aaa');
    return 'aa';
  }

  print(f2 is WWW);
  AAA(b: f2);
  // b = f2;
  // b(1);
  // WWW a = f2;
  // a(1);
}

class AAA{
  WWW b;
  AAA({required this.b});


}