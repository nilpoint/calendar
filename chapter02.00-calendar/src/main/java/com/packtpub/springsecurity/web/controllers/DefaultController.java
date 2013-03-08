package com.packtpub.springsecurity.web.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {
  @RequestMapping("/default")
  public String defaultAfterLogin(HttpServletRequest request){
    if (request.isUserInRole("ROLE_ADMIN")) {
      return "redirect:/events/";
    }
    return "redirect:/";
  }
}
