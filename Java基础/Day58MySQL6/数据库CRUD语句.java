package Day58MySQL6;

public class 数据库CRUD语句 {
	/*
	 * 数据库C[create]R[read]U[update]D[delete]语句
	 *     （一）insert语句（添加数据）
	 *         创建一张商品表
	 *             CREATE TABLE goods_tb(id int,goods_name varchar(10),price double)
	 *         添加数据
	 *             INSERT INTO goods_tb (id,goods_name,price)
	 *                         VALUES(01,'喜羊羊',120)
	 *             INSERT INTO goods_tb (id,price,goods_name)
	 *                         VALUES(02,150,'沸羊羊') 
	 *         查询表
	 *             SELECT * FROM goods_tb
	 *             
	 *         insert语句的细节
	 *             1.插入的数据应与字段的数据类型相同（如果吧'abc'添加到int类型会错误）
	 *             2.数据的长度应在列的规定范围内，例如：不能将一个长度为80的字符串加入到长度为40的列中。
	 *             3.在values中列出的数据位置必须与被加入的列的排列位置相对应
	 *             4.字符和日期型数据应包含在单引号中。
	 *             5.列可以插入空值[前提是该字段允许为空]，insert into table value(null)
	 *             6.insert into tb_name(列名...) values (),(),() 形式添加多条记录
	 *             7.如果是给表中的所有字段添加数据，可以不写前面的字段名称
	 *             8.默认值的使用，当不给某个字段值时，如果有默认值就会添加默认值，否则报错
	 *                   如果某个列没有指定NOT NULL，那么当添加数据时，没有给定值，则会默认给null
	 *                   如果我们希望指定某个列的默认值，可以在创建表时指定
	 *                   
	 *                   
	 *     （二）update语句（更新数据）
	 *         1.将所有员工薪水修改为5000元（如果没有带where条件，会修改所有的记录，因此要谨慎使用）
	 *             UPDATE employee SET salary = 5000
	 *         2.将姓名为“小妖怪”的员工薪水修改为3000元
	 *             UPDATE employee
	 *                    SET salary = 3000
	 *                    WHERE user_name = '小妖怪'
	 *         3.将“老妖怪”的薪水在原有的基础上增加1000元
	 *             UPDATE employee
	 *                    SET salary = salary + 1000
	 *                    WHERE user_name = '老妖怪'
	 *             SELECT * FROM employee
	 *             
	 *         update语句的细节
	 *             1.UPDATE语法可以用新值更新原有表行中的各列
	 *             2.SET子句指示要修改哪些列和要给予哪些值
	 *             3.WHERE子句指定应更新哪些行，如没有WHERE子句，则更新所有的行（记录），因此一定要注意
	 *             4.如果需要修改多个字段，可以通过set字段1 = 值1，字段2 = 值2...
	 *             
	 *      
	 *     （三）delete语句（删除数据）
	 *         1.删除表中名称为“老妖怪”的记录
	 *             DELETE FROM employee
	 *                         WHERE user_name = '老妖怪' 
	 *         2.删除表中所有记录，这个也一定要谨慎使用
	 *             DELETE FROM employee
	 *         3.delete语句不能删除某一列的值（可以使用update设为null或者''）
	 *         
	 *         delete语句的细节：
	 *             1.如果不使用where子句，将删除表中所有数据
	 *             2.Delete语句不能删除某一列的值（可使用update设为null或者''）
	 *             3.使用delete语句仅删除记录，不删除表本身。如要删除表，使用drop table语句（DROP TABLE tb_name）
	 *             
	 *     
	 *     （四）select语句（查询数据）【对照TableStudent】
	 *         1.查询表中所有学生的信息
	 *             SELECT * FROM student
	 *         2.查询表中所有学生的姓名和对应的英语成绩
	 *             SELECT `name`,english FROM student
	 *         3.过滤表中重复数据【DISTINCT】
	 *             SELECT DISTINCT english FROM student
	 *         4.要查询的记录，每个字段都相同，才会去重
	 *             SELECT DISTINCT `name`,english FROM student
	 *             
	 *         5.统计每个学生的总分
	 *             SELECT `name`,(chinese+english+math) FROM student
	 *         6.在所有学生总分加10分
	 *             SELECT `name`,(chinese+english+math+10) FROM student
	 *         7.使用别名表示学生分数
	 *             SELECT `name`,(chinese+english,math+10) AS sum_score FROM student
	 *             
	 *         8.查询姓名为“喜羊羊”的学生成绩
	 *             SELECT * FROM student WHERE `name` = '喜羊羊'
	 *         9.查询英语成绩大于90分的同学
	 *             SELECT `name` FROM student WHERE english > 90
	 *         10.查询总分大于200分的所有同学
	 *             SELECT `name` FROM student WHERE (chinese+english+math) > 200
	 *         11.查询math大于60，并且id大于2的学生成绩
	 *             SELECT `name`,math,id FROM student WHERE math > 60 AND id > 2
	 *         12.查询英语成绩大于语文成绩或id小于4的学生成绩
	 *             SELECT `name`,english,id FROM student WHERE english > chinese OR id < 4
	 *         13.查询总分大于200并且数学成绩小于语文成绩的名字中有“羊羊”的学生
	 *             SELECT `name` FROM student WHERE math < chinese AND (chinese+english+math) > 200 AND `name` LIKE '%羊羊%'
	 *         14.查询英语成绩在80-90之间的同学
	 *             (1)SELECT `name` FROM student WHERE english BETWEEN 80 AND 90（between...and...是一个闭区间）
	 *             (2)SELECT `name` FROM student WHERE english >= 80 AND english <=90
	 *         15.查询数学为90，56的同学
	 *             (1)SELECT `name` FORM student WHERE math = 90 OR math = 56
	 *             (2)SELECT `name` FROM student WHERE math IN (90,56)
	 *             
	 *             
	 *         16.order by子句排序查询结果
	 *             (1)Order By 指定排序的列，排序的列既可以是表中的列名，也可以是select语句后指定的列名
	 *             (2)Asc 升序【默认】，Desc降序
	 *             (3)Order By子句应位于SELECT语句的结尾
	 *         17.对数学成绩排序后输出【升序】
	 *             SELECT * FROM student ORDER BY math
	 *         18.对总分按从高到底的顺序输出（降序）
	 *             (1)SELECT `name`,(chinese+english+math) AS sum_score FROM student ORDER BY sum_score DESC
	 *             (2)SELECT * FROM student ORDER BY (chinese+english+math) DESC
	 *         19.对名字中有"羊羊"的同学的成绩排序输出（升序）
	 *             SELECT * FROM student WHERE `name` LIKE '%羊羊%' ORDER BY (chinese+english+math)
	 */
}
