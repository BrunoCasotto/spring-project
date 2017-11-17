package com.spring.project.springproject.dao;

import com.spring.project.springproject.models.IBanner;
import com.spring.project.springproject.models.ImageBanner;
import com.spring.project.springproject.repositories.ImageBannerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageBannerDao implements IBannerDao {

    @Autowired
    private ImageBannerRepository imageBannerRepository;

    @Override
    public ImageBanner insert(IBanner banner){
        try {
            return imageBannerRepository.insert((ImageBanner) banner);
        } catch(NullPointerException nullPointerError) {
            System.out.println("ERROR"+nullPointerError);
            return (ImageBanner) banner;
        }
    }
}
