package Day07.Ex05_BoardInterface;

import java.util.Date;
import java.util.Scanner;

/**
 * 게시판 ㅍ로그램
 *  - 메뉴판
 *  - 게시글 목록
 *  - 게시글 읽기
 *  - 게시글 쓰기
 *  - 게시글 수정
 *  - 게시글 삭제
 */
public class Main {
	
	static int max = 10;							// 게시글 최대 개수
	static Text[] boardList = new Text[max];		// 게시글 목록
	static Text[] commentList = new Text[max];		// 댓글 목록
	static Scanner sc = new Scanner(System.in);
	static DataService data = new BoardAccess();	// 데이터 베이스 접근 객체 (게시글)
	static DataService data2 = new CommentAccess();	// 데이터 베이스 접근 객체 (댓글)
	
	/**
	 * 메뉴판
	 */
	public static void menu() {
		System.out.println("########## 게시판 ##########");
		System.out.println("1. 게시글 목록");
		System.out.println("2. 게시글 읽기");
		System.out.println("3. 게시글 쓰기");
		System.out.println("4. 게시글 수정");
		System.out.println("5. 게시글 삭제");
		System.out.println("6. 댓글 쓰기");
		System.out.println("7. 댓글 수정");
		System.out.println("8. 댓글 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("########## 번호 입력 : ");
	}
	
	/**
	 * 게시글 목록
	 */
	public static void list() {
		System.out.println("##### 게시글 목록 #####");
		boardList = data.selectList();
		for (Text board : boardList) {
			if (board == null) {
				System.out.println("(게시글 없음)");
				continue;
			}
			int boardNo = board.getNo();
			String title = board.getTitle();
			String writer = board.getWriter();
			Date regDate = board.getRegDate();
			
			System.out.println("(" + boardNo + ") \t | " + title + " | " + writer + " | " + regDate );
		}
	}
	
	/**
	 * 게시글 읽기
	 */
	public static void read() {
		System.out.println("##### 게시글 읽기 #####");
		
		System.out.print("글 번호 : ");
		int boardNo = sc.nextInt();
		Text board = data.select(boardNo);
		
		String title = board.getTitle();
		String writer = board.getWriter();
		String content = board.getContent();
		Date regDate = board.getRegDate();
		Date updDate = board.getUpdDate();
		
		System.out.println("# 글번호\t: " + boardNo + " ####################");
		System.out.println("# 제목\t: " + title);
		System.out.println("# 작성자\t: " + writer);
		System.out.println("# 내용\t: " + content);
		System.out.println("- 등록일자\t: " + regDate);
		System.out.println("- 수정일자\t: " + updDate);
		System.out.println("###################################");
		System.out.println();
		
		// 해당 글의 댓글 목록
		commentList = data2.selectList(boardNo);
		
		for (int i = 0; i < commentList.length; i++) {
			if( commentList[i] == null ) continue;
			
			int commentNo = commentList[i].getNo();
			String commentWriter = commentList[i].getWriter();
			String commentContent = commentList[i].getContent();
			Date commentRegDate = commentList[i].getRegDate();
			Date commentUpdDate = commentList[i].getUpdDate();
			
			System.out.println("=============================================");
			System.out.println("(" + commentNo + ") - [" + commentWriter + "]");
			System.out.println("# : " + commentContent );
			System.out.println("# - 등록일자 : " + commentRegDate);
			System.out.println("# - 수정일자 : " + commentUpdDate);
			System.out.println("=============================================");
		}
	}
	
	/**
	 * 게시글 쓰기
	 */
	public static void write() {
		System.out.println("##### 게시글 쓰기 #####");
		
//		System.out.print("제목 : ");
//		String title = sc.nextLine();
//		
//		System.out.print("작성자 : ");
//		String writer = sc.nextLine();
//		
//		System.out.print("내용 : ");
//		String content = sc.nextLine();
		
		Board board = input();
		int result = data.insert( board );
		if( result > 0 ) {
			System.out.println("게시글이 작성되었습니다.");
		}
	}
	
	/**
	 * 게시글 수정
	 */
	public static void update() {
		System.out.println("##### 게시글 수정 #####");
		System.out.print("게시글 번호 : ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		
//		System.out.print("제목 : ");
//		String title = sc.nextLine();
//		
//		System.out.print("작성자 : ");
//		String writer = sc.nextLine();
//		
//		System.out.print("내용 : ");
//		String content = sc.nextLine();
		
		
		Board board = input();
		board.setBoardNo(boardNo);
		
		int result = data.update(board);
		
		if (result > 0 ) {
			System.out.println("게시글이 수정되었습니다.");
		}
	}
	
	/**
	 * 게시글 삭제
	 */
	public static void delete() {
		
		System.out.print("삭제할 게시글 번호 : ");
		int boardNo = sc.nextInt();
		
		int result = data.delete(boardNo);
		
		if(result > 0) System.out.println("게시글이 삭제되었습니다.");
	}
	
	// 게시글 정보 입력
	public static Board input() {
		System.out.print("제목 : ");
		String title = sc.nextLine();
		
		System.out.print("작성자 : ");
		String writer = sc.nextLine();
		
		System.out.print("내용 : ");
		String content = sc.nextLine();
		
		Board board = new Board(title, writer, content); // 이거 대신 return에 바로 반환할 수 있음;
		
		return board; //new Board(title, writer, content)
	}
	
	/**
	 * 댓글 쓰기
	 */
	public static void commentWrite() {
		System.out.println("##### 댓글 쓰기 #####");
		System.out.print("글 번호 : ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		
		Comment comment = inputComment();
		comment.setNo(boardNo);						// no <- 게시글 번호(boardNo)
		int result = data2.insert(comment);
		if( result > 0 ) {
			System.out.println("댓글이 작성되었습니다.");
		}
		
	}
	
	// 댓글 정보 입력
	public static Comment inputComment() {
		System.out.print("작성자 : ");
		String writer = sc.nextLine();
		
		System.out.print("내용 : ");
		String content = sc.nextLine();
		
		Comment comment = new Comment(writer, content); // 이거 대신 return에 바로 반환할 수 있음;
		
		return comment; //new Comment(writer, content)
	}
	
	/**
	 * 댓글 수정
	 */
	public static void commentUpdate() {
		System.out.println("##### 댓글 수정 #####");
		System.out.print("댓글 번호 : ");
		int commentNo = sc.nextInt();
		sc.nextLine();
		
		Comment comment = inputComment();
		comment.setNo(commentNo);
		
		int result = data2.update(comment);
		if( result > 0) {
			System.out.println("댓글을 수정하였습니다.");
		}
	}
	
	/**
	 * 댓글 삭제
	 */
	public static void commentDelete() {
		System.out.println("##### 댓글 삭제 #####");
		System.out.print("댓글 번호 : ");
		int commentNo = sc.nextInt();
		sc.nextLine();
		
		int result = data2.delete(commentNo);
		if( result > 0 ) {
			System.out.println("댓글을 삭제하였습니다.");
		}
	}
	
	// 게시판 프로그램 시작
	public static void main(String[] args) {
		int menuNo = 0;				// 메뉴번호
			
		do {
			menu();					// 메뉴판 출력
			menuNo = sc.nextInt();	// 메뉴번호 입력
			sc.nextLine();			// 엔터를 입력버퍼에서 제거
			
			// 프로그램 종료
			if(menuNo == 0 ) break;
			
			// 메뉴 선택
			switch (menuNo) {
				case 1: list(); break;			// 게시글 목록
				case 2: read(); break;			// 게시글 읽기
				case 3: write(); break;			// 게시글 쓰기
				case 4: update(); break;		// 게시글 수정
				case 5: delete(); break;		// 게시글 삭제
				case 6: commentWrite(); break;	// 댓글 쓰기
				case 7: commentUpdate(); break;	// 댓글 수정
				case 8: commentDelete(); break;	// 댓글 삭제
				default: System.out.println("0 ~ 6 사이의 숫자를 입력해주세요."); break;
			}
		} while (menuNo != 0);
		System.out.println("프로그램을 종료합니다...");
	}
}