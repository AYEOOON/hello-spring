package hello.hellospring.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.aot.generate.GeneratedTypeReference;

@Entity // jpa가 관리하는 entity라고 표현을 한다.
public class Member {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // DB가 알아서 id를 설정해주는 것 -> IDENTITY
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
