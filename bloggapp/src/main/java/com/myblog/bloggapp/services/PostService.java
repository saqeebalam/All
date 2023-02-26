package com.myblog.bloggapp.services;

import com.myblog.bloggapp.entites.Post;
import com.myblog.bloggapp.payload.PostDto;

import java.util.List;

public interface PostService {
    PostDto createPost(PostDto postDto);
    List<PostDto> getAllPost(int pageNo,int pageSize);

    PostDto getPostById(long id);
    PostDto updatePost(PostDto postDto,long id);
    void deleteByid(long id);


}
