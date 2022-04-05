package com.team04.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team04.domain.BookmarkVO;
import com.team04.domain.MylistVO;
import com.team04.domain.PagingVO;

@Repository("bookmarkDAO")
public class BookmarkDAOImpl implements BookmarkDAO {
 
	@Autowired
	private SqlSessionTemplate mybatis;
	

	/** 공개 여부가 "yes"인 즐겨찾기 전체 개수
	 * @return int
	 */
	@Override
	public int bookmarkListCount() {
		System.out.println("===> Mybatis bookmarkListCount() 호출"); 
		return mybatis.selectOne("BookmarkDAO.bookmarkListCount");
	}

	  /**공개 즐겨찾기 목록 & 검색
	 *인자:HashMap map으로 제목이나 닉네임을 가져와 검색,인자를 안주면 전체 공개목록 검색
	 *리턴형:List<BookmarkVO>
	 */
	@Override public List<BookmarkVO> bookmarkGetList(HashMap map) {
	  System.out.println("===> Mybatis bookmarkGetList() 호출"); 
	  return mybatis.selectList("BookmarkDAO.bookmarkGetList",map); }
	   

	/**좋아요 수 증가&감소(미완성)
	 *
	 */
	@Override
	public void bookmarkUpdateLike(int listNum) {
		System.out.println("===> Mybatis bookmarkUpdateLike() 호출"); 
		  mybatis.selectList("BookmarkDAO.bookmarkUpdateLike",listNum); 
	}
	
	@Override
	public void bookmarkUpdateLikeMa(int listNum) {
		System.out.println("===> Mybatis bookmarkUpdateLikeMa() 호출"); 
		  mybatis.selectList("BookmarkDAO.bookmarkUpdateLikeMa",listNum); 
	}
	
	/**공개목록 좋아요 순으로 출력(미완성)
	 *
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
	 */
	@Override
	public List<BookmarkVO> bookmarkGetMylist(String memberEmail){
		System.out.println("===> Mybatis bookmarkGetMylist() 호출"); 
		return mybatis.selectList("BookmarkDAO.bookmarkGetMylist",memberEmail );
	}
	
	/**나의 즐겨찾기 상세목록 보기
	 *인자:String listNumber 나의 즐겨찾기 목록에서 리스트 번호를 받아옴
	 *리턴형:List<MylistVO>
	 */
	@Override
	public List<MylistVO> bookmarkGetMylistDetail(String listNumber){
		System.out.println("===> Mybatis bookmarkGetMylistDetail() 호출"); 
		return mybatis.selectList("BookmarkDAO.bookmarkGetMylistDetail",listNumber);
	}
	
	public BookmarkVO bookmarkGetDetail(String listNumber) {
		System.out.println("===> Mybatis bookmarkGetDetail() 호출"); 
		return mybatis.selectOne("BookmarkDAO.bookmarkGetDetail",listNumber);
	}
	
	@Override
	public void bookmarkModify (BookmarkVO vo) {
		System.out.println("===> Mybatis bookmarkModify() 호출"); 
		mybatis.update("BookmarkDAO.bookmarkModify",vo);
	}

	public void bookmarkDelete(String listNumber) {
		System.out.println("===> Mybatis bookmarkDelete() 호출"); 
		mybatis.delete("BookmarkDAO.bookmarkDelete",listNumber);
	}
	
	public void mylistUpdate(MylistVO vo) {
		System.out.println("===> Mybatis mylistUpdate() 호출"); 
		mybatis.update("BookmarkDAO.mylistUpdate",vo);		
	}
	
	public void mylistDelete(MylistVO vo) {
		System.out.println("===> Mybatis mylistDelete() 호출"); 
		mybatis.delete("BookmarkDAO.mylistDelete",vo);		
	}
	
	public int totalbookmarkCount() {
		
		return mybatis.selectOne("BookmarkDAO.TotalbookmarkCount");
	}

	/** mylistAdd 나의 즐겨찾기 목록 추가
	 * 
	 */
	public void mylistAdd(BookmarkVO vo) {
		
		mybatis.insert("BookmarkDAO.MylistInsert",vo);
	}

}
