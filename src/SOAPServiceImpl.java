import models.Article;

import java.util.ArrayList;
import java.util.List;

public class SOAPServiceImpl {
    private List<Article> articles = new ArrayList<>();



    public boolean addArticle(Article article)  {
        if (!articles.contains(article)) {
            articles.add(article);
            return true;
        }

        return false;
    }

    public boolean updArticle(Article someArticle) {
        for (Article article : articles) {
            if (someArticle.getId() == article.getId()) {
                article.setTitle(someArticle.getTitle());
                article.setAuthor(someArticle.getAuthor());
                article.setDate(someArticle.getDate());
                return true;
            }

        }

        return false;
    }


    public boolean delArticle(Article article)  {
        if (articles.remove(article)) {
            return true;
        }
        return false;
    }


    public  Article getArticle(String articleTitle)  {
        for (Article article : articles){
            if(article.getTitle().equals(articleTitle)){
                return article;
            }
        }
        return null;
    }


    public Article[] fetchArticleList()  {
        return articles.toArray(new Article[articles.size()]);
    }

}
