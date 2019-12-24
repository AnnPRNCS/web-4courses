package main;

public class Cell {
    private String type;
    private int width;
    private int height;

    private Cell(){};
    public Cell(final String type, final int width, final int height) {
        this.type = type;
        this.width = width;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(final int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(final int height) {
        this.height = height;
    }
    public String getCoordinate(){
        return "coordinate"+width+"Width coordinate"+height+"Height";
    }

}
