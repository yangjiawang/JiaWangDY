package com.yangjiawang.service;

import com.yangjiawang.domain.Film;

import java.util.List;

/**
 * @author YANGJIAWANG
 * @DATE 2019/9/17
 * @TIME 15:47
 **/

public interface FilmlistService {

    public void Insert(Film film);

    public List<Film> select();

    public List<Film> select2(String name);
}
