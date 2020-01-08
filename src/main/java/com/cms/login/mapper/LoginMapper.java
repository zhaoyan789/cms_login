/**
 * 
 */
package com.cms.login.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.cms.pojo.User;

/**
 * @author zhaoyan
 *
 * 2020年1月7日
 */
public interface LoginMapper {

	/**
	 * @param user
	 * @return
	 */
	@Insert("INSERT INTO cms_user(username,password) VALUES (#{username},#{password})")
	public int register(User user);

	/**
	 * @param username
	 * @return
	 */
	@Select("SELECT u.* FROM cms_user u WHERE u.username = #{value} limit 1")
	public User findByName(String username);

	/**
	 * @param user
	 * @return
	 */
	@Select("SELECT u.* FROM cms_user u WHERE u.username = #{username} AND u.password = #{password}  limit 1")
	public User loginUser(User user);

}
