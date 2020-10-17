import java.time.LocalDateTime;
import java.util.*;
import java.io.*;
public class time
{
    public static String main()
    {
        LocalDateTime current=LocalDateTime.now();
        String raj=current.toString();
        return raj.split("T")[0]+" "+raj.split("T")[1];
    }
}