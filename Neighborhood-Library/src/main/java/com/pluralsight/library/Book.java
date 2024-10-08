package com.pluralsight.library;

public class Book {
    private int id;
    private String title;
    private String isbn;
    private String checkedOutTo;
    private boolean isCheckedOut;

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(" Id:").append(id);
        sb.append(" The Book Title is: ").append(title);
        sb.append(" The Book is checked out: ").append(isCheckedOut);
        sb.append(" This Book is checked out to: ").append(checkedOutTo);
        sb.append(" ISBN: ").append(isbn);
        return sb.toString();




    }

    public Book(String title, String isbn, Boolean isCheckedOut, String checkedOutTo, int id) {
        this.title = title;
        this.isbn = isbn;
        this.id = id;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }
}



