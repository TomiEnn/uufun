package com.zzj.uufun.controller.blog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @ClassName:  LoginController   
 * @Description:TODO( 前台登录页面 )   
 * @author: Tomi_Jay
 * @date:   2018年10月10日 下午9:22:13   
 *
 */
@Controller
public class LoginController {
	
	@RequestMapping("/login")
    public String hello(Model m) {
		m.addAttribute("name", "Tomi_Jay");
        return "login";
    }

}
