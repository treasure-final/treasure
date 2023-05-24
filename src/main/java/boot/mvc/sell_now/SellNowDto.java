package boot.mvc.sell_now;

import java.sql.Timestamp;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonFormat;

import boot.mvc.buy_bid.BuyBidDto;
import boot.mvc.item.ItemDto;
import lombok.Data;

@Data
@Alias("SellNowDto")
public class SellNowDto {
	
	private String sellnow_num; 
	private String user_num;
	private String item_num;
	private String buy_num;
	private int sellnow_totalprice;
	private String sellnow_account;
	private String sellnow_penaltypay;
	private String sellnow_addr;
	private String sell_status;
	private String test_result;
	@JsonFormat(pattern = "yyyy/MM/dd", timezone = "Asia/Seoul")
	private Timestamp sellnow_inputday;
	private ItemDto itemDto;
	private String return_name;
	private String return_phone;
	private String return_addr;
	private String account_bank;
	private String account_number;
	private String penaltypay_bank;
	private String penaltypay_number;
	
	public ItemDto getItemDto() {
		return itemDto;
	}

	public void setItemDto(ItemDto itemDto) {
		this.itemDto = itemDto;
	}

}
