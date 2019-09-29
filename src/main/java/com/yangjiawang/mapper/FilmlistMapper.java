package com.yangjiawang.mapper;

import com.yangjiawang.domain.Film;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author YANGJIAWANG
 * @DATE 2019/9/17
 * @TIME 15:26
 **/
@Repository
public interface FilmlistMapper {

    @Insert("insert into Film values(NULL,#{filename},#{movielinks},#{showtime})")
    public void Insert(Film film);

    @Select("SELECT * FROM Film ORDER BY RAND() LIMIT 20")
    public List<Film> select();

    @Select("select * from Film where  filename like '%${name}%'")
    public List<Film> select2(@Param("name") String name);
}
