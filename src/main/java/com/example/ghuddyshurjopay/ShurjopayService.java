package com.example.ghuddyshurjopay;

import com.shurjomukhi.Shurjopay;
import com.shurjomukhi.ShurjopayException;
import com.shurjomukhi.model.PaymentReq;
import com.shurjomukhi.model.PaymentRes;
import org.springframework.stereotype.Service;

@Service
public class ShurjopayService {
    Shurjopay shurjopay;
    PaymentRes paymentRes;

    public ShurjopayService(Shurjopay shurjopay){
        this.shurjopay = shurjopay;
    }
    public void testMakePayment() throws InterruptedException, ShurjopayException {
        PaymentReq req = getPaymentReq();
        System.out.println(req);
        paymentRes = shurjopay.makePayment(req);

        System.out.println(paymentRes);
    }
    private PaymentReq getPaymentReq() {
        PaymentReq request = new PaymentReq();

        request.setPrefix("dummy");
        request.setAmount(10.00);
        request.setCustomerOrderId("sp315689");
        request.setCurrency("BDT");
        request.setCustomerName("Dummy");
        request.setCustomerAddress("Dhaka");
        request.setCustomerPhone("01766666666");
        request.setCustomerCity("Dhaka");
        request.setCustomerPostCode("1212");
        request.setCustomerEmail("al@gmail.com");
        request.setAuthToken("viajkfakjk");
        request.setReturnUrl("vaajgklajk");
        request.setCancelUrl("vjakfjafkla");
        request.setStoreId(1);
        return request;
    }


}
