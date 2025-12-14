package Mentor.L6.Task2;

public class Book {

    private String name;
    private String author;
    private int pageCount;

    public Book(String name, String author, int pageCount) {
        this.name = name;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getName() {
        System.out.println("Kitabın adı: " + name);
        return name;
    }
    public String getAuthor() {
        System.out.println("Kitabın Yazarı: " + author);
        return author;
    }

    public int getPageCount() {
        System.out.println("Kitabın səhifə sayı: " + pageCount);
        return pageCount;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    public int setPageCount(int pageCount) {
        this.pageCount = pageCount;
        return pageCount;
    }


}

