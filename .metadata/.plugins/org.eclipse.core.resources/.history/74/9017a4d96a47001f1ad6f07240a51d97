package com.springbootweb.web;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home() {
        System.out.println("Home method called");
        return "index";
    }

//    @RequestMapping("/add")
//    public String add(HttpServletRequest req, HttpSession session) {
//        System.out.println("Add method called");
//
//        int num1 = Integer.parseInt(req.getParameter("num1"));
//        int num2 = Integer.parseInt(req.getParameter("num2"));
//        int res = num1 + num2;
//        System.out.println(res);
//
//        session.setAttribute("res", res);
//
//        return "result.jsp";
//    }

//    @RequestMapping("/add")
//    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, Model model) {
//        System.out.println("Add method called");
//
//        int res = num1 + num2;
//        System.out.println(res);
//
//        model.addAttribute("res", res);
//
//        return "result";
//    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelAndView mv) {
        System.out.println("Add method called");

        int res = num1 + num2;
        System.out.println(res);

        mv.addObject("res", res);
        mv.setViewName("result");

        return mv;
    }

//    @RequestMapping("/addAlien")
//    public ModelAndView addAlien(@RequestParam("aid") int aid, @RequestParam("aname") String aname, ModelAndView mv) {
//        System.out.println("Add Alien method called");
//
//        Alien alien = new Alien();
//        alien.setAid(aid);
//        alien.setAname(aname);
//
//        mv.addObject("res", alien);
//        mv.setViewName("result");
//
//        return mv;
//    }

    @RequestMapping("/addAlien")
    public String addAlien(@ModelAttribute("res") Alien alien) {
        System.out.println("Add Alien method called");
        return "result";
    }

    @ModelAttribute("course")
    public String coursename() {
        return "Java";
    }
}
