import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Mehul on 15/11/2016.
 */
public class LondonUnderground
{
    public static void main(String[] args)
    {
        System.out.println(" Enter zone 1 tube station form \n oxford cricus , baker street station, bond Street station , gloucester road station ,paddington station , " +
                      "    \nregent's park station , st paul's station  ,marylebone station ");

        Scanner sc =new Scanner(System.in);
        String sationname  = sc.nextLine().toLowerCase();

        String tube = "";

        String station [] =
                { "oxford cricus",
                        "baker street station",
                        "bond street station",
                        "gloucester road station",
                        "paddington station",
                        "regent's park station",
                        "st paul's station",
                        "marylebone station",

                };

        for (int i = 0; i <station.length ; i++)
        {

            if (station[i].contentEquals(sationname))

            {
                System.out.println(station[i]);
                tube = station[i];
                break;
            }
        }

            if (tube=="oxford cricus")
            {
                System.out.println(" Following lines are coming to this station ");
                System.out.println(" Bakerloo , Central, Victoria ");

            }
            else if(tube.equalsIgnoreCase("baker street station"))

            {    System.out.println(" Following lines are coming to this station ");
                System.out.println("Bakerloo , Circle , Hammersmith & city , Jubliee");
            }
            else if(tube.equalsIgnoreCase("bond street station"))

            {    System.out.println(" Following lines are coming to this station ");
                System.out.println("Central , Jubilee");
            }

            else if(tube=="gloucester road station")
            {
                System.out.println(" Following lines are coming to this station ");
                System.out.println("Piccadily , Circle , District");

            }
            else if (tube== "paddington station")

            {    System.out.println(" Following lines are coming to this station ");
                System.out.println(" Bakerloo , Circle , District , Hammersmith & city ");
            }
            else if (tube =="regent's park station" )
            {   System.out.println(" Following lines are coming to this station ");
                System.out.println("Bakerloo , Circle ,Hammersmith & city ");
            }
            else  if (tube == "st paul's station" )
             {  System.out.println(" Following lines are coming to this station ");
                 System.out.println(" Central");
             }
             else if (tube== "marylebone station")
             {
                System.out.println("Bakerloo");
             }
             else
                 {
                     System.out.println("Out of zone station \n Please Enter correct station name form list  ");
            }


    }

















}
