//package com.mkpits.cablecms.controller;
//
//import com.mkpits.cablecms.model.Receipt;
//import com.mkpits.cablecms.service.ReceiptService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//public class CustomerReceiptController {
//    @Autowired
//    ReceiptService receiptService;
//
//    @RequestMapping(value="/receiptService", method = RequestMethod.GET)
//    public String customerReceiptController(@RequestParam("receiptid") Integer receiptid,
//                                          @RequestParam("userid") String userid,
//                                          @RequestParam("amount") String amount,
//                                          @RequestParam("date") String date) {
//        Receipt receipt= Receipt.builder()
//                .receiptId(receiptid)
//                .userId(userid)
//                .amount(amount)
//                .date(date)
//
//                .build();
//        receiptService.createReceipt(receipt);
//        return "addcustomer";
//    }
//}
