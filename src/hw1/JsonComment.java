package hw1;

public class JsonComment {
    int postId;
    int id;
    String name;
    String email;
    String body;

    public JsonComment(int postId, int id, String name, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }
}
