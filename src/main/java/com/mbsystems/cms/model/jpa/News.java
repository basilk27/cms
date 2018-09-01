package com.mbsystems.cms.model.jpa;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class News {

    private String id;
    private String title;
    private String content;
    private User author;
    private Set<User> mandatoryReviewers;
    private Set<Review> reviewers;
    private Set< Category > categories;
    private Set<Tag> tags;
}
