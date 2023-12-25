package com.example.firstproject1.repository;

import com.example.firstproject1.entity.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Long> {
}
