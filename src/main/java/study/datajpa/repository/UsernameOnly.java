package study.datajpa.repository;

import org.springframework.beans.factory.annotation.Value;

public interface UsernameOnly {

    @Value("#{target.username + ' ' + target.age}")// open projection 엔티티의 모든 데이터를 가져와 연산하기 때문에
    String getUsername();
}
