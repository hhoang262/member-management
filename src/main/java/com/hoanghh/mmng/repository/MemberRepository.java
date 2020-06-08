package com.hoanghh.mmng.repository;

import com.hoanghh.mmng.entity.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Long> {
    Member findById(long id);
}
