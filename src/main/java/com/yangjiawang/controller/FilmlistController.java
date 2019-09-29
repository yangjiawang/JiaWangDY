package com.yangjiawang.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.yangjiawang.domain.Film;
import com.yangjiawang.service.FilmlistServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author YANGJIAWANG
 * @DATE 2019/9/15
 * @TIME 19:19
 **/
@CrossOrigin(origins = "http://47.101.214.228",allowCredentials="true",allowedHeaders = "*")
@RestController
@RequestMapping("/Film")
public class FilmlistController {
    @Autowired
     private FilmlistServiceImpl filmlistService;
//    @RequestMapping(value = "/image")
//    public String  image(HttpServletRequest request, MultipartFile img)throws  Exception {
//        File file1=new File("D:\\Tomcat9\\webapps\\image");
//        String filname=img.getOriginalFilename();
//        img.transferTo(new File(file1,filname));
//        String a="图片上传成功";
//        return null;
//    }
    
    @RequestMapping("/inset")
    public int  insert(Film film){
        filmlistService.Insert(film);
        return 1;
    }

    @RequestMapping("/select")
    public List<Film> select(){

       List<Film> film= filmlistService.select();
        System.out.println(film.toString());
        return film;
    }
    @RequestMapping("/select2")
    public List<Film> select2(String name){
       List<Film> films=filmlistService.select2(name);

        return films;
    }
}
