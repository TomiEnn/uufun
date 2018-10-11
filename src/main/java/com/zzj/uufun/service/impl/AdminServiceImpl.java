package com.zzj.uufun.service.impl;

import javax.annotation.Resource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.zzj.uufun.entity.Admin;
import com.zzj.uufun.mapper.AdminMapper;
import com.zzj.uufun.service.AdminService;

@ComponentScan({"com.zzj.uufun.mapper"})
@Service("adminService")
public class AdminServiceImpl implements AdminService{

	 @Resource
	 private AdminMapper userMapper;
	
	@Override
	public void insertAdmin(Admin user) {
		userMapper.insertAdmin(user);
	}

	@Override
	public Admin findByUsername(String username) {
		
		return userMapper.findByUsername(username);
	}

	
}
