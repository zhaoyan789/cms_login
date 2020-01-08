/**
 * 
 */
package com.cms.serviceImpl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bot.utils.MsgEncrypt;
import com.cms.login.mapper.LoginMapper;
import com.cms.pojo.User;
import com.cms.service.LoginService;

/**
 * @author zhaoyan
 *
 * 2020年1月7日
 */
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginMapper loginMapper;
	
	
	@Override
	public int register( User user) {
		// TODO Auto-generated method stub
		
		String msgEncrypt = MsgEncrypt.msgEncrypt(user.getPassword(), user.getUsername());
		
		System.out.println(msgEncrypt);
		
		user.setPassword(msgEncrypt);
		
		return loginMapper.register(user);
	}


	@Override
	public User findByName(String username) {
		// TODO Auto-generated method stub
		return loginMapper.findByName(username);
	}


	@Override
	public User loginUser(User user) {
		// TODO Auto-generated method stub
		
		String msgEncrypt = MsgEncrypt.msgEncrypt(user.getPassword(), user.getUsername());
		
		user.setPassword(msgEncrypt);
		
		return loginMapper.loginUser(user);
	}

	
	
	
}
