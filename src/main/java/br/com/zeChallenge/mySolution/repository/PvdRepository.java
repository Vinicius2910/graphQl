package br.com.zeChallenge.mySolution.repository;

import br.com.zeChallenge.mySolution.domain.Pvd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PvdRepository extends JpaRepository<Pvd,Integer> {
}
