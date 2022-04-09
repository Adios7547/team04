<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="./resources/member/fonts/icomoon/style.css">

    <link rel="stylesheet" href="./resources/member/css/owl.carousel.min.css">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="./resources/member/css/bootstrap.min.css">
    
    <!-- Style -->
    <link rel="stylesheet" href="./resources/member/css/style.css">
    
    <!-- userStyle : 안정은 -->
    <link rel="stylesheet" href="./resources/member/css/userStyle.css">

    <title>회원가입 </title>
  </head>
  <body>
  

  
  <div class="content">
    <div class="container">
      <div class="row justify-content-center">
        <div class="col-md-6 contents">
          <div class="row justify-content-center">
            <div class="col-md-12">
              <div class="form-block">
                  <div class="mb-4">
                  <h3 id="titleCenter"><strong>SIGN UP</strong></h3>
               	</div>
               	
               	<!-- FORM -->
                <form id="member_frm" action="memberInsert.do" method="post" name="member_frm">
                
                <!-- NICKNAME -->
                  <div class="form-group first field--not-empty">
                    <label for="memberNickname">닉네임&nbsp; &nbsp; &nbsp; &nbsp;<span class="error_box"></span></label>
                    <input type="text" class="form-control form_nick" id="memberNickname" name="memberNickname" autofocus > 
                  </div>
                  
                  <!-- EMAIL -->
                  <div class="form-group first field--not-empty">
                  	<div class="email_check col-md-9">
                    	<label for="memberEmail">이메일&nbsp; &nbsp; &nbsp; &nbsp;<span class="error_box"></span></label>
                    	<input type="email" class="form-control" id="memberEmail" name="memberEmail">
                    </div>
                    <!-- email_check는 css에서 사용됨 -->
                    <div class='email_check col-md-3'>
                    	<!-- emailCheck.do로 넘어간다. -->
                    	<button type="button" id="btn_emailCheak"class="btn_check btn-pill btn-danger"><span class="text-white btn_text">중복확인</span></button>
                   	</div>
                  </div>
                  
                  <!-- PW -->
                  <div class="form-group first field--not-empty">
                    <label for="memberPassword">비밀번호&nbsp; &nbsp; &nbsp; &nbsp;<span class="error_box"></span></label>
                    <input type="password" class="form-control" id="memberPassword" name="memberPassword" >
                  </div>
                  
                 <!-- PW CHECK -->
                  <div class="form-group first field--not-empty">
                    <label for="passwordCheck">비밀번호 재확인 &nbsp; &nbsp; &nbsp; &nbsp;<span class="error_box"></span></label>
                    <input type="password" class="form-control" id="passwordCheck" >
                  </div>
                  
                  <!-- NAME -->
                  <div class="form-group first field--not-empty">
                    <label for="memberName">이름&nbsp; &nbsp; &nbsp; &nbsp;<span class="error_box"></span></label>
                    <input type="text" class="form-control" id="memberName" name="memberName" >
                  </div>
                  
                  <!-- BIRTH -->
                  <div class="form-group first field--not-empty">
                    <label for="memberBirth">생년월일&nbsp; &nbsp; &nbsp; &nbsp;<span class="error_box"></span></label> 
                    <input type="date" class="form-control" id="memberBirth" name="memberBirth" required>
                  </div>
                  

                  <!-- TEL -->
                  <div class="form-group first field--not-empty">
                    <label for="memberTel">휴대전화&nbsp; &nbsp; &nbsp; &nbsp;<span class="error_box"></span></label>
                    <input type="tel" class="form-control" id="memberTel" name="memberTel" >
                  </div>
                  
                  <div class="d-flex mb-5 align-items-center" id="agree">
                    <label class="control control--checkbox mb-3 mb-sm-0"><span class="caption"><a href="#" id="btnAgree">이용약관</a>에 동의합니다.</span>
                    <input type="checkbox" id="termsService"/>
                    <span class="error_box"></span>
                    <div class="control__indicator"></div>
                  </label>
                  </div>
                  	<div id="agreeForm" tabindex="0">
						제 1장 총칙
						<br/>
						<br/>
						<br/>
						제 1 조(목적)
						<br/>
						<br/>						
						본 약관은 먹생먹사 웹사이트(이하 "먹생먹사")가 제공하는 모든 서비스(이하 "서비스")의 이용조건 및 절차, 회원과 먹생먹사 의 권리, 의무, 책임사항과 기타 필요한 사항을 규정함을 목적으로 합니다.
						<br/>
						<br/>						
						제 2 조(약관의 효력과 변경)
						<br/>
						<br/>						
						1. 먹생먹사는 이용자가 본 약관 내용에 동의하는 경우, 먹생먹사의 서비스 제공 행위 및 회원의 서비스 사용 행위에 본 약관이 우선적으로 적용됩니다.
						2. 먹생먹사는 약관을 개정할 경우, 적용일자 및 개정사유를 명시하여 현행약관과 함께 먹생먹사의 초기화면에 그 적용일 7일 이전부터 적용 전일까지 공지합니다. 단, 회원에 불리하게 약관내용을 변경하는 경우에는 최소한 30일 이상의 사전 유예기간을 두고 공지합니다. 이 경우 먹생먹사는 개정 전 내용과 개정 후 내용을 명확하게 비교하여 회원이 알기 쉽도록 표시합니다.
						3. 변경된 약관은 먹생먹사 홈페이지에 공지하거나 e-mail을 통해 회원에게 공지하며, 약관의 부칙에 명시된 날부터 그 효력이 발생됩니다. 회원이 변경된 약관에 동의하지 않는 경우, 회원은 본인의 회원등록을 취소(회원탈퇴)할 수 있으며, 변경된 약관의 효력 발생일로부터 7일 이내에 거부의사를 표시하지 아니하고 서비스를 계속 사용할 경우는 약관 변경에 대한 동의로 간주됩니다.
						<br/>
						<br/>						
						제 3 조(약관 외 준칙)
						<br/>
						<br/>						
						본 약관에 명시되지 않은 사항은 전기통신기본법, 전기통신사업법, 정보통신윤리위원회심의규정, 정보통신 윤리강령, 프로그램보호법 및 기타 관련 법령의 규정에 의합니다.
						<br/>
						<br/>						
						제 4 조(용어의 정의)
						<br/>
						<br/>						
						본 약관에서 사용하는 용어의 정의는 다음과 같습니다.
						1. 이용자 : 본 약관에 따라 먹생먹사가 제공하는 서비스를 받는 자
						2. 가입 : 먹생먹사가 제공하는 신청서 양식에 해당 정보를 기입하고, 본 약관에 동의하여 서비스 이용계약을 완료시키는 행위
						3. 회원 : 먹생먹사에 개인 정보를 제공하여 회원 등록을 한 자로서 먹생먹사가 제공하는 서비스를 이용할 수 있는 자.
						4. 계정(ID) : 회원의 식별과 회원의 서비스 이용을 위하여 회원이 선정하고 먹생먹사에서 부여하는 문자와 숫자의 조합
						5. 비밀번호 : 회원과 계정이 일치하는지를 확인하고 통신상의 자신의 비밀보호를 위하여 회원 자신이 선정한 문자와 숫자의 조합
						6. 탈퇴 : 회원이 이용계약을 종료시키는 행위
						7. 본 약관에서 정의하지 않은 용어는 개별서비스에 대한 별도 약관 및 이용규정에서 정의합니다.
						<br/>
						<br/>						
						<br/>
						<br/>						
						제 2장 서비스 제공 및 이용
						<br/>
						<br/>						
						제 5 조 (이용계약의 성립)
						<br/>
						<br/>						
						1. 이용계약은 이용자가 온라인으로 먹생먹사에서 제공하는 소정의 가입신청 양식에서 요구하는 사항을 기록하여 가입을 완료하는 것으로 성립됩니다.
						2. 먹생먹사는 다음 각 호에 해당하는 이용계약에 대하여는 가입을 취소할 수 있습니다.
						   1) 다른 사람의 명의를 사용하여 신청하였을 때
						   2) 이용계약 신청서의 내용을 허위로 기재하였거나 신청하였을 때
						   3) 다른 사람의 먹생먹사 서비스 이용을 방해하거나 그 정보를 도용하는 등의 행위를 하였을 때
						   4) 먹생먹사를 이용하여 법령과 본 약관이 금지하는 행위를 하는 경우
						   5) 기타 먹생먹사가 정한 이용신청요건이 미비 되었을 때
						<br/>
						<br/>						
						제 6 조 (회원정보 사용에 대한 동의)
						<br/>
						<br/>						
						1. 회원의 개인정보는 「공공기관의개인정보보호에관한법률」에 의해 보호됩니다.
						2. 먹생먹사의 회원 정보는 다음과 같이 사용, 관리, 보호됩니다.
						   1) 개인정보의 사용 : 먹생먹사는 서비스 제공과 관련해서 수집된 회원의 신상정보를 본인의 승낙 없이 제3자에게 누설, 배포하지 않습 니다. 단, 전기통신기본법 등 법률의 규정에 의해 국가기관의 요구가 있는 경우, 범죄에 대한 수사상의 목적이 있거나 정보통신윤리위원회의 요청이 있는 경우 또는 기타 관계법령에서 정한 절차에 따른 요청이 있는 경우, 이용자 스스로 개인정보를 공개한 경우에는 그러 하지 않습니다.
						   2) 개인정보의 관리 : 회원은 개인정보의 보호 및 관리를 위하여 서비스의 개인정보관리에서 수시로 회원의 개인정보를 수정/삭제할 수 있습니다.
						   3) 개인정보의 보호 : 회원의 개인정보는 오직 본인만이 열람/수정/삭제 할 수 있으며, 이는 전적으로 회원의 계정과 비밀번호에 의해 관리되고 있습니다. 따라서 타인에게 본인의 계정과 비밀번호를 알려주어서는 안되며, 작업 종료시에는 반드시 로그아웃해 주시기 바랍니다.
						3. 회원이 본 약관에 따라 이용신청을 하는 것은, 먹생먹사의 신청서에 기재된 회원정보를 수집, 이용하는 것에 동의하는 것으로 간주 됩니다.
						<br/>
						<br/>						
						제 7 조 (사용자의 정보 보안)
						<br/>
						<br/>						
						1. 이용자는 먹생먹사 서비스 가입 절차를 완료하는 순간부터 본인이 입력한 정보의 비밀을 유지할 책임이 있으며, 회원이 고의나 중대한 실수로 회원의 계정과 비밀번호를 사용하여 발생한 피해에 대한 책임은 회원 본인에게 있습니다.
						2. 계정과 비밀번호에 관한 모든 관리의 책임은 회원에게 있으며, 회원의 계정이나 비밀번호가 부정하게 사용되었다는 사실을 발견한 경우에는 즉시 먹생먹사에 신고하여야 합니다. 신고를 하지 않음으로 인한 모든 책임은 회원 본인에게 있습니다.
						3. 이용자는 먹생먹사 서비스의 사용 종료시마다 정확히 접속을 종료해야 하며, 정확히 종료하지 아니함으로써 제3자가 이용자에 관한 정보를 이용하게 되는 등의 결과로 인해 발생하는 손해 및 손실에 대하여 먹생먹사는 책임을 부담하지 아니합니다.
						<br/>
						<br/>						
						제 8 조 (서비스의 변경)
						<br/>
						<br/>						
						1. 당 사이트는 귀하가 서비스를 이용하여 기대하는 손익이나 서비스를 통하여 얻은 자료로 인한 손해에 관하여 책임을 지지 않으며, 회원이 본 서비스에 게재한 정보, 자료, 사실의 신뢰도, 정확성 등 내용에 관하여는 책임을 지지 않습니다.
						2. 당 사이트는 서비스 이용과 관련하여 가입자에게 발생한 손해 중 가입자의 고의,과실에 의한 손해에 대하여 책임을 부담하지 아니합니다.
						<br/>
						<br/>						
						제 9 조 (이용기간 및 자격의 정지 및 상실)
						<br/>
						<br/>						
						1. 먹생먹사 회원이용기간은 조직통폐합에 따른 불가항력을 제외하고 회원신청에서 탈퇴까지로 합니다.
						2. 먹생먹사는 이용자가 본 약관에 명시된 내용을 위배하는 행동을 한 경우, 이용자격을 일시적으로 정지하고 30일 이내에 시정하도록 이용자에게 요구할 수 있으며, 이후 동일한 행위를 2회 이상 반복할 경우에 30일간의 소명기회를 부여한 후 이용자격을 상실시킬 수 있습니다.
						3. 먹생먹사 회원이 신청 후 12개월이상 장시간 이용하지 않은 회원은 휴면아이디로 분류하여, 자격 정지 및 상실이 가능합니다.
						<br/>
						<br/>						
						제 10 조 (계약해제, 해지 등)
						<br/>
						<br/>						
						1. 회원은 언제든지 서비스 초기화면의 마이페이지 또는 정보수정 메뉴 등을 통하여 이용계약 해지 신청을 할 수 있으며, 먹생먹사는 관련법 등이 정하는 바에 따라 이를 즉시 처리하여야 합니다.
						2. 회원이 계약을 해지할 경우, 관련법 및 개인정보취급방침에 따라 먹생먹사가 회원정보를 보유하는 경우를 제외하고는 해지 즉시 회원의 모든 데이터는 소멸됩니다.
						3. 회원이 계약을 해지하는 경우, 회원이 작성한 게시물 중 블로그 등과 같이 본인 계정에 등록된 게시물 일체는 삭제됩니다. 단, 타인에 의해 스크랩 되어 재게시되거나, 공용게시판에 등록된 게시물 등은 삭제되지 않으니 사전에 삭제 후 탈퇴하시기 바랍니다.
						<br/>
						<br/>						
						제 11 조 (게시물의 저작권)
						<br/>
						<br/>						
						1. 이용자가 게시한 게시물의 저작권은 이용자가 소유하며, 먹생먹사는 서비스 내에 이를 게시할 수 있는 권리를 갖습니다.
						2. 먹생먹사는 다음 각 호에 해당하는 게시물이나 자료를 사전통지 없이 삭제하거나 이동 또는 등록 거부를 할 수 있습니다.
						   1) 본서비스 약관에 위배되거나 상용 또는 불법, 음란, 저속하다고 판단되는 게시물을 게시한 경우
						   2) 다른 회원 또는 제 3자에게 심한 모욕을 주거나 명예를 손상시키는 내용인 경우
						   3) 공공질서 및 미풍양속에 위반되는 내용을 유포하거나 링크시키는 경우
						   4) 불법복제 또는 해킹을 조장하는 내용인 경우
						   5) 영리를 목적으로 하는 광고일 경우
						   6) 범죄와 결부된다고 객관적으로 인정되는 내용일 경우
						   7) 다른 이용자 또는 제 3자의 저작권 등 기타 권리를 침해하는 내용인 경우
						   8) 먹생먹사는 에서 규정한 게시물 원칙에 어긋나거나, 게시판 성격에 부합하지 않는 경우
						   9) 기타 관계법령에 위배된다고 판단되는 경우
                  </div>
                  <input type="button" value="가입하기" id="btn_signUp" class="btn btn-pill text-white btn-block btn-danger">
 <!--                 <span class="d-block text-center my-4 text-muted"> or register with</span>
                  <div class="g-signin2" data-onsuccess="onSignIn"></div>
                  <div class="social-login text-center">
                    <a href="#" class="facebook">
                      <span class="icon-facebook mr-3"></span> 
                    </a>
                    <a href="#" class="twitter">
                      <span class="icon-twitter mr-3"></span> 
                    </a>
                    <a href="#" class="google">
                      <span class="icon-google mr-3"></span> 
                    </a>
                  </div> -->
                  <div class="d-flex mb-5 align-items-center" id="homeGO">
                    <label class="control control--checkbox mb-0"><span class="caption"></span>
                    </label>
                    	<span class=""><a href="main.do" class="forgot-pass">홈 화면으로 가기</a></span>
                        <span class="ml-auto"><a href="loginForm.do" class="forgot-pass">로그인하기</a></span>  
                  </div>
                </form>
              </div>
            </div>
          </div>
          
        </div>
        
      </div>
    </div>
  </div>
	
  	<!-- 안정은 : js추가 -->
    <script src="./resources/member/js/jquery-3.3.1.min.js"></script>
    <script src="./resources/member/js/popper.min.js"></script>
    <script src="./resources/member/js/bootstrap.min.js"></script>
    <script src="./resources/member/js/main.js"></script>
    <script src="./resources/member/js/member.js"></script>
  </body>
</html>