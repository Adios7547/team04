package com.team04.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team04.domain.MemberVO;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO{

	@Autowired
	private SqlSessionTemplate memberMybatis;


	/** email 중복 체크
	 * 	- DB에 동일한 이메일이 있는지 레코드 검색
	 * 	- MemberMapper의 #emailCheck 호출
	 * @param MemberVO vo (memberEmail)
	 * @return MemberVO vo
	 * 			- null O : 사용가능한 이메일
	 * 			- null X : 중복된 이메일 - 사용 불가능
	 */
	@Override
	public MemberVO emailCheck(MemberVO vo) {
		System.out.println("===> MemberMapper emailCheck 호출");
		return memberMybatis.selectOne("memberDAO.emailCheck", vo);
	}


	/**	회원가입
	 * 	- DB에 회원의 정보를 입력
	 * 	- MemberMapper의 #memberInsert 호출
	 * @param MemberVO vo
	 * @return int ( 입력 성공 시 1을 리턴 )
	 */
	@Override
	public int memberInsert(MemberVO vo) {
		System.out.println("===> MemberMapper memberInsert 호출");
		return memberMybatis.insert("memberDAO.memberInsert", vo);
	}


	/** 로그인
	 * 	- DB에 입력된 이메일과 비밀번호가 일치하는 레코드 검색
	 *  - MemberMapper의 #loginCheck 호출
	 * @param MemberVO vo (memberEmail, memberPassword)
	 * @return MemberVO vo
	 * 			- null O : 로그인 실패
	 * 			- null X : 로그인 성공
	 */
	@Override
	public MemberVO loginCheck(MemberVO vo) {
		System.out.println("===> MemberMapper loginCheck 호출");
		return memberMybatis.selectOne("memberDAO.loginCheck", vo);
	}


	/**	비밀번호 찾기
	 * 	- DB에서 회원 정보 찾기
	 *  - MemberMapper의 #pwSearch 호출
	 * @param MemberVO vo (memberEmail, memberName, memberTel)
	 * @return MemberVO vo
	 * 			- null O : 비밀번호 재설정 X 
	 * 			- null X : 비밀전호 재설정 O
	 */
	@Override
	public MemberVO pwSearch(MemberVO vo) {
		System.out.println("===> MemberMapper pwSearch 호출");
		return memberMybatis.selectOne("memberDAO.pwSearch", vo);
	}


	/**	비밀번호 변경
	 *  - DB에 동일한 이메일을 가진 회원의 비밀번호를 변경 
	 *  - MemberMapper의 #pwChange 호출
	 * @param MemberVO vo (memberEmail, memberPassword)
	 * @return int
	 */
	@Override
	public int pwChange(MemberVO vo) {
		System.out.println("===> MemberMapper pwChange 호출");
		return memberMybatis.update("memberDAO.pwChange", vo);
	}

}
