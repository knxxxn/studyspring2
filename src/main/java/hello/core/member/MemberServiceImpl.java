package hello.core.member;

public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    public void join(Member member) {
        memberRepository.save(member); //실행에만 집중할거다
    }
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId); //실행에만 집중할거다
    }
}
