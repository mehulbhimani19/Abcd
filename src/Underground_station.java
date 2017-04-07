import java.util.Scanner;

/**
 * Created by Mehul on 18/11/2016.
 */
public class Underground_station

{
    public static void main(String[] args) {
        String choice;
        do {

            System.out.println("Enter any Station and get train information : ");

            Scanner obj = new Scanner(System.in);
            String stname = obj.nextLine().toLowerCase();
            String train = "";

            String[] station = {
                    "Liverpool Street",
                    "Moorgate",
                    "Oxford circus",
                    "Picadilly circus",
                    "KingsCross",
                    "Baker Street",
                    "Paddington",
                    "Green Park"};



            String[] stationlines = {
                    "Central, Circle, Hammersmith and City, Metropolitan",
                    "Circle, Hammersmith and City, Metropolitan, Northern",
                    "Bekarloo, Central, Victoria",
                    "Bekarloo, Picadilly",
                    "Circle, Hammersmith and City, Metropolitan, Northarn, Picadilly, Victoria",
                    "Bekarloo, Circle, Hammersmith and city, Metropolitan, Jubilee",
                    "Bekarloo, Circle,District",
                    "Jubilee Line, Piccadilly Line, Victoria Line"};



            for (int i = 0; i < station.length; i++)
            {
                if (station[i].equalsIgnoreCase((stname)))
                {
                    //System.out.println(station[i]);
                    train = station[i].trim();
                    break;
                }
            }
            if (train.equalsIgnoreCase(station[0]))
            {
                System.out.println("Trains coming on  :\t"+train+" are as follows.");
                System.out.println(stationlines[0]);
            }
            else if (train.equalsIgnoreCase(station[1]))
            {
                System.out.println("Trains coming on  :\t"+train+" are as follows.");
                System.out.println(stationlines[1]);
            }
            else if (train.equalsIgnoreCase(station[2]))
            {
                System.out.println("Trains coming on  :\t "+train+" are as follows.");
                System.out.println(stationlines[2]);
            }
            else if (train.equalsIgnoreCase(station[3]))
            {
                System.out.println("Trains coming on  :\t"+train+" are as follows.");
                System.out.println(stationlines[3]);
            }
            else if (train.equalsIgnoreCase(station[4]))
            {
                System.out.println("Trains coming on  :\t"+train+" are as follows.");
                System.out.println(stationlines[4]);
            }
            else if (train.equalsIgnoreCase(station[5]))
            {
                System.out.println("Trains coming on  :\t"+train+" are as follows.");
                System.out.println(stationlines[5]);
            }
            else if (train.equalsIgnoreCase(station[6]))
            {
                System.out.println("Trains coming on  :\t"+train+" are as follows.");
                System.out.println(stationlines[6]);
            }
            else if (train.equalsIgnoreCase(station[7]))
            {
                System.out.println("Trains coming on  :\t"+train+" are as follows.");
                System.out.println(stationlines[7]);
            }
            else if (train.equalsIgnoreCase(station[8]))
            {
                System.out.println("Trains coming on  :\t"+train+" are as follows.");
                System.out.println(stationlines[8]);
            }
            else
            {
                System.out.println("This Station is out of zone 1.");
            }

            System.out.print("If you want to continue? press y to continue:=");
            choice =obj.nextLine();

        } while (choice.equalsIgnoreCase("y"));




    }
}



