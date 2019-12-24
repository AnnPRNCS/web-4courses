package main;

import main.Figure;

public class FigureBoard {
    private Figure[][] boardFigure;

    public FigureBoard(){
        boardFigure = new Figure[8][8];
        String blackCell = "blackFigure";
        String whiteCell = "whiteFigure";
        boardFigure[0][0]= new Figure(whiteCell,0,0,'R');
        boardFigure[1][0]= new Figure(whiteCell,1,0,'N');
        boardFigure[2][0]= new Figure(whiteCell,2,0,'B');
        boardFigure[3][0]= new Figure(whiteCell,3,0,'Q');
        boardFigure[4][0]= new Figure(whiteCell,4,0,'K');
        boardFigure[5][0]= new Figure(whiteCell,5,0,'B');
        boardFigure[6][0]= new Figure(whiteCell,6,0,'N');
        boardFigure[7][0]= new Figure(whiteCell,7,0,'R');

        boardFigure[0][1]= new Figure(whiteCell,0,1,'p');
        boardFigure[1][1]= new Figure(whiteCell,1,1,'p');
        boardFigure[2][1]= new Figure(whiteCell,2,1,'p');
        boardFigure[3][1]= new Figure(whiteCell,3,1,'p');
        boardFigure[4][1]= new Figure(whiteCell,4,1,'p');
        boardFigure[5][1]= new Figure(whiteCell,5,1,'p');
        boardFigure[6][1]= new Figure(whiteCell,6,1,'p');
        boardFigure[7][1]= new Figure(whiteCell,7,1,'p');

        boardFigure[0][6]= new Figure(blackCell,0,6,'p');
        boardFigure[1][6]= new Figure(blackCell,1,6,'p');
        boardFigure[2][6]= new Figure(blackCell,2,6,'p');
        boardFigure[3][6]= new Figure(blackCell,3,6,'p');
        boardFigure[4][6]= new Figure(blackCell,4,6,'p');
        boardFigure[5][6]= new Figure(blackCell,5,6,'p');
        boardFigure[6][6]= new Figure(blackCell,6,6,'p');
        boardFigure[7][6]= new Figure(blackCell,7,6,'p');

        boardFigure[0][7]=new Figure(blackCell,0,7,'R');
        boardFigure[1][7]=new Figure(blackCell,1,7,'N');
        boardFigure[2][7]=new Figure(blackCell,2,7,'B');
        boardFigure[3][7]=new Figure(blackCell,3,7,'Q');
        boardFigure[4][7]=new Figure(blackCell,4,7,'K');
        boardFigure[5][7]=new Figure(blackCell,5,7,'B');
        boardFigure[6][7]=new Figure(blackCell,6,7,'N');
        boardFigure[7][7]=new Figure(blackCell,7,7,'R');
    }
    public Figure getFigure(int width, int height){
        return boardFigure[width][height];
    }
    public void setFigure(int width, int height, Figure figure){
        boardFigure[figure.getWidth()][figure.getHeight()]=null;
        figure.setWidth(width);
        figure.setHeight(height);
        boardFigure[width][height]=figure;
    }
    public Figure[][] getBoardFigure(){
        return boardFigure;
    }
}
