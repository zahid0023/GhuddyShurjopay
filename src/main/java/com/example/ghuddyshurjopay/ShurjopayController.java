package com.example.ghuddyshurjopay;

import com.shurjomukhi.ShurjopayException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/shurjopay")
public class ShurjopayController {
    ShurjopayService shurjopayService;
    public ShurjopayController(ShurjopayService shurjopayService){
        this.shurjopayService = shurjopayService;
    }
    @RequestMapping(path = "/get",method = RequestMethod.GET)
    public String getShurjopay() throws ShurjopayException, InterruptedException {
        shurjopayService.testMakePayment();
        return "shurjopay!";
    }
}
