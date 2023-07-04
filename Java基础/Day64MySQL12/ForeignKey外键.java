package Day64MySQL12;

public class ForeignKey外键 {
	/*
	 * 用于定义主表和从表之间的关系：
	 *     外键约束要定义在从表上，主表则必须具有主键约束或是unique约束，当定义外键约束后，要求外键列数据必须在主表的主键列存在或是为NULL
	 *     FOREIGN KEY (从表的字段名) REFERENCES 主表表名(从表的字段关联的主表的字段名)
	 *     
	 * 案例：
	 *    //班级表
	 *    CREATE TABLE class_tab(id INT PRIMARY KEY,
	 *                       cname VARCHAR(32) NOT NULL DEFAULT '');
	 *    
	 *    //学生表
	 *    CREATE TABLE stu_table(id INT PRIMARY KEY.
	 *                           sname VARCHAR(32) NOT NULL DEFAULT '',
	 *                           class_id INT,
	 *                           FOREIGN KEY (class_id) REFERENCES class_tab(id)); --将学生表的class_id作为外键，与班级表的主键id进行关联
	 *    
	 *    INSERT INTO class_tab VALUES(1,'班级1'),(2,'班级2');
	 *    
	 *    INSERT INTO stu_table VALUES(001,'学生1',1),(002,'学生2',2);
	 *    
	 *    INSERT INTO stu_table VALUES(003,'学生3',3);  【失败：因为主表的id中没有 3 这个班级号，所以这条记录会失败】
	 *    
	 *    INSERT INTO stu_table VALUES(004,'学生4',null);  【成功：因为外键class_id允许为NULL，所以这条记录能创建】
	 *    
	 * 
	 * foreign key（外键）使用细节：
	 *     （1）外键指向的表的字段，要求是primary key或者是unique
	 *     （2）表的存储引擎的类型是innodb，这样的表才支持外键
	 *     （3）外键字段的类型要和主键字段的类型一致（长度可以不同）
	 *     （4）外键字段的值，必须在主键字段中出现过，或者为null【前提是外键字段允许为null】
	 *     （5）一旦建立主外键的关系，数据不能随意删除
	 *         【如果要删除，首先先要确认在从表中的外键字段中，有没有与主表相绑定的数据，
	 *           如果从表中有与主表绑定的数据，则需要先删除从表中的相应数据，才能继续删除主表中的相应数据】
	 * 
	 * 添加外键：
	 *     alter  table  需要添加外键的表名  add  constraint  外键名 foreign  key(本表字段列表)  references  主表名(字段列表);
	 *           
	 * 练习：
	 *     使用三表联合查询，得到结果，并将得到的结果，构建成视图
	 *         CREATE VIEW emp_view01
	 *         AS
	 *         SELECT empno,ename,dname,grade FROM emp,dept,salgrade WHERE emp.deptno = dept.deptno AND (sal BETWEEN losal AND hisal)
	 */
}
