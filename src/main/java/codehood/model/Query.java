package codehood.model;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.coxautodev.graphql.tools.GraphQLResolver;

import java.util.List;

/**
 * Created by anarayan on 12/4/17.
 */
public class Query implements GraphQLQueryResolver {

    private final LinkRepository linkRepository;

    public Query(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public List<Link> allLinks() {
        return linkRepository.getLinks();
    }
}
