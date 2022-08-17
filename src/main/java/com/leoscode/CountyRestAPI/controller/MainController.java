package com.leoscode.CountyRestAPI.controller;

import com.leoscode.CountyRestAPI.domain.Country;
import com.leoscode.CountyRestAPI.service.ParsingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    private static final String MAIN_PAGE = "main";
    private static final String JASON_COUNTRY_URL = "https://restcountries.com/v3.1/all?access_key=41f24eef106ccfefdad3beebb32bc078";
@Autowired
    private ParsingService parsingService;
    @GetMapping
    public String main(final Model model){

      List<Country> countries=(List<Country>) parsingService.parse(JASON_COUNTRY_URL);
        model.addAttribute("countries", countries);
         return MAIN_PAGE;
    }

}
