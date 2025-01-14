package com.company.app.service.impl;

import com.company.app.entity.HumanEntity;
import com.company.app.repository.HumanRepository;
import com.company.app.service.HumanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HumanServiceImpl implements HumanService {

    private final HumanRepository humanRepository;

    public HumanServiceImpl(HumanRepository humanRepository) {
        this.humanRepository = humanRepository;
    }

    @Override
    public List<HumanEntity> getAll() {
        return humanRepository.findAll();
    }

    @Override
    public HumanEntity getOneById(Integer id) {
        return humanRepository.getOne(id);
    }

    @Override
    public void create(String nickname, int age) {
        humanRepository.save(new HumanEntity(nickname, age));
    }
}
