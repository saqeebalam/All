package com.myblog.bloggapp.services.impl;

import com.myblog.bloggapp.entites.Post;
import com.myblog.bloggapp.exception.ResourceNotFoundException;
import com.myblog.bloggapp.payload.PostDto;
import com.myblog.bloggapp.repositories.PostRepository;
import com.myblog.bloggapp.services.PostService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {

       PostRepository postRepo;

    public PostServiceImpl(PostRepository postRepo) {
        this.postRepo = postRepo;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        //converting dto to post method
        Post post = dtoToPostEntity(postDto);
        Post postEntity = postRepo.save(post);
        //converting Post To Dto
        return postToDtoEntity(postEntity);

    }

    @Override
    public List<PostDto> getAllPost(int pageNo,int pageSize) {
       // System.out.println("getAllPost Method Called");
        Pageable pageable = PageRequest.of(pageNo,pageSize);
        Page<Post> all = postRepo.findAll(pageable);
        List<Post> content = all.getContent();
        //List<Post> posts = postRepo.findAll();
        //System.out.println("Post object created="+posts);
        //return posts;
       // System.out.println(posts.toArray());
        List<Post> collect = content.stream().map(x -> x).collect(Collectors.toList());
        //System.out.println("List of Posts="+collect);
        return content.stream().map(post -> postToDtoEntity(post)).collect(Collectors.toList());

    }

    @Override
    public PostDto getPostById(long id) {
        Post post= postRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("post","id",id));
        return postToDtoEntity(post);

    }

    @Override
    public PostDto updatePost(PostDto postDto, long id) {
        Post post = postRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));

        // Post post=new Post();
        //post1.setId(id);
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        Post save = postRepo.save(post);
        //System.out.println("Post object"+save);

        PostDto postDto1 = postToDtoEntity(save);
        //System.out.println("Dto object="+postDto1);
        return postDto1;

    }

    @Override
    public void deleteByid(long id) {
        postRepo.deleteById(id);
    }


    public Post dtoToPostEntity(PostDto postDto){
        Post post=new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        return post;
    }

    public PostDto postToDtoEntity(Post postEntity){
        PostDto  dto=new PostDto();
        dto.setId(postEntity.getId());
        dto.setTitle(postEntity.getTitle());
        dto.setDescription(postEntity.getDescription());
        dto.setContent(postEntity.getContent());
        return dto;
    }

}
