package com.escher.classic.controller;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.escher.classic.data.entity.Member;
import com.escher.classic.data.entity.Team;

import lombok.RequiredArgsConstructor;

@Profile("local")
@Component
@RequiredArgsConstructor
public class initMember {

    private final InitMemberService initMemberService;

    @PostConstruct
    public void init(){
        initMemberService.init();
    }


    @Component
    static class InitMemberService {
        @PersistenceContext
        private EntityManager em;

        @Transactional
        public void init(){
            Team teamA = new Team("teamA");
            Team teamB = new Team("teamB");
            em.persist(teamA);
            em.persist(teamB);

            for (int i = 0; i < 100; i ++){
                Team selectedTeam = i % 2 == 0 ? teamA : teamB;
                em.persist(new Member("member" + i, i, selectedTeam));
            }
            
        }
    }
}
