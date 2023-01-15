package com.escher.classic.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.escher.classic.dto.MemberSearchCondition;
import com.escher.classic.entity.Member;
import static com.escher.classic.entity.QMember.*;
import com.escher.classic.repository.support.Querydsl4RepositorySupport;

@Repository
public class MemberTestRepository extends Querydsl4RepositorySupport{

    public MemberTestRepository(Class<?> domainClass) {
        super(Member.class);
    }

    public List<Member> basicSelect(){
        return select(member)
            .from(member)
            .fetch();
    }
    
    public List<Member> basicSelectFrom(){
        return selectFrom(member).fetch();
    }

    public Page<Member> searchPageByApplyPage(MemberSearchCondition condition, Pageable pageable){
        return applyPagination(
            pageable, 
            query -> query.selectFrom(member),
            query -> query.selectFrom(member)
        );
    }
}
