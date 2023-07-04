package Day94Java练习12;

public class Practice02可变参数 {
	public static void main(String[] args) {
		Practice02可变参数 p = new Practice02可变参数();
		String str1 = p.showScore("LHY",120,160);
		String str2 = p.showScore("LHY",120,160,140);
		System.out.println(str1);
		System.out.println(str2);
	}
	
	public String showScore(String name,double... scores) {
		double totalScore = 0;
		for(int i = 0;i < scores.length;i++) {
			totalScore += scores[i];
		}
		return name + "总成绩 = " + totalScore;
	}
}
