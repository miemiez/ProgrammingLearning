class UnownedTestA{
    var name:String
    var ref:UnownedTestB? = nil
    init(name:String){
        self.name = name
    }
    deinit{
        print("Test被销毁 - " + self.name)
    }
}

class UnownedTestB{
    var name:String
    unowned var ref:UnownedTestA
    init(name:String,ref:UnownedTestA){
        self.name = name
        self.ref = ref
    }
    
    deinit{
        print("Test被销毁 - " + self.name)
    }
}

var testA:UnownedTestA? = UnownedTestA(name:"TOM")
testA!.ref = UnownedTestB(name: "JERRY", ref: testA!)
testA = nil
