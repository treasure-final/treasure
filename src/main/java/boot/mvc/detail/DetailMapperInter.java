package boot.mvc.detail;

import org.apache.ibatis.annotations.Mapper;

import boot.mvc.item.ItemDto;

@Mapper
public interface DetailMapperInter {
	
	public ItemDto DetailgetData(String item_num);
}