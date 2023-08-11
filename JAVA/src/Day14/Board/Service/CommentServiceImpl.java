package Day14.Board.Service;

import java.util.List;

import Day14.Board.DAO.CommentDAO;
import Day14.Board.DTO.Comment;

public class CommentServiceImpl implements CommentService {

	
	private CommentDAO commentDAO = new CommentDAO();
	
	@Override
	public List<Comment> list() {
		List<Comment> commentList = (List<Comment>) commentDAO.selectList();
		return commentList;
	}
	
	@Override
	public List<Comment> list(int boardNo) {
		// 글 번호가 존재하는 지를 확인하는 로직 구현 가능
		List<Comment> commentList = (List<Comment>) commentDAO.selectList(boardNo);
		return commentList;
	}

	@Override
	public Comment select(int commentNo) {
		Comment comment = (Comment) commentDAO.select(commentNo);
		return comment;
	}

	@Override
	public int insert(Comment comment) {
		int result = commentDAO.insert(comment);
		return 0;
	}

	@Override
	public int update(Comment comment) {
		int result = commentDAO.update(comment);
		return 0;
	}

	@Override
	public int delete(int commentNo) {
		int result = commentDAO.delete(commentNo);
		return 0;
	}

}
