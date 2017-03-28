package edu.matc.CustomTag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Calendar;

/**
 * Created by student on 3/27/17.
 */
public class WelcomeTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();
        Calendar rightNow = Calendar.getInstance();

        if (rightNow.get(Calendar.MONTH) == 9 && rightNow.get(Calendar.DATE)
                == 31) {
            out.println("Happy Holloween!!!");
        }

        if (rightNow.get(Calendar.HOUR_OF_DAY) < 6) {
            out.println("Shhh!!! <whisper>Welcome</whisper>");
        } else if (rightNow.get(Calendar.HOUR_OF_DAY) < 12) {
            out.println("Good Morning!!! Welcome!");
        } else if (rightNow.get(Calendar.HOUR_OF_DAY) < 18) {
            out.println("Relax . . .and  Welcome!");
        } else if (rightNow.get(Calendar.HOUR_OF_DAY) < 24) {
            out.println("Good Night! Welcome!");
        }

    }
}


