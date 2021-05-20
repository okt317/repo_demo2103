package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/dept/*")
public class DeptController {
	@RequestMapping("getDeptList")
	public String getDeptList() {
		return "forward:a.jsp";
	}
	@RequestMapping("getDeptList2")
	public String getDeptList2() {
		return "a"; //WEB-INF/views/dept/a.jap
	}
	@RequestMapping("deptInsert")
	public String deptInsert() {
		return "redirect:b.jsp";
	}
}
