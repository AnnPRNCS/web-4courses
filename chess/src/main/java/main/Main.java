package main;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.naming.Context;
import javax.servlet.ServletException;
import java.io.File;

/*<body>
<div class="glav">
    <div class="wt <%= Main.getXAndY(1,1) %>" >
        <div class="smallWhite">N</div>
    </div>
    <div class="bl <%= Main.getXAndY(2,1) %>" >
        <div class="smallWhite">B</div>
    </div>
    <div class="wt <%= Main.getXAndY(3,1) %>" >
        <div class="smallWhite">R</div>
    </div>
    <div class="bl <%= Main.getXAndY(4,1) %>" >
        <div class="smallWhite">K</div>
    </div>
    <div class="wt <%= Main.getXAndY(5,1) %>" >
        <div class="smallWhite">Q</div>
    </div>
    <div class="bl <%= Main.getXAndY(6,1) %>" >
        <div class="smallWhite">R</div>
    </div>
    <div class="wt <%= Main.getXAndY(7,1) %>" >
        <div class="smallWhite">B</div>
    </div>
    <div class="bl <%= Main.getXAndY(8,1) %>" >
        <div class="smallWhite">N</div>
    </div>

    <div class="bl <%= Main.getXAndY(1,2) %>" >
        <div class="smallWhite">p</div>
    </div>
    <div class="wt <%= Main.getXAndY(2,2) %>" >
        <div class="smallWhite">p</div>
    </div>
    <div class="bl <%= Main.getXAndY(3,2) %>" >
        <div class="smallWhite">p</div>
    </div>
    <div class="wt <%= Main.getXAndY(4,2) %>" >
        <div class="smallWhite">p</div>
    </div>
    <div class="bl <%= Main.getXAndY(5,2) %>" >
        <div class="smallWhite">p</div>
    </div>
    <div class="wt <%= Main.getXAndY(6,2) %>" >
        <div class="smallWhite">p</div>
    </div>
    <div class="bl <%= Main.getXAndY(7,2) %>" >
        <div class="smallWhite">p</div>
    </div>
    <div class="wt <%= Main.getXAndY(8,2) %>" >
        <div class="smallWhite">p</div>
    </div>

    <div class="wt <%= Main.getXAndY(1,3) %>" ></div>
    <div class="bl <%= Main.getXAndY(2,3) %>" ></div>
    <div class="wt <%= Main.getXAndY(3,3) %>" ></div>
    <div class="bl <%= Main.getXAndY(4,3) %>" ></div>
    <div class="wt <%= Main.getXAndY(5,3) %>" ></div>
    <div class="bl <%= Main.getXAndY(6,3) %>" ></div>
    <div class="wt <%= Main.getXAndY(7,3) %>" ></div>
    <div class="bl <%= Main.getXAndY(8,3) %>" ></div>

    <div class="bl <%= Main.getXAndY(1,4) %>" ></div>
    <div class="wt <%= Main.getXAndY(2,4) %>" ></div>
    <div class="bl <%= Main.getXAndY(3,4) %>" ></div>
    <div class="wt <%= Main.getXAndY(4,4) %>" ></div>
    <div class="bl <%= Main.getXAndY(5,4) %>" ></div>
    <div class="wt <%= Main.getXAndY(6,4) %>" ></div>
    <div class="bl <%= Main.getXAndY(7,4) %>" ></div>
    <div class="wt <%= Main.getXAndY(8,4) %>" ></div>

    <div class="wt <%= Main.getXAndY(1,5) %>" ></div>
    <div class="bl <%= Main.getXAndY(2,5) %>" ></div>
    <div class="wt <%= Main.getXAndY(3,5) %>" ></div>
    <div class="bl <%= Main.getXAndY(4,5) %>" ></div>
    <div class="wt <%= Main.getXAndY(5,5) %>" ></div>
    <div class="bl <%= Main.getXAndY(6,5) %>" ></div>
    <div class="wt <%= Main.getXAndY(7,5) %>" ></div>
    <div class="bl <%= Main.getXAndY(8,5) %>" ></div>

    <div class="bl <%= Main.getXAndY(1,6) %>" ></div>
    <div class="wt <%= Main.getXAndY(2,6) %>" ></div>
    <div class="bl <%= Main.getXAndY(3,6) %>" ></div>
    <div class="wt <%= Main.getXAndY(4,6) %>" ></div>
    <div class="bl <%= Main.getXAndY(5,6) %>" ></div>
    <div class="wt <%= Main.getXAndY(6,6) %>" ></div>
    <div class="bl <%= Main.getXAndY(7,6) %>" ></div>
    <div class="wt <%= Main.getXAndY(8,6) %>" ></div>

    <div class="wt <%= Main.getXAndY(1,7) %>" >
        <div class="smallBlack">p</div>
    </div>
    <div class="bl <%= Main.getXAndY(2,7) %>" >
        <div class="smallBlack">p</div>
    </div>
    <div class="wt <%= Main.getXAndY(3,7) %>" >
        <div class="smallBlack">p</div>
    </div>
    <div class="bl <%= Main.getXAndY(4,7) %>" >
        <div class="smallBlack">p</div>
    </div>
    <div class="wt <%= Main.getXAndY(5,7) %>" >
        <div class="smallBlack">p</div>
    </div>
    <div class="bl <%= Main.getXAndY(6,7) %>" >
        <div class="smallBlack">p</div>
    </div>
    <div class="wt <%= Main.getXAndY(7,7) %>" >
        <div class="smallBlack">p</div>
    </div>
    <div class="bl <%= Main.getXAndY(8,7) %>" >
        <div class="smallBlack">p</div>
    </div>

    <div class="bl <%= Main.getXAndY(1,8) %>" >
        <div class="smallBlack">N</div>
    </div>
    <div class="wt <%= Main.getXAndY(2,8) %>" >
        <div class="smallBlack">B</div>
    </div>
    <div class="bl <%= Main.getXAndY(3,8) %>" >
        <div class="smallBlack">R</div>
    </div>
    <div class="wt <%= Main.getXAndY(4,8) %>" >
        <div class="smallBlack">K</div>
    </div>
    <div class="bl <%= Main.getXAndY(5,8) %>" >
        <div class="smallBlack">Q</div>
    </div>
    <div class="wt <%= Main.getXAndY(6,8) %>" >
        <div class="smallBlack">R</div>
    </div>
    <div class="bl <%= Main.getXAndY(7,8) %>" >
        <div class="smallBlack">B</div>
    </div>
    <div class="wt <%= Main.getXAndY(8,8) %>" >
        <div class="smallBlack">N</div>
    </div>


</div>

</body>*/
public class Main {
    public static MethodForBoard methodForBoard;
    public static String getXAndY(int x, int y){
        StringBuilder sb = new StringBuilder();
        sb.append("coordinate");
        sb.append(x);
        sb.append("Width");
        sb.append(" ");
        sb.append("coordinate");
        sb.append(y);
        sb.append("Height");
        return sb.toString();
    }
    public static void main(String[] args) throws LifecycleException, ServletException {
        methodForBoard= new MethodForBoard(new Board(),new FigureBoard());

       System.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.apache.naming.java.javaURLContextFactory");
        System.setProperty(Context.URL_PKG_PREFIXES, "org.apache.naming");
        Tomcat tomcat = new Tomcat();
        tomcat.setBaseDir("target");
        tomcat.setPort(8080);
        tomcat.addWebapp("/", new File("target/classes/webapp").getAbsolutePath());
        tomcat.start();
        tomcat.getServer().await();
    }
}
