package com.saerang.jpastudy.repository;

import com.saerang.jpastudy.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;


import static org.assertj.core.api.Assertions.*;


@SpringBootTest
@Transactional
class MemberRepositoryTest {

    @Autowired MemberRepository memberRepository;

    @Test
    @Rollback(false)
    public void testMember() throws Exception {
        //given
        Member member = new Member();
        member.setUsername("memberA");

        //when
//        Long saveId = memberRepository.save(member);
//        Member findMember = memberRepository.find(saveId);

        //then
//        assertThat(findMember.getId()).isEqualTo(member.getId());
//        assertThat(findMember.getId()).isEqualTo(member.getId());
//        assertThat(findMember).isEqualTo(member);
    }

}