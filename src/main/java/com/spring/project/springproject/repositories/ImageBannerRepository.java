package com.spring.project.springproject.repositories;
import com.spring.project.springproject.models.ImageBanner;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ImageBannerRepository extends MongoRepository<ImageBanner, String> {
}
