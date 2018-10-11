package com.zzj.uufun.service;

import com.zzj.uufun.entity.Admin;

public interface AdminService {
	
	public void insertAdmin(Admin user);

	/**
	 * 根据用户名查找管理员
	 * 
	 * @param username
	 *            用户名(忽略大小写)
	 * @return 管理员，若不存在则返回null
	 */
	Admin findByUsername(String username);
}
