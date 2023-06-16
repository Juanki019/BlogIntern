package dev.juanki.rating;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "ratings-api-db")

@Data   // for gettern and setters
@AllArgsConstructor // for constructor with all arguments
@NoArgsConstructor // for constructor with no arguments

public class Intern {
    @Id
    private ObjectId id;

    private String imdbId;

    private String title;

    private String releaseDate;

    private String trailerLink;

    private String poster;

    private List<String> genres;

    private List<String> backdrops;

    @DocumentReference // this is the annotation for the reference
    private List<Review> reviewIds;


}
