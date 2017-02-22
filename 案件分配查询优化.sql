
------关联日志表时可用

 select a.appl_id
      from plms_work_order_pool_log a
      where 
     a.defend_status in ('1','2','4')  and a.appl_id = pool.appl_id and
      exists(select 1
                             from (select appl_id,
                                                      max(id) id
                                           from plms_work_order_pool_log b
                                            
                                           group by appl_id) b
                           where  b.appl_id = a.appl_id
                                and b.id = a.id)
								
代替

select 1
	      from plms_work_order_pool_log log 
	      where log.defend_status in ('1','2','4') 
		  and log.appl_id = pool.appl_id 
	      and log.id = (select max(id) from plms_work_order_pool_log tempLog where tempLog.Appl_Id = log.appl_id)								
								
								
								
								
								
结论：
EXISTS(包括 NOT EXISTS )子句的返回值是一个BOOL值。 EXISTS内部有一个子查询语句(SELECT ... FROM...)， 我将其称为EXIST的内查询语句。其内查询语句返回一个结果集。 EXISTS子句根据其内查询语句的结果集空或者非空，返回一个布尔值。

一种通俗的可以理解为：将外查询表的每一行，代入内查询作为检验，如果内查询返回的结果取非空值，则EXISTS子句返回TRUE，这一行行可作为外查询的结果行，否则不能作为结果。

分析器会先看语句的第一个词，当它发现第一个词是SELECT关键字的时候，它会跳到FROM关键字，然后通过FROM关键字找到表名并把表装入内存。接着是找WHERE关键字，如果找不到则返回到SELECT找字段解析，如果找到WHERE，则分析其中的条件，完成后再回到SELECT分析字段。最后形成一张我们要的虚表。
WHERE关键字后面的是条件表达式。条件表达式计算完成后，会有一个返回值，即非0或0，非0即为真(true)，0即为假(false)。同理WHERE后面的条件也有一个返回值，真或假，来确定接下来执不执行SELECT。
分析器先找到关键字SELECT，然后跳到FROM关键字将STUDENT表导入内存，并通过指针找到第一条记录，接着找到WHERE关键字计算它的条件表达式，如果为真那么把这条记录装到一个虚表当中，指针再指向下一条记录。如果为假那么指针直接指向下一条记录，而不进行其它操作。一直检索完整个表，并把检索出来的虚拟表返回给用户。EXISTS是条件表达式的一部分，它也有一个返回值(true或false)。

在插入记录前，需要检查这条记录是否已经存在，只有当记录不存在时才执行插入操作，可以通过使用 EXISTS 条件句防止插入重复记录。
INSERT INTO TableIn (ANAME,ASEX)
SELECT top 1 '张三', '男' FROM TableIn
WHERE not exists (select * from TableIn where TableIn.AID = 7)

EXISTS与IN的使用效率的问题，通常情况下采用exists要比in效率高，因为IN不走索引，但要看实际情况具体使用：
IN适合于外表大而内表小的情况；EXISTS适合于外表小而内表大的情况。