#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};
import org.apache.log4j.*;

/**
 * Hello world!
 *
 */
public class App 
{
    static Logger log=Logger.getLogger(App.class);

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    static int getVal(){
        log.info("Returning 1");
        return 1;
    }
}
