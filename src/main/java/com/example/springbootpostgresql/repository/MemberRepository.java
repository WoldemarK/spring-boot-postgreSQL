package com.example.springbootpostgresql.repository;

import com.example.springbootpostgresql.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
