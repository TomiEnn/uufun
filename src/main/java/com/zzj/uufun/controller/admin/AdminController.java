package com.zzj.uufun.controller.admin;

import javax.annotation.Resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.zzj.uufun.entity.Admin;
import com.zzj.uufun.service.AdminService;

@RestController
@ComponentScan({"com.zzj.uufun.service"})
@MapperScan("com.zzj.uufun.mapper")
@RequestMapping("/admin")
public class AdminController {
	private Logger logger = LogManager.getLogger(this.getClass());

	@Resource
    private AdminService adminService;
	
	 @RequestMapping("/add")
	    public String addUser(@RequestBody Admin user){
	        if(user!=null){
	        	adminService.insertAdmin(user);
	            return "success";
	        }else{
	            return "error";
	        }
	    }

	 @RequestMapping("/find")
    public String find(){
		 Admin user =  adminService.findByUsername("dd");
        ModelAndView mav = new ModelAndView();
        mav.addObject("user","sadf");
        
        logger.trace("日志输出 trace");
        logger.debug("日志输出 debug");
        logger.info("日志输出 info");
        logger.warn("日志输出 warn");
        logger.error("日志输出 error");
        return "HelloWord"+"fasdf--"+user.getUsername()+"--"+user.getPassword();
    }


}
