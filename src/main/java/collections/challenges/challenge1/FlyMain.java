package collections.challenges.challenge1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.text.DateFormat;

public class FlyMain {
    public static void main(String[] args) {
        try{
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");
            ArrayList<Fly> flies = new ArrayList<>();

            flies.add(new Fly("AAL 933", "New York", "Santiago",df.parse("2021-08-29 05:39"), 32));
            flies.add(new Fly("LAT 755", "Sao Paulo", "Santiago", df.parse("2021-08-31 04:45"), 47));
            flies.add(new Fly("SKU 621", "Rio De Janeiro", "Santiago", df.parse("2021-08-30 16:00"), 52));
            flies.add(new Fly("DAL 147", "Atlanta", "Santiago", df.parse("2021-08-29 13:22"), 59));
            flies.add(new Fly("AVA 241", "Bogota", "Santiago", df.parse("2021-08-31 14:05"), 25));
            flies.add(new Fly("AMX 10", "Mexico City", "Santiago", df.parse("2021-08-31 05:20"), 29));
            flies.add(new Fly("IBE 6833", "Londres", "Santiago", df.parse("2021-08-30 08:45"), 55));
            flies.add(new Fly("LAT 2479", "Frankfurt", "Santiago", df.parse("2021-08-29 07:41"), 51));
            flies.add(new Fly("SKU 803", "Lima", "Santiago", df.parse("2021-08-30 10:35"), 48));
            flies.add(new Fly("LAT 533", "Los Ángeles", "Santiago", df.parse("2021-08-29 09:14"), 59));
            flies.add(new Fly("LAT 1447", "Guayaquil", "Santiago", df.parse("2021-08-31 08:33"), 31));
            flies.add(new Fly("CMP 111", "Panama City", "Santiago", df.parse("2021-08-31 15:15"), 29));
            flies.add(new Fly("LAT 705", "Madrid", "Santiago", df.parse("2021-08-30 08:14"), 47));
            flies.add(new Fly("AAL 957", "Miami", "Santiago", df.parse("2021-08-29 22:53"), 60));
            flies.add(new Fly("ARG 5091", "Buenos Aires", "Santiago", df.parse("2021-08-31 09:57"), 32));
            flies.add(new Fly("LAT 1283", "Cancún", "Santiago", df.parse("2021-08-31 04:00"), 35));
            flies.add(new Fly("LAT 579", "Barcelona", "Santiago", df.parse("2021-08-29 07:45"), 61));
            flies.add(new Fly("AAL 945", "Dallas-Fort Worth", "Santiago", df.parse("2021-08-30 07:12"), 58));
            flies.add(new Fly("LAT 501", "París", "Santiago", df.parse("2021-08-29 18:29"), 49));
            flies.add(new Fly("LAT 405", "Montevideo", "Santiago", df.parse("2021-08-30 15:45"), 39));

            flies.sort((a, b) -> b.getArrivedDate().compareTo(a.getArrivedDate()));
            flies.forEach(f -> System.out.println(f.toString()));


        }catch (ParseException e){
            System.out.println(e.getMessage());
        }

    }
}
