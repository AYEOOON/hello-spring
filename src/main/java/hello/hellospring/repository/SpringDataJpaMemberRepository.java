package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// 스프링 데이터 JPA가 JPA Repository를 받고있으면 구현체를 자동으로 만들어 bean에 등록해준다.
public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {
    // JPQL select m from Member m where m.name = ?
    Optional<Member> findByName(String name);
}
