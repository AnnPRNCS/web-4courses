<%@ page import="main.Main, java.util.*, main.Board, main.Cell, main.Figure, main.FigureBoard"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<% Board board = Main.methodForBoard.getBoard();
List<Cell> listWidth = board.getBoards();
pageContext.setAttribute("listWidth", listWidth);
FigureBoard figureBoard = Main.methodForBoard.getFigureBoard();
Figure[][] figureArray = figureBoard.getBoardFigure();
pageContext.setAttribute("figureBoard", figureArray);
String val = null;
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
    .glav {
    position:absolute;
    top:10px;
    left:10px;
    border: 4px double black;
    width:400px;
    height:400px;
    }
    .whiteFigure{
    position:relative;
    left:10px;
    top:10px;
    background:white;
    width:30px;
    height:30px;
    text-align:  center;
    border: 1px solid black;
    }
    .blackFigure{
    position:relative;
    left:10px;
    top:10px;
    background:black;
    width:30px;
    height:30px;
    text-align:  center;
    border: 1px solid white;
    color:white;
    }
    .blackCell {
    background:black;
    width:50px;
    height:50px;
    }
    .whiteCell {
    background:white;
    width:50px;
    height:50px;
    }
    .coordinate0Width{
    position:absolute;
    left:0px;
    }
    .coordinate0Height{
    position:absolute;
    top:0px;
    }
    .coordinate1Width{
    position:absolute;
    left:50px;
    }
    .coordinate1Height{
    position:absolute;
    top:50px;
    }
    .coordinate2Width{
    position:absolute;
    left:100px;
    }
    .coordinate2Height{
    position:absolute;
    top:100px;
    }
    .coordinate3Width{
    position:absolute;
    left:150px;
    }
    .coordinate3Height{
    position:absolute;
    top:150px;
    }
    .coordinate4Width{
    position:absolute;
    left:200px;
    }
    .coordinate4Height{
    position:absolute;
    top:200px;
    }
    .coordinate5Width{
    position:absolute;
    left:250px;
    }
    .coordinate5Height{
    position:absolute;
    top:250px;
    }
    .coordinate6Width{
    position:absolute;
    left:300px;
    }
    .coordinate6Height{
    position:absolute;
    top:300px;
    }
    .coordinate7Width{
    position:absolute;
    left:350px;
    }
    .coordinate7Height{
    position:absolute;
    top:350px;
    }
    .backlight{
    background:red;
    width:50px;
    height:50px;
    border:1px solid black;
    }
    </style>
    <script>
    function click(event){
        var class_list = event.classList;
        var classOne = class_list[0];
        var classTwo = class_list[1];
    }
    </script>
</head>
<body>
<%String type = request.getParameter("type");
          String value = request.getParameter("value");
          String width = request.getParameter("width");
          String height = request.getParameter("height");
          if (Main.methodForBoard.getType() != null &&
                  Main.methodForBoard.getValue() != null &&
                  Main.methodForBoard.getWidth() != null &&
                  Main.methodForBoard.getHeight() != null &&
                  value==null) {
              Main.methodForBoard.changeFigure(Integer.valueOf(width), Integer.valueOf(height), new Cell(type, Integer.valueOf(width), Integer.valueOf(height)));
              Main.methodForBoard.setType(null);
              Main.methodForBoard.setValue(null);
              Main.methodForBoard.setWidth(null);
              Main.methodForBoard.setHeight(null);
              Main.methodForBoard.getBoard().startBoard();
          } else if (Main.methodForBoard.getType() != null &&
                  Main.methodForBoard.getValue() != null &&
                  Main.methodForBoard.getWidth() != null &&
                  Main.methodForBoard.getHeight() != null) {
              Main.methodForBoard.getBoard().startBoard();
              Main.methodForBoard.setType(null);
              Main.methodForBoard.setValue(null);
              Main.methodForBoard.setWidth(null);
              Main.methodForBoard.setHeight(null);
          } else if (type != null && value != null && width != null && height != null) {

              Main.methodForBoard.backlight(new Figure(type, Integer.valueOf(width), Integer.valueOf(height), value.charAt(0)));
              Main.methodForBoard.setType(type);
              Main.methodForBoard.setValue(value);
              Main.methodForBoard.setWidth(width);
              Main.methodForBoard.setHeight(height);
          } else {
              Main.methodForBoard.getBoard().startBoard();
          }%>
<div class="glav">
    <c:forEach var="itemWidth" items="${listWidth}" >
             <a href="?type=${itemWidth.getType()}&width=${itemWidth.getWidth()}&height=${itemWidth.getHeight()}"class="${itemWidth.getType()} ${itemWidth.getCoordinate()}"></a>
    </c:forEach>
<c:forEach var="figure" items="${figureBoard}">
<c:forEach var="figureTwo" items="${figure}">
<c:if test="${figureTwo!=null}">

<a href="?type=${figureTwo.getType()}&value=${figureTwo.getValue()}&width=${figureTwo.getWidth()}&height=${figureTwo.getHeight()}"
class="${figureTwo.getType()} ${figureTwo.getCoordinate()}">${figureTwo.getValue()}</a>
</c:if>
</c:forEach>
</c:forEach>

</div>

</body>
</html>
