package com.demo.controllers;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.Account;

@Controller
public class MyDemoController {

	public String[] quotes = {"To be or not to be-Shakespeare ",
								"Spring in nature's way-Shakespeare",
								"The time is-Shakespeare"
								};

	@RequestMapping(value="/getQuote")
	public String getRandomQuote(Model model) {

		int rand = new Random().nextInt(quotes.length);
		String randomQuote = quotes[rand];

		model.addAttribute("randomQuote", randomQuote);

		return "quote";
	}

	@RequestMapping(value="/createAccount")
	public String createAccount(@ModelAttribute ("aNewAccount") Account account) {
		System.out.println(account.getFirstName() + " " + account.getLastName());
		return "createAccount";
	}
}
