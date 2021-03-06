package com.leeue.novel.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.leeue.novel.entity.Author;
import com.leeue.novel.entity.Reader;

/**
 * 作者 增删查改 功能:
 * 
 * @author:李月
 * @Version:
 * @Date 2018年1月30日 下午12:45:36
 */
public interface AuthorDao {
	/**
	 * 注册作者
	 * 
	 * @param reader
	 * @return
	 */
	int insertAuthor(Author author);

	/**
	 * 更新作者信息
	 * 
	 * @param author
	 * @return
	 */
	int updateAuthor(Author author);

	/**
	 * 停用 将status置为0
	 * 
	 * @param reader
	 * @return
	 */
	Author queryAuthorPenName(@Param("penName") String penName);

	/*
	 * int deleteReader(Reader reader);//停用 某个读者不是删除
	 */

	Author queryAuthorById(@Param("readerId") Long readerId);// 看这个读者开通了作者没有
															// 根据readerId查找

	Author queryAuthorIdCard(@Param("idCard") String idCard);// 查看这个身份证账号是否被注册

	List<Author> queryAllAuthor(@Param("authorCondition") Author authorCondition);

	List<Author> queryAuthorByPage(@Param("start") int start,
			@Param("end") int end,
			@Param("authorCondition") Author authorCondition);

}
