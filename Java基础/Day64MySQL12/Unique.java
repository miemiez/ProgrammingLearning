package Day64MySQL12;

public class Unique {
	/*
	 * unique（唯一）：
	 *     当定义了唯一约束后，该列值是不能重复的
	 *     
	 * CREATE TABLE tab01(id INT UNIQUE,  --表示id列是不可以重复的
	 *                    `name` VARCHAR(32),
	 *                    email VARCHAR(32));
	 *                    
	 * unique的使用细节：
	 *     （1）如果没有指定not null，则unique字段可以有多个null
	 *         INSERT INTO tab01 VALUES(NULL,'xyy','xyy@123.com'),(NULL,'nyy','nyy@123.com')
	 *     （2）如果一个列（字段），是unique not null 使用效果类似primary key
	 *     （3）一张表可以有多个unique字段
	 */
}
