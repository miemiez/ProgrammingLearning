package Day03Extends2;

public class Test{
	public static void main(String[] args) {
		Lecture l = new Lecture("L001","Teacher.Li","主讲师");
		System.out.println(l.getId() + "," + l.getName() + ","  + l.getWork());
		l.work();
		
		Tutor t = new Tutor("T002","Teacher.Tai","助教");
		System.out.println(t.getId() + "," + t.getName() + ","  + t.getWork());
		t.work();
		
		Maintainer m = new Maintainer("M003","Teacher.Mei","维护专员");
		System.out.println(m.getId() + "," + m.getName() + ","  + m.getWork());
		m.work();
		
		Buyer b = new Buyer("B005","Teacher.Wang","采购专员");
		b.setId("B004");
		System.out.println(b.getId() + "," + b.getName() + ","  + b.getWork());
		b.work();
	}
}