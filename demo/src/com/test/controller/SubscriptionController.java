package com.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.util.Utility;

@Controller
public class SubscriptionController {

	private Utility utility;

	@RequestMapping(value = "/subscribe", method = RequestMethod.GET)
	public @ResponseBody Object subscribe(HttpServletRequest request) {

		String orderDetails = utility.getOrderDetails(request);
		String truncatedOrderDetails = utility.truncate(orderDetails, 250);
		// log(truncatedOrderDetails);
		return truncatedOrderDetails;
	}

	@RequestMapping(value = "/abc", method = RequestMethod.GET)
	public void subscribe1() {
		System.out.println("hhhh");
	}

}
