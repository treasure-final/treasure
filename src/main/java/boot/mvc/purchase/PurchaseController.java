package boot.mvc.purchase;

import boot.mvc.buy_bid.BuyBidDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PurchaseController {

    @Autowired
    PurchaseService service;

    //구매 사이즈 선택
    @GetMapping("/buy/select")
    public String selectSize() {
        return "/purchase/purchaseSize";
    }

    //구매 동의
    @GetMapping("/buy/check")
    public ModelAndView buyAgree(String size, String deliveryWay) {
        ModelAndView mv = new ModelAndView();

        mv.addObject("size", size);
        mv.addObject("deliveryWay", deliveryWay);

        mv.setViewName("/purchase/purchaseAgree");
        return mv;
    }

    //구매입찰/즉시구매 선택
    @GetMapping("/buy/type")
    public ModelAndView selectType(String size, String deliveryWay) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("size", size);
        mv.addObject("deliveryWay", deliveryWay);

        mv.setViewName("/purchase/purchaseType");
        return mv;
    }

    //구매/결제
    @GetMapping("/buy/order")
    public ModelAndView buyOrder(String price, String size, String deadline, String deliveryWay) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("price", price);
        mv.addObject("deadline", deadline);
        mv.addObject("size", size);
        mv.addObject("deliveryWay", deliveryWay);
        mv.setViewName("/purchase/purchaseOrder");

        /*Map<String, String> map = new HashMap<>();

        map.put("price", price);
        map.put("deadline", deadline);
        map.put("size",size);
        map.put("deliveryWay", deliveryWay);
        model.addAttribute("map", map);*/

        return mv;
    }
}
