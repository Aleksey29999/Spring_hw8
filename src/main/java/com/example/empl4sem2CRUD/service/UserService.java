package com.example.empl4sem2CRUD.service;

import com.example.empl4sem2CRUD.aspect.TrackUserAction;
import com.example.empl4sem2CRUD.model.User;
import com.example.empl4sem2CRUD.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

@TrackUserAction //добавлена аннотоция указывающая  точку куда будет добавлен новый метод после выполнения основного метода
    public List<User> findAll(){
        return userRepository.findAll();
    }
    @TrackUserAction  //добавлена аннотоция указывающая  точку куда будет добавлен новый метод после выполнения основного метода
    public User saveUser(User user){
        return userRepository.save(user);
    }

    public void deleteById(int id){ userRepository.deleteById(id);}

    public void update(User user){ userRepository.update(user);}
    @TrackUserAction //добавлена аннотоция указывающая  точку куда будет добавлен новый метод после выполнения основного метода
    public User getOne(int id){ return userRepository.getOne(id);}

}
