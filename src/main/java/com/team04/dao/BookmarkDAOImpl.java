package com.team04.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team04.domain.BookmarkVO;
import com.team04.domain.HeartVO;
import com.team04.domain.MylistVO;
import com.team04.domain.PagingVO;


@Repository("bookmarkDAO")
public class BookmarkDAOImpl implements BookmarkDAO {

	@Autowired
	private SqlSessionTemplate mybatis;


	/* 메소드명:bookmarkGetList
	 * 인자: HashMap map
	 * 리턴형: List<BookmarkVO>
	 * 사용:	1.기본 출력- 공개된 즐겨찾기 전체 목록 출력.
	 * 		2.검색시 출력-제목과 닉네임으로 검색.
	 */
	@Override public List<BookmarkVO> bookmarkGetList(HashMap map) {
	  System.out.println("===> Mybatis bookmarkGetList() 호출");
	  return mybatis.selectList("BookmarkDAO.bookmarkGetList",map); }


	/** 메소드명:bookmarkUpdateLike(미완성)
	 * 인자: int num
	 * 리턴형: x
	 * 사용:하트 클릭시 좋아요 수 증가
	 */
	@Override
	public void bookmarkUpdateLike(int listNum) {
		System.out.println("===> Mybatis bookmarkUpdateLike() 호출");
		  mybatis.selectList("BookmarkDAO.bookmarkUpdateLike",listNum);
	}


	/**메소드명:bookmarkUpdateLikeMa(미완성)
	 * 인자:int num
	 * 리턴형:x
	 * 사용:하트 다시 클릭하여 좋아요 취소하기
	 */
	@Override
	public void bookmarkUpdateLikeMa(int listNum) {
		System.out.println("===> Mybatis bookmarkUpdateLikeMa() 호출");
		  mybatis.selectList("BookmarkDAO.bookmarkUpdateLikeMa",listNum);
	}


	/*메소드명: bookmarkGetBestList()
	 * 인자: x
	 * 리턴형:List<BookmarkVO>
	 * 사용:즐겨찾기 공개 목록 중 좋아요 순으로 6개를 뽑아 메인화면에 출력
	 */
	@Override
	public List<BookmarkVO> bookmarkGetBestList(){
		System.out.println("===> Mybatis bookmarkGetBestList() 호출");
		return mybatis.selectList("BookmarkDAO.bookmarkGetBestList");
	}

	/** 나만의 즐겨찾기 총 개수 구하기
	 * 	- 페이징을 위해 DB에 입력된 회원의 즐겨찾기 총 개수를 구함
	 * @param memberEmail
	 * @return int 개수 리턴
	 */
	@Override
	public int bookmarkMylistTotalCount(PagingVO paging) {
		System.out.println("===> Mybatis bookmarkMylistTotalCount() 호출");
		return mybatis.selectOne("BookmarkDAO.bookmarkMylistTotalCount", paging);
	}

	@Override
	public List<BookmarkVO> bookmarkGetMylistPaging(PagingVO paging){
		System.out.println("===> Mybatis bookmarkGetMylistPaging() 호출");
		return mybatis.selectList("BookmarkDAO.bookmarkGetMylistPaging",paging );
	}

	/**나의 즐겨찾기 목록 보기 (미완성)
	 *



   /*메소드명: bookmarkGetMylist
    * @param String memberEmail
    * @return List<BookmarkVO>
    * 사용:로그인 후 나의 즐겨찾기 목록 출력
    */
	@Override
	public List<BookmarkVO> bookmarkGetMylist(String memberEmail){
		System.out.println("===> Mybatis bookmarkGetMylist() 호출");
		return mybatis.selectList("BookmarkDAO.bookmarkGetMylist",memberEmail );
	}


	/*메소드명: bookmarkGetMylistDetail
	 * @param String listNumber
	 * @return List<MylistVO>
	 * 사용: 나의 즐겨찾기 목록 클릭 후 상세 목록
	 */
	@Override
	public List<MylistVO> bookmarkGetMylistDetail(String listNumber){
		System.out.println("===> Mybatis bookmarkGetMylistDetail() 호출");
		return mybatis.selectList("BookmarkDAO.bookmarkGetMylistDetail",listNumber);
	}


	/*메소드명: bookmarkGetDetail
	 * @param String listNumber
	 * @return BookmarkVO
	 * 사용: 즐겨찾기 공개 목록 클릭 후 상세 목록
	 */
	public BookmarkVO bookmarkGetDetail(String listNumber) {
		System.out.println("===> Mybatis bookmarkGetDetail() 호출");
		return mybatis.selectOne("BookmarkDAO.bookmarkGetDetail",listNumber);
	}


	/*메소드명: bookmarkModify
	 * @param BookmarkVO vo
	 * @return x
	 * 사용: 즐겨찾기 제목, 공개여부 수정
	 */
	@Override
	public void bookmarkModify (BookmarkVO vo) {
		System.out.println("===> Mybatis bookmarkModify() 호출");
		mybatis.update("BookmarkDAO.bookmarkModify",vo);
	}


	/*메소드명:bookmarkDelete
	 * @param String listNumber
	 * @return x
	 * 사용: 해당 즐겨찾기 즐겨찾기목록에서 삭제
	 */
	public void bookmarkDelete(String listNumber) {
		System.out.println("===> Mybatis bookmarkDelete() 호출");
		mybatis.delete("BookmarkDAO.bookmarkDelete",listNumber);
	}


	/*메소드명: mylistUpdate
	 * @param MylistVO vo
	 *  @return x
	 *  사용: 즐겨찾기 목록에 있는 가게 다른 목록으로 이동
	 */
	public void mylistUpdate(MylistVO vo) {
		System.out.println("===> Mybatis mylistUpdate() 호출");
		mybatis.update("BookmarkDAO.mylistUpdate",vo);
	}


	/*메소드명: mylistDelete
	 * @param MylistVO vo
	 * @return x
	 * 사용:즐겨찾기 목록에 있는 가게 삭제
	 */
	public void mylistDelete(MylistVO vo) {
		System.out.println("===> Mybatis mylistDelete() 호출");
		mybatis.delete("BookmarkDAO.mylistDelete",vo);
	}


	/**메소드명: totalbookmarkCount(미완성)
	 * @param x
	 * @return int
	 * 사용: 공개 게시판 칼럼 수 가져오기
	 */
	public int totalbookmarkCount() {

		return mybatis.selectOne("BookmarkDAO.TotalbookmarkCount");
	}


	/*메소드명: mylistAdd
	 * @param BookmarkVO vo
	 * @return x
	 * 사용:즐겨찾기 리스트 추가하기
	 */
	public void mylistAdd(BookmarkVO vo) {
		System.out.println("===> Mybatis mylistAdd() 호출");
		mybatis.insert("BookmarkDAO.MylistInsert",vo);
	}


	/*메소드명: imageSelectBestBookmark
	 * @param int listNumber
	 * @return BookmarkVO
	 * 사용: 메인 공개 즐겨찾기 사진 가져오기
	 */
	public BookmarkVO imageSelectBestBookmark(int listNumber) {
		System.out.println("===> Mybatis imageSelectBestBookmark() 호출");
		return mybatis.selectOne("BookmarkDAO.ImageSelectBestBookmark",listNumber);
	}

	public HeartVO findHeart(HashMap<String, Long> number) {
		return mybatis.selectOne("BookmarkDAO.findHeart",number);
	}
}
