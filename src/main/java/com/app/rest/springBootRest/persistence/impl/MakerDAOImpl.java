package com.app.rest.springBootRest.persistence.impl;

import com.app.rest.springBootRest.entity.Maker;
import com.app.rest.springBootRest.persistence.IMakerDAO;
import com.app.rest.springBootRest.repository.MakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MakerDAOImpl implements IMakerDAO  {

    @Autowired
    private MakerRepository makerRepository;

    @Override
    public List<Maker> findAll() {
        return (List<Maker>) makerRepository.findAll();
    }

    @Override
    public Optional<Maker> findById(Long id) {
        return makerRepository.findById(id);
    }

    @Override
    public void save(Maker maker) {
        makerRepository.save(maker);

    }

    @Override
    public void deleteById(Long id) {
        makerRepository.deleteById(id);

    }
}
