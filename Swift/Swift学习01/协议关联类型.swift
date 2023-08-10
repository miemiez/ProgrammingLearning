protocol Test{
    associatedtype D
    func play(param: D)
}

class Student:Test
{
    func play(param:String){
        print(param)
    }
}

var s = Student()
s.play(param:"hello")