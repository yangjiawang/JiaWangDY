package com.yangjiawang.service;

import com.yangjiawang.domain.Film;
import com.yangjiawang.mapper.FilmlistMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author YANGJIAWANG
 * @DATE 2019/9/17
 * @TIME 15:48
 **/
@Service("filmlistService")
public class FilmlistServiceImpl implements FilmlistService {
    @Autowired
     private      FilmlistMapper filmlistMapper;
    @Override
    public void Insert(Film filmlist) {
        filmlistMapper.Insert(filmlist);
    }

    @Override
    public List<Film> select() {
        List<Film> film= filmlistMapper.select();
        return film;
    }

    @Override
    public List<Film> select2(String name) {
        List<Film> films=filmlistMapper.select2(name);
        return films;
    }
}
