package com.example.My_veille.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.My_veille.models.Post;
import com.example.My_veille.repositories.PostRepositories;

@Service
public class PostServices {
    
    @Autowired
    private PostRepositories postRepositories;

    public Optional<Post> getById(Long id){
        return postRepositories.findById(id);
    }

    public List<Post> getALL() {
        return postRepositories.findAll();
    }

    public Post save(Post post){
        if (post.getId() == null ){
            post.setCreatedAt(LocalDateTime.now());
        }

        return postRepositories.save(post);
    }
}
