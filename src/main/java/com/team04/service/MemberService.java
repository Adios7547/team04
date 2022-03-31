package com.team04.service;

import com.team04.domain.MemberVO;

public interface MemberService {
	
	
	/**	email 중복 체크
	 * 	- DB에 동일한 이메일이 있는지 레코드 검색
	 */
	public MemberVO emailCheck(MemberVO vo);
	
	/** 회원가입
	 * 	- DB에 회원의 정보를 입력
	 */
	public int memberInsert(MemberVO vo);
	
	
	/** 로그인
	 * 	- DB에 입력된 이메일과 비밀번호가 일치하는 레코드 검색
	 */
	public MemberVO loginCheck(MemberVO vo);
	
	/** 비밀번호 찾기 
	 * 	- DB에 회원 정보 찾기 
	 */
	public MemberVO pwSearch(MemberVO vo);
	
	/** 비밀번호 변경
	 *	- DB에 동일한 이메일을 가진 회원의 비밀번호를 변경 
	 */
	public int pwChange(MemberVO vo);
	
	/** 마이페이지 회원 정보에 출력될 회원 레코드 검색
	 * - DB에서 이메일이 동일한 회원의 정보 찾기
	 */
	public MemberVO memberSearch(MemberVO vo);
		
	/**	회원 정보 수정
	 * - DB에 동일한 이메일을 가진 회원의 정보를 수정
	 */
	public int memberUpdate(MemberVO vo);
}
