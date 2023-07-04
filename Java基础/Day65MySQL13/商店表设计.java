package Day65MySQL13;

public class 商店表设计 {
	/*
	 * 现有一个商店的数据库shop_db，记录客户及其购物情况，由下面三个表组成：
	 *     goods（商品）：
	 *         goods_id（商品号），goods_name（商品名），unitprice（单价），category（商品类别），provider（供应商）
	 *     customer（客户）：
	 *         customer_id（客户号），name（姓名），address（住址），email（电子邮箱），sex（性别），card_id（身份证）
	 *     purchase（购买）：
	 *         order_id（购买订单号），customer_id（客户号），goods_id（商品号），nums（购买数量）
	 *         
	 *     建表，在定义中要求声明
	 *         （1）每个表的主外键
	 *         （2）客户的姓名不能为空值
	 *         （3）电邮不能够重复
	 *         （4）客户的性别【男】【女】
	 *         （5）单价unitprice在1.0~9999.99之间check
	 *         
	 * 实现：
	 *     CREATE DATABASE shop_db;
	 *     CREATE TABLE goods(goods_id INT PRIMARY KEY,
                   goods_name VARCHAR(32) NOT NULL DEFAULT '暂无商品名',
                   unitprice DECIMAL(10,2) NOT NULL DEFAULT O CHECK (unitprice > 1.0 AND unitprice < 9999.99),
                   category VARCHAR(10),
                   provider VARCHAR(32)
                   );
           CREATE TABLE customer(customer_id INT PRIMARY KEY,
                      `name` VARCHAR(32) NOT NULL DEFAULT '匿名客户',
                      address VARCHAR(32),
                      email VARCHAR(32) UNIQUE NOT NULL DEFAULT '该客户未注册邮箱',
                      sex VARCHAR(6) CHECK(sex IN('man','woman')),
                      card_id INT UNIQUE NOT NULL);
           CREATE TABLE purchase(order_id INT PRIMARY KEY,
                      customer_id INT,
                      goods_id INT,
                      nums INT,
                      FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
                      FOREIGN KEY (goods_id) REFERENCES goods(goods_id))
	 */
}
