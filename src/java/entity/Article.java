
package entity;

public class Article {
    private int id;
    private String title;
    private String description;
    private String image;
    private String createName;

    public Article() {
    }

    public Article(int id, String title, String description, String image, String createName) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.image = image;
        this.createName = createName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    @Override
    public String toString() {
        return "Article{" + "id=" + id + ", title=" + title + ", description=" + description + ", image=" + image + ", createName=" + createName + '}';
    }
    
    
}
