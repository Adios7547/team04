package com.team04.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team04.domain.MemberVO;
import com.team04.domain.MylistVO;
import com.team04.domain.ReportVO;
import com.team04.domain.ReviewVO;
import com.team04.domain.ShopVO;

@Repository("listingDetailsDAO")
public class ListingDetailsDAOImpl implements ListingDetailsDAO {

	@Autowired
	private SqlSessionTemplate mybatis;
	//0 4	8	12	16	1*4	2*4	3*4		(페이지 뺴기1 ) 곱하기 보여줄 수  보여줄거 변수로 지정하기
	//
	public List<ShopVO> listingDetailsGetList(String shopNumber) {
		
		/* RowBounds row = new RowBounds(0, 4); */
		
		return mybatis.selectList("listingDetailsDAO.listingDetailsGetList", shopNumber);

	}

	public List<ShopVO> listingDetailsShopInfo(String shopNumber) {

		return mybatis.selectList("listingDetailsDAO.listingDetailsShopInfo", shopNumber);
	}

	public void listingDetailsReviewInsert(HashMap map) {
		mybatis.insert("listingDetailsDAO.listingDetailsReviewInsert", map);
	}
	
	
	
	
	public List<ShopVO> listingDetailsOnlyShopInfo(String shopNumber) {

		return mybatis.selectList("listingDetailsDAO.listingDetailsOnlyShopInfo", shopNumber);
	}
	
	
	
	public void listingDetailsAddList(HashMap map) {
		//System.out.println("넌 다오란다   " + map.get("shopNumber"));
		mybatis.insert("listingDetailsDAO.listingDetailsAddList", map);
	}

	public List<MylistVO> listingDetailsTotalList(HashMap map){
		return mybatis.selectList("listingDetailsDAO.listingDetailsTotalList",map);
	}
	
	public Integer listingDetailsShopListCount(HashMap map){
		return mybatis.selectOne("listingDetailsDAO.listingDetailsShopListCount",map);
	}
	
	public List<ReportVO> listingDetailsReport(HashMap map){
		return mybatis.selectList("listingDetailsDAO.listingDetailsReport",map);
	}
	
	public List<MemberVO> listingDetailsProfileRealFname(HashMap map){
		return mybatis.selectList("listingDetailsDAO.listingDetailsProfileRealFname",map);
	}
	
	public List<ReviewVO> listingDetailsFromReviewRealFname(String shopNumber){
		return mybatis.selectList("listingDetailsDAO.listingDetailsFromReviewRealFname",shopNumber);
	}
	
}
