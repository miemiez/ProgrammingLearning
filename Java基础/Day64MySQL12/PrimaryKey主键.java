package Day64MySQL12;

public class PrimaryKey主键 {
	/*
	 * 约束：
	 *     约束用于确保数据库的数据满足特定的商业规则
	 * 
	 * 在MySQL中，约束包括：not null,unique,primary key,foreign key,check 五种
	 * 
	 * 
	 * primary key(主键)的基本使用：
	 *     用于唯一的标示表行的数据，当定义主键约束后，该列不能重复
	 *     CREATE TABLE temp
	 *            (id INT PRIMARY KEY, --表示id列是主键
	 *            `name` VARCHAR(32),
	 *            email VARCHAR(32));
	 *     主键列的值是不可以重复的，添加数据的时候，一但重复就会报错
	 *     
	 * primary key的细节：
	 *     （1）primary key不能重复且不能为NULL
	 *         【错误】SELECT INTO temp VALUES(NULL,'xyy','xiyangyang@gmail.com')
	 *     （2）一张表最多只能有一个主键，但是可以是复合主键（例如：id+name）！！！复合组件要注意：一定要复合的几个组件同时都相同才会报错！！！
	 *         【错误】CREATE TABLE tab01(id INT PRIMARY KEY,
	 *                                   `name` VARCHAR(32) PRIMARY KEY,
	 *                                   email VARCHAR(32))
	 *         【正确：复合主键】CREATE TABLE tab02(id INT,
	 *                                             `name` VARCHAR(32),
	 *                                             email VARCHAR(32),
	 *                                             PRIMARY KEY(id,`name`)) --这里就是复合主键
	 *     （3）主键的指定方式有两种
	 *          直接在字段名后指定：字段名 primary key
	 *          在表定义最后写primary key(列名)
	 *     （4）使用DESC 表名，可以看到primary key的情况
	 */
}
