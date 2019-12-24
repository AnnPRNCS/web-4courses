package main;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Cell> boards;
    public Board(){
        String blackCell = "blackCell";
        String whiteCell = "whiteCell";
        boards = new ArrayList<>();
        boolean typeCell=true;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(typeCell) {
                    boards.add(new Cell(whiteCell, j, i));
                }else{
                    boards.add(new Cell(blackCell, j, i));
                }
                if(typeCell){
                    typeCell=false;
                }else{
                    typeCell=true;
                }
            }
            if(typeCell){
                typeCell=false;
            }else{
                typeCell=true;
            }
        }
    }
    public Cell getElement(int width, int height){
        return boards.get(height*8+width);
    }
    public void changeElement(int width, int height, Cell cell){
        boards.set(height*8+width, cell);
    }
    public List<Cell> getBoards(){
        return boards;
    }
    public void startBoard(){
        String blackCell = "blackCell";
        String whiteCell = "whiteCell";
        boolean typeCell=true;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(typeCell) {
                    changeElement(j,i,new Cell(whiteCell, j, i));
                }else{
                    changeElement(j,i,new Cell(blackCell, j, i));
                }
                if(typeCell){
                    typeCell=false;
                }else{
                    typeCell=true;
                }
            }
            if(typeCell){
                typeCell=false;
            }else{
                typeCell=true;
            }
        }
    }
}
