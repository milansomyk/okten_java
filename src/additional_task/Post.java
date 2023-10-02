package additional_task;

import java.util.ArrayList;

public class Post {
    int userId;
    int id;
    String title;
    String body;
    ArrayList<Comment> comments = new ArrayList<>();

    public Post(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }
    @Override
    public String toString() {
        return "Post{" +
                "\n"+
                "userId=" + userId + "\n"+
                "id=" + id + "\n"+
                "title='" + title + "\n" +
                "body='" + body + "\n" +
                "comments='"+comments+"\n"+
                '}'+"\n";
    }
}
