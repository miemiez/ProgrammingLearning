package Day96Java练习14;

public class Computer {
	public static void main(String[] args) {
		PC pc = new PC("英特尔i3-12100", "8GB", "1T", "戴尔");
		pc.printInfo();
		NotePad np = new NotePad("英特尔i3-10105", "4GB", "256GB", "银灰色");
		np.printInfo();
	}
	
	private String CPU;
	private String 内存;
	private String 硬盘;
	
	public Computer(String CPU,String 内存, String 硬盘) {
		this.CPU = CPU;
		this.内存 = 内存;
		this.硬盘 = 硬盘;
	}
	
	public String getDetails() {
		return "CPU = " + CPU + ";\t" + "内存 = " + 内存 + ";\t" + "硬盘 = " + 硬盘 + ";\t";
	}
}

class PC extends Computer {
	private String brand;
	
	public PC(String CPU, String 内存, String 硬盘, String brand) {
		super(CPU, 内存, 硬盘);
		this.brand = brand;
	}
	
	public void printInfo() {
		System.out.println("PC信息 = ");
		System.out.println(super.getDetails() +"brand = " + brand + "\n");
	}
}

class NotePad extends Computer {
	private String color;
	
	public NotePad(String CPU, String 内存, String 硬盘, String color) {
		super(CPU, 内存, 硬盘);
		this.color = color;
	}
	
	public void printInfo() {
		System.out.println("NotePad信息 = ");
		System.out.println(super.getDetails() +"color = " + color + "\n");
	}
}