package com.example.HappySocialMedia.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.validation.constraints.NotBlank;
import java.time.Instant;

import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;
import static javax.persistence.FetchType.LAZY;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    // Create a Post model that contains postID, postName, description, user and createdDate
    @Id
    // Auto increase the postID by one each time a new post is created
    @GeneratedValue(strategy = IDENTITY)
    private Long postId;
    @NotBlank(message = "Post Name must not be empty or null")
    private String postName;
    @Nullable
    @Lob
    private String description;
    // marks a column for as a join column for an entity association or an element collection
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    @ManyToOne(fetch = LAZY)
    private User user;
    private Instant createdDate;
}