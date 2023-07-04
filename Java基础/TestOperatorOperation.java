public class TestOperatorOperation{
	public static void main(String[] args) {
		/*身高是具有遗传性的，子女的身高和父母的身高有一定的关系。假定，父母和子女的身高遗传关系如下：

		​	儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2

		​	女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2

		现有父亲身高177CM,母亲身高165CM。求子女身高分别预计为多少？*/
		double fa = 177;
		double ma = 165;
		double son = (fa + ma) * 1.08 / 2;
		double da = (fa * 0.923 + ma) / 2;
		System.out.println("儿子身高为：" + son + "cm" + "\n女儿身高为：" + da + "cm");
		System.out.println("\n");
		
		/*红茶妹妹有21元钱，她攒了几天钱之后自己的钱比原来的两倍还多三块。绿茶妹妹有24元钱，
		她攒了几天钱之后自己的钱正好是原来的两倍。那么红茶和绿茶现在的钱一样多，请问对么？*/
		int rTea = 21;
		int gTea = 24;
		rTea = rTea * 2 + 3;
		gTea = gTea * 2;
		boolean result = rTea == gTea;
		System.out.println("红茶和绿茶现在的钱一样多是" + result);
		System.out.println("\n");
		
		/*某小伙想定一份外卖，商家的优惠方式如下：鱼香肉丝单点24元，油炸花生米单点8元，
		米饭单点3元。订单满30元8折优惠。鱼香肉丝优惠价16元，但是优惠价和折扣不能同时
		使用。那么这个小伙要点这三样东西，最少要花多少钱？*/
		double all01 = 24 + 8 + 3;
		all01 = all01 >= 30 ? all01 * 0.8 : all01;
		double all02 = 16 + 8 + 3;
		double min = all01 < all02 ? all01 : all02;
		System.out.println("最少要花" + min + "块钱");
	}
}