package codehood.controller;


import codehood.model.LinkRepository;
import codehood.model.Query;
import com.coxautodev.graphql.tools.SchemaParser;
import graphql.ExceptionWhileDataFetching;
import graphql.GraphQLError;
import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;

import javax.servlet.annotation.WebServlet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by anarayan on 12/3/17.
 * Controller that creates graphql server based on the defined schema
 */
@WebServlet(urlPatterns = "/graphql")
public class GraphQLServerController extends SimpleGraphQLServlet{

    public GraphQLServerController(){
//        super(SchemaParser.newParser()
//                .file("schema.graphqls")
//                .build()
//                .makeExecutableSchema()
//        );

        super(buildSchema());
    }

    private static GraphQLSchema buildSchema() {

        LinkRepository linkRepository = new LinkRepository();
        return SchemaParser.newParser()
                .file("schema.graphqls")
                .resolvers(new Query(linkRepository))
                .build()
                .makeExecutableSchema();
    }

}
