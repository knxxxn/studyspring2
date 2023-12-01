package hello.core.member;

import hello.core.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;
    @Autowired //자동 의존 관계 주입
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    public void join(Member member) {
        memberRepository.save(member); //실행에만 집중할거다
    }
    public Member findMember(Long memberId) {

        return memberRepository.findById(memberId); //실행에만 집중할거다

    }

    //테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
