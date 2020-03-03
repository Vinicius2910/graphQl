# Zé Challenge solution
A application with GraphQL and Spring Boot

Instructions to run the project:

- Do download for your own machine.

- Open your prefer IDEA and import the project;
- Run the class "MySolutionApplication"
- Open the brownser and try to access the link: http://localhost:8080/graphiql  .

## Input Examples:
(Copy and past the String below in the browser)
- Mutation:  <br>

    mutation {
    createPvd(tradingName: "Adega da Cerveja - Pinheiros", ownerName: "Zé do delivery", document: "1432132123891/0001") 
        {
            id
        }
    }

- Query: <br>
    query {
     pvd(id: 1) 
        {
            id,
            tradingName,
            ownerName,
            document
        }
    }

## Technologies used in the project:

- Java <br>
- GraphQl <br>
- Spring Boot/ Spring DevTools/ Spring Data JPA <br>
- Hibernate <br>
- Lombok <br>
- H2 DB <br>
