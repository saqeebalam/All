package com.myblog.bloggapp.repositories;

import com.myblog.bloggapp.entites.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
