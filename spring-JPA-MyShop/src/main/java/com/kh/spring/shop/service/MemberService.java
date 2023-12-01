package com.kh.spring.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.spring.shop.repository.MemberRepository;
import com.kh.spring.shop.vo.Member;

@Service
public class MemberService   {
	@Autowired
	private MemberRepository memberRepository;
	
	//1. 회원가입하는 메서드
	public Member saveMember(Member member) {
		//이미 가입한 회원인지 아닌지 체크해주는 메서드
		return memberRepository.save(member);
	}
	
	//이미 가입한 회원인지 아닌지 체크해주는 메서드
	public void validateDuplicateMember(Member member) {
		Member findMember = memberRepository.findByEmail(member.getEmail());
		//만약에 존재하는 회원이면 Exception을 활용해서 이미 존재하는 
		//회원임을 나타낼 수 있도록 표시
		
		//DB에서 이미 가입된 회원의 이메일이 존재한다면 예외를 발생시키는 If문
		
		//if(findMember != null) {
		//	throw new IllegalStateException("이미 가입된 회원입니다.");
		//}
	}
}

/*
 UserDetailsService
 사용자 정보를 가지고 오거나 인증할 때 사용하는 서비스
 사용자의 아이디나 이메일을 받아와서 받아온 정보를 객체로 반환할 때 사용
 
 * */