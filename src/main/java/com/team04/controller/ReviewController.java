package com.team04.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.team04.domain.ReviewVO;
import com.team04.service.ReviewService;


@Controller
public class ReviewController {

	@Autowired
	private ReviewService reviewService;
	
	// 리뷰 보기 클릭시 리뷰페이지 보여주기
	 /*		
	  *  	리턴형 :String
	  *  	재정의된 reviewService의 reviewGetList함수에 인자를 이메일을 넣어
	  *  	값을 list에 넣는다. 로그인하면 세션저장후 세션을 가져와 값을 구해온다.
	  * */
	@RequestMapping("review.do")   
	public String reviewShow(Model m, HttpSession session) {
		//System.out.println(session.getAttribute("logemail"));  세션을 잘 가져옵니다.
		
		String logemail = (String) session.getAttribute("logemail");
		
		List<ReviewVO> list = reviewService.reviewGetList(logemail);
		m.addAttribute("reviewList",list);
		return "review";
	}
	
	@RequestMapping("listingDetails.do")
	public String listingDetails() {
		return "listingDetails";
	}
	 
	
	/* 리턴형 없음 
	 * 인자값을 
	 *  ReviewVO vo와  HttpSession session 를 통해 이메일을 얻어
	 *  hashmap을 넣어주고 인자값으로 전해주었다
	 * */
	
	@RequestMapping("reviewUpdate.do")
	public String reviewUpdate(ReviewVO vo, HttpSession session) {
		
		String logemail = (String) session.getAttribute("logemail");
		
		HashMap map = new HashMap();
		map.put("reviewNumber", vo.getReviewNumber());
		map.put("logemail", logemail);
		map.put("ReviewVO", vo);
		map.put("reviewContent", vo.getReviewContent());
		
		
		reviewService.reviewUpdate(map);
		return "redirect:review.do";
	}
	
	@RequestMapping("reviewDelete.do")
	public String reviewDelete(ReviewVO vo) {
		reviewService.reviewDelete(vo);
		
		return "redirect:review.do";
	}
	
	
}
