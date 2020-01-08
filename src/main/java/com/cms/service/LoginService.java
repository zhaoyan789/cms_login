/**
 * 
 */
package com.cms.service;

import javax.validation.Valid;

import com.cms.pojo.User;

/**
 * @author zhaoyan
 *
 * 2020年1月7日
 */
public interface LoginService {

	/**
	 * @param user
	 * @return
	 */
	public int register( User user);

	/**
	 * @param username
	 * @return
	 */
	public User findByName(String username);

	/**
	 * @param user
	 * @return
	 */
	public User loginUser( User user);

}
