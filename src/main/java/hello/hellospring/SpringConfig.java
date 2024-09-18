package hello.hellospring;


import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.domain.Member;
import hello.hellospring.repository.*;
import hello.hellospring.service.Memberservice;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

//    // Spring이 관리하는 Springboot가 데이터 소스를 설정파일을 보고 Spring이 자체적으로 정보생성, 주입해줌
//    private DataSource dataSource;
//
//    @Autowired
//    public SpringConfig(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }

//    private EntityManager em;
//
//    @Autowired
//    public SpringConfig(EntityManager em) {
//        this.em = em;
//    }

    private final MemberRepository memberRepository;

    @Autowired // 생성자가 하나인 경우에는 생략가능
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public Memberservice memberservice(){
        return new Memberservice(memberRepository);
    }

//    @Bean
//    public MemberRepository memberRepository(){
//        return new MemorymemberRepository();
//        return new JdbcMemberRepository(dataSource);
//        return new JbdcTemplatedMemberRepository(dataSource);
//        return new JpaMemberRepository(em);

//    }
}
