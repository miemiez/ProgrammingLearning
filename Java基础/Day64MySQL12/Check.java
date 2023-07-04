package Day64MySQL12;

public class Check {
	/*
	 * 用于强制行数据必须满足的条件，假定在sal列上定义了check，并要求sal列值在1000~2000之间，如果不在这个区间则会提示出错
	 * 
	 * 提示：
	 *     oracle和sql server均支持check，但是mysql5.7目前还不支持check，只做语法校验，不会生效,但是mysql8.0之后的版本支持check
	 *     
	 * 案例：
	 *     CREATE TABLE tab03(id INT PRIMARY KEY,
	 *                        `name` VARCHAR(32),
	 *                        sex VARCHAR(6) CHECK(sex IN('man','woman')),
	 *                        sal DOUBLE CHECK (sal > 1000 AND sal < 2000)
	 *                        );
	 */
}
