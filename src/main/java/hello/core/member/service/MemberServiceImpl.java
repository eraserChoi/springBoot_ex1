package hello.core.member.service;

import hello.core.member.Member;
import hello.core.member.repository.MemberRepository;
import hello.core.member.repository.MemoryMemberRepository;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
