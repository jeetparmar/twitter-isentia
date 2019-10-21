package twitter.isentia

class Query {
    Integer id
    String query

    static constraints = {
        query nullable: false
    }
}
