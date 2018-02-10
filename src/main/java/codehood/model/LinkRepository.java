package codehood.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anarayan on 12/4/17.
 */
public class LinkRepository {

    private List<Link> links;

    public LinkRepository() {
        this.links = new ArrayList<>();
        links.add(new Link("http://howtographql.com", "Your favorite GraphQL page"));
        links.add(new Link("http://graphql.org/learn/", "The official docs"));
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }
}
