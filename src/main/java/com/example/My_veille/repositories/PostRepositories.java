package com.example.My_veille.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.My_veille.models.Post;

@Repository

public interface PostRepositories extends JpaRepository<Post, Long> {
    
}
