package main;

import java.util.ArrayList;
import java.util.List;

public class MethodForBoard {
    private Board board;
    private FigureBoard figureBoard;
    private String type;
    private String value;
    private String width;
    private String height;
    boolean nextCell=true;

    public MethodForBoard(Board board, FigureBoard figureBoard) {
        this.board = board;
        this.figureBoard = figureBoard;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(final Board board) {
        this.board = board;
    }

    public FigureBoard getFigureBoard() {
        return figureBoard;
    }

    public void setFigureBoard(final FigureBoard figureBoard) {
        this.figureBoard = figureBoard;
    }

    private void changeElement(int width, int height, Cell cell,char value) {

        if(value=='N'){
            if (figureBoard.getFigure(width, height) == null) {
                board.changeElement(width, height, cell);
            }
        }else {
            if (figureBoard.getFigure(width, height) == null) {
                board.changeElement(width, height, cell);
            } else {
            }
        }
    }

    public List<Cell> backlight(Figure figure) {
        List<Cell> backlightBoard = new ArrayList<>();
        String type = figure.getType();
        int width = figure.getWidth();
        int height = figure.getHeight();
        char value = figure.getValue();
        int widthForR = width;
        int heightForR = height;
        switch (value) {
            case ('p'):
                switch (height) {
                    case (1):
                        changeElement(width, height + 1, new Cell("backlight", width, height + 1),value);
                        changeElement(width, height + 2, new Cell("backlight", width, height + 2),value);
                        break;
                    case (6):
                        changeElement(width, height - 1, new Cell("backlight", width, height - 1),value);
                        changeElement(width, height - 2, new Cell("backlight", width, height - 2),value);
                        break;
                    default:
                        if (type.equals("blackFigure")) {
                            if (height > 0) {
                                changeElement(width, height - 1, new Cell("backlight", width, height - 1),value);
                            }
                        }
                        if (type.equals("whiteFigure")) {
                            if (height < 7) {
                                changeElement(width, height + 1, new Cell("backlight", width, height + 1),value);
                            }
                        }
                        changeElement(width, height, new Cell("backlight", width, height),value);
                        break;
                }
                break;
            case ('R'):
                for (int i = 0; i < 8; i++) {
                    changeElement(width, i, new Cell("backlight", width, i),value);
                    changeElement(i, height, new Cell("backlight", i, height),value);
                }
                break;
            case ('N'):
                if (height + 2 <= 7) {
                    if (width + 1 <= 7) {
                        changeElement(width + 1, height + 2, new Cell("backlight", width + 1, height + 2),value);
                    }
                    if (width - 1 >= 0) {
                        changeElement(width - 1, height + 2, new Cell("backlight", width - 1, height + 2),value);
                    }
                }
                if (height - 2 >= 0) {
                    if (width + 1 <= 7) {
                        changeElement(width + 1, height - 2, new Cell("backlight", width + 1, height - 2),value);
                    }
                    if (width - 1 >= 0) {
                        changeElement(width - 1, height - 2, new Cell("backlight", width - 1, height - 2),value);
                    }
                }
                if (width + 2 <= 7) {
                    if (height + 1 <= 7) {
                        changeElement(width + 2, height + 1, new Cell("backlight", width + 2, height + 1),value);
                    }
                    if (height - 1 >= 0) {
                        changeElement(width + 2, height - 1, new Cell("backlight", width + 2, height - 1),value);
                    }
                }
                if (width - 2 >= 0) {
                    if (height + 1 <= 7) {
                        changeElement(width - 2, height + 1, new Cell("backlight", width - 2, height + 1),value);
                    }
                    if (height - 1 >= 0) {
                        changeElement(width - 2, height - 1, new Cell("backlight", width - 2, height - 1),value);
                    }
                }
                break;
            case ('B'):
                widthForR = width;
                heightForR = height;
                while (widthForR != 8 && heightForR != -1) {
                    changeElement(widthForR, heightForR, new Cell("backlight", widthForR, heightForR),value);
                    widthForR++;
                    heightForR--;
                }
                widthForR = width;
                heightForR = height;
                while (widthForR != -1 && heightForR != -1) {
                    changeElement(widthForR, heightForR, new Cell("backlight", widthForR, heightForR),value);
                    widthForR--;
                    heightForR--;
                }
                widthForR = width;
                heightForR = height;
                while (widthForR != 8 && heightForR != 8) {
                    changeElement(widthForR, heightForR, new Cell("backlight", widthForR, heightForR),value);
                    widthForR++;
                    heightForR++;
                }
                widthForR = width;
                heightForR = height;
                while (widthForR != -1 && heightForR != 8) {
                    changeElement(widthForR, heightForR, new Cell("backlight", widthForR, heightForR),value);
                    widthForR--;
                    heightForR++;
                }
                break;
            case ('Q'):
                for (int i = 0; i < 8; i++) {
                    changeElement(width, i, new Cell("backlight", width, i),value);
                    changeElement(i, height, new Cell("backlight", i, height),value);
                }
                widthForR = width;
                heightForR = height;
                while (widthForR != 8 && heightForR != -1) {
                    changeElement(widthForR, heightForR, new Cell("backlight", widthForR, heightForR),value);
                    widthForR++;
                    heightForR--;
                }
                widthForR = width;
                heightForR = height;
                while (widthForR != -1 && heightForR != -1) {
                    changeElement(widthForR, heightForR, new Cell("backlight", widthForR, heightForR),value);
                    widthForR--;
                    heightForR--;
                }
                widthForR = width;
                heightForR = height;
                while (widthForR != 8 && heightForR != 8) {
                    changeElement(widthForR, heightForR, new Cell("backlight", widthForR, heightForR),value);
                    widthForR++;
                    heightForR++;
                }
                widthForR = width;
                heightForR = height;
                while (widthForR != -1 && heightForR != 8) {
                    changeElement(widthForR, heightForR, new Cell("backlight", widthForR, heightForR),value);
                    widthForR--;
                    heightForR++;
                }
                break;
            case ('K'):
                widthForR = width;
                heightForR = height;
                if (widthForR != 7) {
                    changeElement(width + 1, height, new Cell("backlight", width + 1, height),value);
                    if (heightForR != 0) {
                        changeElement(width + 1, height - 1, new Cell("backlight", width + 1, height - 1),value);
                    }
                }
                if (heightForR != 0) {
                    changeElement(width, height - 1, new Cell("backlight", width, height - 1),value);
                    if (widthForR != 0) {
                        changeElement(width - 1, height - 1, new Cell("backlight", width - 1, height - 1),value);
                    }
                }
                if (heightForR != 7) {
                    changeElement(width, height + 1, new Cell("backlight", width, height + 1),value);
                    if (widthForR != 7) {
                        changeElement(width + 1, height + 1, new Cell("backlight", width + 1, height + 1),value);
                    }
                }
                if (widthForR != 0) {
                    changeElement(width - 1, height, new Cell("backlight", width - 1, height),value);
                    if (heightForR != 7) {
                        changeElement(width - 1, height + 1, new Cell("backlight", width - 1, height + 1),value);
                    }
                }
                break;
            default:
                break;

        }
        nextCell=true;
        return backlightBoard;

    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(final String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(final String height) {
        this.height = height;
    }

    public void changeFigure(final int newWidth, final int newHeigth, Cell cell) {
        if (cell.getType().equals("backlight")) {
            figureBoard.setFigure(newWidth, newHeigth, new Figure(type, Integer.valueOf(width), Integer.valueOf(height), value.charAt(0)));
        }



    }


}
