package com.saerang.jpastudy.repository;

import com.saerang.jpastudy.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberInterfaceRepository extends JpaRepository<Member, Long> {
}
