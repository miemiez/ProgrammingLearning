package Day117Java练习35;

public class 练习09 {
	public static void main(String[] args) {
		Color red = Color.RED;
		red.show();
		switch(red) {
		    case YELLOW:
		    	System.out.println("匹配到黄色");
		    	break;
		    case RED:
		    	System.out.println("匹配到红色");
		    	break;
		    case BULE:
		    	System.out.println("匹配到蓝色");
		    	break;
		    case GREEN:
		    	System.out.println("匹配到绿色");
		    	break;
		    case BLACK:
		    	System.out.println("匹配到黑色");
		    	break;
		}
	}
}

enum Color implements ShowColor{
	RED(255,0,0),BULE(0,0,255),BLACK(0,0,0),YELLOW(255,255,0),GREEN(0,255,0);
	
	private double redValue;
	private double greenValue;
	private double blueValue;
	
	private Color(double redValue,double greenValue,double blueValue){
		this.redValue = redValue;
		this.greenValue = greenValue;
		this.blueValue = blueValue;
	}
	
	public double getRedValue() {
		return redValue;
	}

	public void setRedValue(double redValue) {
		this.redValue = redValue;
	}

	public double getGreenValue() {
		return greenValue;
	}

	public void setGreenValue(double greenValue) {
		this.greenValue = greenValue;
	}



	public double getBlueValue() {
		return blueValue;
	}

	public void setBlueValue(double blueValue) {
		this.blueValue = blueValue;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("属性值为：" + redValue + "," + greenValue + "," + blueValue);
	}

	
}

interface ShowColor{
	void show();
}