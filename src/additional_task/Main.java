package additional_task;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Post post1 = new Post(1,1,"sunt aut facere repellat provident occaecati excepturi optio reprehenderit","quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");
        Post post2 = new Post(1,2,"qui est esse","est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla");
        Post post3 = new Post(1,3, "ea molestias quasi exercitationem repellat qui ipsa sit aut", "et iusto sed quo iure\nvoluptatem occaecati omnis eligendi aut ad\nvoluptatem doloribus vel accusantium quis pariatur\nmolestiae porro eius odio et labore et velit aut");
        ArrayList<Post> postArrayList = new ArrayList<>();
        Collections.addAll(postArrayList, post1, post2, post3);

        Comment comment1 = new Comment(1, 1, "id labore ex et quam laborum", "Eliseo@gardner.biz", "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium");
        Comment comment2 = new Comment(1,2,"quo vero reiciendis velit similique earum","Jayne_Kuhic@sydney.com","est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati quod ullam at\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem reiciendis et");
        Comment comment3 = new Comment(1,3,"odio adipisci rerum aut animi","Nikita@garfield.biz", "quia molestiae reprehenderit quasi aspernatur\naut expedita occaecati aliquam eveniet laudantium\nomnis quibusdam delectus saepe quia accusamus maiores nam est\ncum et ducimus et vero voluptates excepturi deleniti ratione");

        Comment comment4 = new Comment(2,7,"repellat consequatur praesentium vel minus molestias voluptatum","Dallas@ole.me","maiores sed dolores similique labore et inventore et\nquasi temporibus esse sunt id et\neos voluptatem aliquam\naliquid ratione corporis molestiae mollitia quia et magnam dolor");
        Comment comment5 = new Comment(2,8,"et omnis dolorem","Mallory_Kunze@marie.org","ut voluptatem corrupti velit\nad voluptatem maiores\net nisi velit vero accusamus maiores\nvoluptates quia aliquid ullam eaque");

        Comment comment6 = new Comment(3,13,"aut inventore non pariatur sit vitae voluptatem sapiente","Kariane@jadyn.tv","fuga eos qui dolor rerum\ninventore corporis exercitationem\ncorporis cupiditate et deserunt recusandae est sed quis culpa\neum maiores corporis et");
        Comment comment7 = new Comment(3,14,"et officiis id praesentium hic aut ipsa dolorem repudiandae","Nathan@solon.io","vel quae voluptas qui exercitationem\nvoluptatibus unde sed\nminima et qui ipsam aspernatur\nexpedita magnam laudantium et et quaerat ut qui dolorum");
        Comment comment8 = new Comment(3,15,"debitis magnam hic odit aut ullam nostrum tenetur","Maynard.Hodkiewicz@roberta.com","nihil ut voluptates blanditiis autem odio dicta rerum\nquisquam saepe et est\nsunt quasi nemo laudantium deserunt\nmolestias tempora quo quia");
        ArrayList<Comment> commentArrayList = new ArrayList<>();
        Collections.addAll(commentArrayList, comment1, comment2, comment3, comment4, comment5, comment6, comment7, comment8);


        for (Comment comment : commentArrayList) {
            for (Post post : postArrayList) {
                if (comment.postId == post.id){
                    post.comments.add(comment);
                }
            }
        }
        System.out.println(postArrayList);
    }
}
