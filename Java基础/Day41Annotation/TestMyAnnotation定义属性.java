package Day41Annotation;

public class TestMyAnnotation定义属性 {
	@MyAnnotation定义属性(name = "LHY",age = 22,strArr = {"a","b"},
			season = Seasons.WINTER,seasons = {Seasons.SPRING,Seasons.SUMMER,Seasons.AUTUMN,Seasons.WINTER})//必须给所有未给默认值的属性，赋值。    格式：属性名=值
	public void doSome() {
		
	}
	
	@MyAnnotation属性value("如果这个注解只有一个属性value，那么赋值时，属性值value可以不写")
    public void doOther() {
		
	}
}
