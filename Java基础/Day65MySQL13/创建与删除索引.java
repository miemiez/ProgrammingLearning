package Day65MySQL13;

public class 创建与删除索引 {
	/*
	 * 索引的类型：
	 *     1.主键索引，主键自动的为主索引（类型Primary）
	 *     2.唯一索引（UNIQUE）
	 *     3.普通索引（INDEX）
	 *     4.全文索引（FULLTEXT）：检索一篇文章中有没有某个字段【适用于MyISAM】
	 *       开发中考虑使用：全文索引Solr和ElasticSearch（ES）
	 *       
	 * 查询表是否有索引：
	 *     方式1：
	 *         SHOW INDEXES FROM table04
	 *     方式2：
	 *         SHOW INDEXE FROM table04
	 *     方式3：
	 *         SHOW KEYS FROM table04
	 *     方式4：
	 *         DESC table04
	 * 
	 * 添加索引：
	 *     添加主键索引（还可以在创建表的时候，指定PRIMARY KEY完成主键索引的添加）：
	 *         ALTER TABLE table04 ADD PRIMARY KEY (id)
	 *     添加唯一索引（还可以在创建表的时候，指定UNIQUE完成唯一索引的添加）：
	 *         CREATE UNIQUE INDEX id_index ON table04(id);
	 *     添加普通索引方式1：
	 *         CREATE INDEX id_index ON table04(id);
	 *     添加普通索引方式2：
	 *         ALTER TABLE table04 ADD INDEX id_index (id)
	 *     如果选择：
	 *         如果某列的值，是不会重复的，则优先考虑使用unique索引，否则使用普通索引
	 * 
	 * 删除索引：
	 *     删除普通索引：
	 *         DROP INDEX id_index ON table04
	 *     删除主键索引：
	 *         ALTER TABLE table04 DROP PRIMARY KEY
	 * 
	 * 修改索引：
	 *     先删除索引，再添加新的索引
	 *     
	 *     
	 * 小结：哪些列上适合使用索引，哪些列上不适合使用索引
	 *     （1）较频繁的作为查询条件的字段应该创建索引
	 *     （2）唯一性太差的字段，不适合单独创建索引，即使频繁作为查询条件【例如：性别字段，不是男，就是女】
	 *     （3）更新非常频繁的字段不适合创建索引【经常更新维护索引，会对更新速度造成影响】
	 *     （4）不会出现在WHERE子句中的字段不该创建索引
	 */
}
