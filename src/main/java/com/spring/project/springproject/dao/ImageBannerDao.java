package com.spring.project.springproject.dao;

import com.spring.project.springproject.models.ImageBanner;import com.spring.project.springproject.repositories.ImageBannerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageBannerDao implements IBannerDao {

    private ImageBanner imageBanner;

    @Autowired
    private ImageBannerRepository imageBannerRepository;

    public Object insert(Object banner){
        return imageBannerRepository.insert((ImageBanner)banner);
    }
}
