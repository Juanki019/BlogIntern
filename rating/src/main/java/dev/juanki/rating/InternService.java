package dev.juanki.rating;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InternService {

    @Autowired
    private InternRepository internRepository;

    public List<Intern> allInterns(){
        return internRepository.findAll();
    }

    public Optional<Intern> getInternByImdbId(String imdbId) {
        return internRepository.findByImdbId(imdbId);
    }

}
