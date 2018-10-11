package com.zzj.uufun.mapper;

import com.zzj.uufun.entity.Admin;

public interface  AdminMapper {
	
	/**
	 * 判断用户名是否存在
	 * 
	 * @param username
	 *            用户名(忽略大小写)
	 * @return 用户名是否存在
	 */
	boolean usernameExists(String username);

	/**
	 * 根据用户名查找管理员
	 * 
	 * @param username
	 *            用户名(忽略大小写)
	 * @return 管理员，若不存在则返回null
	 */
	Admin findByUsername(String username);
	
	/**
	 * 新增管理员
	 * @Title: insert   
	 * @param:  user      
	 * @return: void      
	 * @throws
	 */
	public void insertAdmin(Admin user);

}
