import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Parser {
    private String inp;

    public Parser(String inp) {
        this.inp = inp;
    }

    public void parseTaskList(TaskList ob) {
        for (int j = 0; j < ob.numberOfTasks(); j++) {
            if (!ob.getTaskFromList(j).getPreExisting()) {
                System.out.println("    " + (j + 1) + ". " + ob.getTaskFromList(j).toString());
            }
            else {
                System.out.println("    " + (j + 1) + ". " + ob.getTaskFromList(j).getDescription());
            }
        }
    }

    public String getTaskList(TaskList ob) {
        String ret="";
        for (int j = 0; j < ob.numberOfTasks(); j++) {
            if (!ob.getTaskFromList(j).getPreExisting()) {
                ret = ret + ob.getTaskFromList(j).toString() + System.lineSeparator();
            } else {
                ret = ret + ob.getTaskFromList(j).getDescription() + System.lineSeparator();
            }
        }
        return ret;
    }

    public String parseTask() {
        String desc = ((inp.split("\\s",2)[1]).split("/"))[0];
        return desc;
    }

    public String parseTime() {

            String atByTime = ((inp.split("\\s", 2)[1]).split("/"))[1];
            String time = atByTime.split("\\s", 2)[1];
            return time;

    }

    public int getTaskIndex() {
        int ind = Integer.parseInt((inp.split("\\s"))[1]) - 1;
        return ind;
    }



}
