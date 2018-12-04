package ch13.work.template;

import ch13.work.io.*;

public class ReadfromFile extends BookReader
{
    FileInput fi;
    @Override
    void initialize()
    {
        System.out.println("Open an input file");
        fi = new FileInput("./src/ch13/work/template/prideprejudice");
    }

    @Override
    void startReading()
    {
        String someString;
        System.out.println("Loop writing out each record");
        someString = fi.readLine();
        while (someString != null)
        {
            System.out.println(someString + "\n");
            someString = fi.readLine();
        }
    }

    @Override
    void stopReading()
    {
        System.out.println("Close input file");
        fi.fileClose();
    }
}
