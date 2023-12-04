package com.kh.springdb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.springdb.model.vo.dao.MemberDAO;
import com.kh.springdb.vo.MemberVO;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO memberdao;
	
	//전체 보기
	
	//멤버에 대한 정보를 수정하거나 새로 작성하는 service
	/*public MemberVO getMemberById(int memberId) {
		return memberdao.get
	}
	*/
	public void insertMember(MemberVO member) {
		memberdao.insertMember(member);
	}
}
