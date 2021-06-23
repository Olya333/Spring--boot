package com.itprogect.blog.repo;

import com.itprogect.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository <Post,Long> {

}
