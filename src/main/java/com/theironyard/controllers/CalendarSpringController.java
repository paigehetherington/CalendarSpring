package com.theironyard.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDateTime;

/**
 * Created by vajrayogini on 3/14/16.
 */
@Controller
public class CalendarSpringController {
@RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(Model model) {
    model.addAttribute("now", LocalDateTime.now()); //to default to now time and date, add mustache to value in html
    return "home";
}
}
