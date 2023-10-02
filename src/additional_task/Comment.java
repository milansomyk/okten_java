package additional_task;

public class Comment {
    int postId;
    int id;
    String name;
    String email;
    String body;

    public Comment(int postId, int id, String name, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }

    @Override
    public String toString() {
        return "Comment{" + "\n"+
                "postId=" + postId + "\n"+
                "id=" + id + "\n"+
                "name='" + name + "\n"+
                "email='" + email + "\n"+
                "body='" + body +
                '}'+"\n";
    }
}
