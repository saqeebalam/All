package com.myblog.bloggapp.controller;


import com.myblog.bloggapp.entites.Post;
import com.myblog.bloggapp.payload.PostDto;
import com.myblog.bloggapp.repositories.PostRepository;
import com.myblog.bloggapp.services.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//@ResponseBody
@RestController
@RequestMapping("/api/posts")
public class PostController {

    private PostService postService;
    private final PostRepository postRepository;

    public PostController(PostService postService,
                          PostRepository postRepository) {
        this.postService = postService;
        this.postRepository = postRepository;
    }
    @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto){
      return new ResponseEntity<>(postService.createPost(postDto), HttpStatus.CREATED);
    }


    @GetMapping
    public List<PostDto> getAllPost(@RequestParam(value = "pageNo",defaultValue = "0",required = false) int pageNo,
                                    @RequestParam(value = "pageSize",defaultValue = "10",required = false) int pageSize){

       System.out.println("GetMapping Method Called pageNo="+pageNo+" pageSize="+pageSize);
        List<PostDto> allPost = postService.getAllPost(pageNo,pageSize);
       // System.out.println("Return in getMapping Control="+allPost);
        return allPost;
    }
    @GetMapping("/byid/{id}")
    public ResponseEntity<PostDto> getById(@PathVariable("id") long id){
        //System.out.println("hello");
        //System.out.println("id="+id);
        PostDto postById = postService.getPostById(id);
        return ResponseEntity.ok(postById);

    }

    @PutMapping("/update/{id}")
    public ResponseEntity<PostDto> updateById(@RequestBody PostDto postDto,@PathVariable("id") long id){
        //System.out.println("hello");
        //postDto.setId(id);
        System.out.println("id="+id);
        PostDto postDto1 = postService.updatePost(postDto, id);
        return new ResponseEntity<>(postDto1, HttpStatus.OK);

    }
    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") long id){
        postService.deleteByid(id);
        return "Delete reord";
    }

}
