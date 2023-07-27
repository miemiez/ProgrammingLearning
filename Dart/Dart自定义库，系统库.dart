abstract class Animal{
  String eat();
  void drink();
}

class Dog implements Animal{
  @override
  void drink() {
    // TODO: implement drink
  }

  @override
  String eat() {
    // TODO: implement eat
    throw UnimplementedError();
  }

}