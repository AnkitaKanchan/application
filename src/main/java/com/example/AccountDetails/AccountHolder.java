package com.example.AccountDetails;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AccountHolder {
		



	@GetMapping(path="/all")
	@ResponseBody
	public String getAccountDetails() {
	return "Account is Created";
	}
}

