package org.library.LibraryAPI.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private List<String> author;
    private String isbn;
    private int quantity;
    private int quantityAvailable;
    private boolean isAdultContent;

    @ManyToOne
    private Genre genre;

    @ManyToOne
    private Series series;
}
