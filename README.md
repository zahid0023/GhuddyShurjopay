# GhuddyShurjopay
Our system is configured with Spring Boot version 2.5.4. As per the provided documentation, Shurjopay offers three RESTful APIs for external systems to integrate with their platform:
Generate Authentication Token
Initiate Payment Transaction
Verify Payment Transaction
Firstly, I would like to clarify the process of generating the authentication token. The documentation does not specify an endpoint or method to generate the token. Could you please provide guidance on how we can generate the authentication token? Is this something that needs to be done manually?
In our attempts to proceed with the integration, we randomly assigned an authentication token to the PaymentReq object as shown below:
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

However, we encountered an error message:

SEVERE: Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed; nested exception is com.shurjomukhi.ShurjopayException: Code: 1062 Message: Param Missing] with root cause
com.shurjomukhi.ShurjopayException: Code: 1062 Message: Param Missing


According to the error message, it seems that we are missing a required parameter (Code: 1062 Message: Param Missing). Could you please guide us on which specific parameter is missing or incorrectly provided in the PaymentReq object?
Additionally, we have tried to review your project, but we are still facing difficulties in understanding the integration process. It would be greatly appreciated if you could provide us with more detailed information or a step-by-step guide on how to integrate the Shurjopay Payment Gateway using Spring Boot.
Thank you in advance for your assistance. We look forward to your prompt response.
N.B: We have got the following dependency in out system:
<!-- https://mvnrepository.com/artifact/bd.com.shurjomukhi/sp-plugin-spring -->
<dependency>
   <groupId>bd.com.shurjomukhi</groupId>
   <artifactId>sp-plugin-spring</artifactId>
   <version>0.2.8</version>
</dependency>
