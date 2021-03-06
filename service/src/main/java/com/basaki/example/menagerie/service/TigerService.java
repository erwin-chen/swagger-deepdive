package com.basaki.example.menagerie.service;

import com.basaki.example.menagerie.data.repository.MenagerieRepository;
import com.basaki.example.menagerie.model.animal.Tiger;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * {@code TigerService} provides CRUD operations on an {@code Tiger}.
 * <p>
 *
 * @author Indra Basak
 * @since 4/30/17
 */
@Service
public class TigerService extends AbstractMenagerieService<Tiger> {

    @Autowired
    public TigerService(MenagerieRepository repo, Mapper mapper) {
        super(repo, mapper);
    }
}
