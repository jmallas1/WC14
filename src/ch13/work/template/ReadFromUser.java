package ch13.work.template;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromUser extends BookReader
{
    private Scanner sysin;
    private Boolean bDone;
    private String workingString;
    private ArrayList<String> userData;

    public ReadFromUser()
    {
        userData = new ArrayList();
    }

    @Override
    void initialize() {
        System.out.println("Please enter some text. When finished type \'ENTRY COMPLETE\'\n");
        sysin = new Scanner(System.in);
        bDone = false;

        while(!bDone)
        {
            workingString = sysin.nextLine();
            if (workingString.equals("ENTRY COMPLETE"))
            {
                bDone = true;
            }
            else
            {
                userData.add(workingString);
            }
        }
    }

    @Override
    void startReading()
    {
        for(String aLine : userData)
        {
            System.out.println(aLine);
        }
    }

    @Override
    void stopReading()
    {
        System.out.println("Read complete.");
    }

    @Override
    public boolean isInteractive() { return true; }
}
