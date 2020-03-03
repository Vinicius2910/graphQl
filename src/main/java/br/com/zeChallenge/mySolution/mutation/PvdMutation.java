package br.com.zeChallenge.mySolution.mutation;

import br.com.zeChallenge.mySolution.domain.Pvd;
import br.com.zeChallenge.mySolution.service.PvdService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PvdMutation implements GraphQLMutationResolver {

    @Autowired
    private PvdService pvdService;

    public Pvd createPvd(final String tradingName, final String ownerName, final String document) {
        return this.pvdService.createPvd(tradingName, ownerName, document);
    }

}
