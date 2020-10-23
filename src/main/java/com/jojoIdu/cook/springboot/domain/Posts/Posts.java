package com.jojoIdu.cook.springboot.domain.Posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Getter
@NoArgsConstructor
@Entity
public class Posts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(length = 500,nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT",nullable = false)
    private String content;

    private String author;

//객체 생성 패턴
    @Builder
    public  Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

}
