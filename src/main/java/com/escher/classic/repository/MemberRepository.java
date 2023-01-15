package com.escher.classic.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.escher.classic.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom{
    List<Member> findByUsername(String username);
}
