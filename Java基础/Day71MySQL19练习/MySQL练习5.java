package Day71MySQL19练习;

public class MySQL练习5 {
	/*
	 * 设学校环境如下：
	 *     一个系有若干个专业，每个专业一年只招一个班，每个班有若干个学生。
	 *     现要建立关于系，学生，班级的数据库，关系模式为：
	 *         班CLASS（班号classid，专业名subject，系名deptname，入学年份enrolltime，人数num）
	 *         学生STUDENT（学号studentid，姓名name，年龄age，班号classid）
	 *         系DEPARTMENT（系号departmentid，系名deptname）
	 *     试用SQL语句完成以下功能
	 *     （1）建表，在定义中要求声明
	 *         1.每个表的主外键，
	 *         2.deptname是唯一约束
	 *         3.学生姓名不能为空
	 *     （2）插入数据
	 *     （3）完成以下查询功能
	 *         1，找出所有姓李的学生
	 *         2.列出所有开设超过1个专业的系的名字
	 *         3.列出人数大于等于30的系的编号和名字
	 *     （4）学校又新增加了一个物理系，编号为
	 *     （5）学生张三退学，更新相关表
	 * 
	 *（1）（2）
	 * CREATE table department (departmentid INT PRIMARY KEY,
                    departname VARCHAR(12) UNIQUE NOT NULL);
	 * CREATE table class (classid INT PRIMARY KEY,
                    `subject` VARCHAR(12) NOT NULL DEFAULT '其它专业',
					departname VARCHAR(12),
                    enrolltime DATE,
                    num INT,
                    FOREIGN KEY (departname) REFERENCES department(departname));
      CREATE table student (studentid INT PRIMARY KEY,
                    `name` VARCHAR(12) NOT NULL DEFAULT '无名氏',
                    age INT,
                    classid INT NOT NULL,
                    FOREIGN KEY (classid) REFERENCES class(classid));
                    
      INSERT INTO department values(001,'数学'),
							 (002,'计算机'),
                             (003,'化学'),
                             (004,'中文'),
							 (005,'经济');
	  INSERT INTO class values(101,'软件','计算机','1995',20),
                         (102,'微电子','计算机','1996',30),
                         (111,'无机化学','化学','1995',29),
                         (112,'高分子化学','化学','1996',25),
                         (121,'统计数学','数学','1995',20),
                         (131,'现代语言','中文','1996',20),
                         (141,'国际贸易','经济','1997',30),
                         (142,'国际金融','经济','1996',14);
      INSERT INTO student values(8101,'张三',18,101),
                          (8102,'钱四',16,121),
                          (8103,'王玲',17,131),
                          (8105,'李飞',19,102),
                          (8109,'赵四',18,141),
                          (8110,'李可',20,142),
                          (8201,'张飞',18,111),
                          (8302,'周瑜',16,112),
                          (8203,'王亮',17,111),
                          (8305,'董庆',19,102),
						  (8409,'赵龙',18,101),
                          (8510,'李丽',20,142);
      
     （3）
         1.SELECT * FROM student WHERE `name` LIKE '%李%'    ||    SELECT * FROM student WHERE INSTR(`name`,'李') != 0;
         2.SELECT COUNT(*) AS nums,departname FROM class GROUP BY departname HAVING nums > 1;
         3.【先查出各个系有多少人，再建立临时表，最后进行多表查询】
           SELECT s,departmentid,temp.departname FROM (SELECT SUM(num) s,departname FROM class GROUP BY departname) temp,department WHERE temp.departname = department.departname AND s >= 30; 
     （4）
         INSERT INTO department VALUES(006,'物理系');
     （5）
         分析：1.张三所在班级的人数-1
              2.将张三从学生表删除
              3.需要使用事务控制（因为要保证数据的一致性，不能班级的人数减少了，但是张三没有退学）
         start transaction;
         UPDATE class set num=num-1 WHERE classid = (SELECT classid FROM student WHERE `name` = '张三');
         savepoint a;
         DELETE FROM student WHERE `name` = '张三';
         commit;
	 */
}
