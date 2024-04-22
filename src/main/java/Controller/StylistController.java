package Controller;

import Model.Stylist;
import Repository.StylistRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class StylistController  {
    private final StylistRepository stylistRepository;

    public StylistController(StylistRepository stylistRepository) {
        this.stylistRepository = stylistRepository;
    }
    @QueryMapping
    Iterable<Stylist> stylists(){
        return stylistRepository.findAll();
    }
}
