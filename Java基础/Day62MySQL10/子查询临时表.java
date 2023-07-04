package Day62MySQL10;

public class 子查询临时表 {
	/* 
	 * 把子查询当作一张临时表可以解决很多复杂问题，就是效率不是很高
	 * 
	 * 查询ecshop中各个类别中，价格最高的商品
	 *     可以将子查询当作一张临时表使用
	 *     SELECT goods_id,ecshop.category,goods_name,price FROM 
	 *            (SELECT category,MAX(price) FROM ecshop GROUP BY category) temp,ecshop 
	 *            WHERE ecshop.price = MAX(price) AND ecshop.category = temp.price
	 */
}
