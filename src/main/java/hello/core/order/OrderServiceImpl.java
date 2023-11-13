package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {
    //private final MemberRepository memberRepository = new
      //      MemoryMemberRepository();
    //private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    //private final DiscountPolicy discountPolicy = new RateDiscountPolicy(); 위 없애고 애만해도 문제 발생
    //private DiscountPolicy discountPolicy; //이렇게 하면 문제 발생 안함, 객체에 의존 x 그래도 에러 발생

    //public OrderServiceImpl(MemoryMemberRepository memoryMemberRepository, FixDiscountPolicy fixDiscountPolicy) {
    //}

   // @Override
    //public Order createOrder(Long memberId, String itemName, int itemPrice) {
    //    Member member = memberRepository.findById(memberId);
     //   int discountPrice = discountPolicy.discount(member, itemPrice);
    //    return new Order(memberId, itemName, itemPrice, discountPrice);
   // }
   private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy
            discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }
    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
