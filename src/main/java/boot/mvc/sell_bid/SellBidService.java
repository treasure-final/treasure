package boot.mvc.sell_bid;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellBidService implements SellBidServiceInter {

	@Autowired
	SellBidMapperInter mapper;

	@Override
	public void insertSellBid(SellBidDto SellBidDto) {
		// TODO Auto-generated method stub
		mapper.insertSellBid(SellBidDto);
		
	}

	@Override
	public String getNowinsertSellBidNum() {
		return mapper.getNowinsertSellBidNum();
	}

	@Override
	public List<SellBidDto> getSellPriceListByitemNum(String item_num) {
		return mapper.getSellPriceListByitemNum(item_num);
  }
  
	@Override
	public SellBidDto getSellBidData(String user_num, String sell_num) {
	    return mapper.getSellBidData(user_num, sell_num);
	}

	@Override
	public int getSellBidCount(String user_num) {
		// TODO Auto-generated method stub
		return mapper.getSellBidCount(user_num);
	}

	@Override
	public int getSellBidSuccessCount(String user_num) {
		// TODO Auto-generated method stub
		return mapper.getSellBidSuccessCount(user_num);
	}

	@Override
	public SellBidDto getSellBidDataOfSellNum(String sell_num) {
		// TODO Auto-generated method stub
		return mapper.getSellBidDataOfSellNum(sell_num);
	}
}
