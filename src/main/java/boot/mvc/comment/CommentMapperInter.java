package boot.mvc.comment;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommentMapperInter {
	
	public void insertComment(CommentDto CDto);
	
	public void updateComment(CommentDto CDto);
	
	public String getUserEmailByUserNum(String user_num);
	
	public void deleteComment(String comment_id);
}
