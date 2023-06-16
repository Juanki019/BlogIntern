package dev.juanki.rating;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/interns")
public class InternController {

    @Autowired
    private InternService internService;

    @GetMapping
    public ResponseEntity<List<Intern>> getAllInterns() {
        return new ResponseEntity<List<Intern>>(internService.allInterns(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Intern>> getInternsId(@PathVariable ObjectId id) {
        return new ResponseEntity<Optional<Intern>>(internService.getInternById(id), HttpStatus.OK);
    }

    @GetMapping("/{imdbid}/imdbid")
    public ResponseEntity<Optional<Intern>> getInternsId(@PathVariable String imdbid) {
        return new ResponseEntity<Optional<Intern>>(internService.getInternByImdbId(imdbid), HttpStatus.OK);
    }


}
