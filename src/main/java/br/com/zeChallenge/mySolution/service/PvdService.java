package br.com.zeChallenge.mySolution.service;

import br.com.zeChallenge.mySolution.domain.Pvd;
import br.com.zeChallenge.mySolution.repository.PvdRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PvdService {

    private PvdRepository pvdRepository;

    public PvdService(PvdRepository pvdRepository) {
        this.pvdRepository = pvdRepository;
    }

    @Transactional
    public Pvd createPvd(String tradingName, String ownerName, String document) {
        final Pvd pvd =  new Pvd();
        pvd.setTradingName(tradingName);
        pvd.setOwnerName(ownerName);
        pvd.setDocument(document);
        return pvdRepository.save(pvd);
    }

    @Transactional(readOnly = true)
    public List<Pvd> getAllPvds(int count) {
        return this.pvdRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Optional<Pvd> getPvd(int id) {
        return this.pvdRepository.findById(id);
    }

}
