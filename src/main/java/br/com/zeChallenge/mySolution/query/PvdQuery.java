package br.com.zeChallenge.mySolution.query;

import br.com.zeChallenge.mySolution.domain.Pvd;
import br.com.zeChallenge.mySolution.service.PvdService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PvdQuery implements GraphQLQueryResolver {

    @Autowired
    private PvdService pvdService;

  /*  public List<Pvd> getListPvd(int count){
        return this.pvdService.getAllPvds(count);
    }
*/
    public Optional<Pvd> getPvd(int id){
        return this.pvdService.getPvd(id);
    }

}
