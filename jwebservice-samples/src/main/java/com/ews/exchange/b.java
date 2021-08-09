package com.ews.exchange;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

final class b
{
    public static String a = "EWS for Exchange";

    public static void expiredValidate() throws IOException
    {
        b.a = "EWS for Exchange";
        try
        {
            final Date parse = new SimpleDateFormat("yyyy-MM-dd").parse("2021-12-31");
            final Date time = Calendar.getInstance().getTime();
            if (parse.before(time))
            {
                throw new IOException("EWS for Exchange Evaluation version has expired.");
            }
            final File file = new File(System.getProperty("user.home") + System.getProperty("file.separator") + ".wsj");
            boolean exists = false;
            try
            {
                exists = file.exists();
            }
            catch (Exception ex)
            {
                final int value = Calendar.getInstance().get(5);
                final int value2 = Calendar.getInstance().get(7);
                if (value < 8 && value2 == 3)
                {
                    throw new IOException("EWS for Exchange evaluation version. Please contact Independentsoft to obtain extended evaluation version jar file.");
                }
            }
            if (exists)
            {
                final Calendar instance;
                (instance = Calendar.getInstance()).setTime(new Date(file.lastModified()));
                instance.add(2, 1);
                if (instance.getTime().before(time))
                {
                    throw new IOException("EWS for Exchange evaluation version. Evaluation version has expired.");
                }
            }
            else
            {
                try
                {
                    file.createNewFile();
                }
                catch (Exception ex2)
                {
                    final int value3 = Calendar.getInstance().get(5);
                    final int value4 = Calendar.getInstance().get(7);
                    if (value3 < 8 && value4 == 3)
                    {
                        throw new IOException("EWS for Exchange evaluation version. Please contact Independentsoft to obtain extended evaluation version jar file.");
                    }
                }
            }
        }
        catch (ParseException ex3)
        {
            throw new IOException("EWS for Exchange evaluation version. Evaluation version has expired.");
        }
    }
}
