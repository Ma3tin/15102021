package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        String[] lines = input.split("\n");
        ArrayList<Guy> guys = new ArrayList<>();
        for (int i = 0; i < lines.length; i++) {
            String[] line = lines[i].split(",");

            guys.add(new Guy(Integer.parseInt(line[0]), line[1], Float.parseFloat(line[2].replace("\"", ""))));
        }
        long max = 0;
        HashSet<Guy> maxGuys = new HashSet<>();
        for (int i = 0; i < guys.size(); i++) {
            for (int j = 0; j < guys.size(); j++) {
                if (guys.get(i).getName().equals(guys.get(j).getName())) {
                    max += guys.get(j).getValue();
                }
            }
            maxGuys.add(new Guy(guys.get(i).getYear(), guys.get(i).getName(), (long) max));
            max = 0;
        }
        float highest = 0;
        String name = "";
        for (Guy i: maxGuys) {
            if (i.getValue() > highest) {
                highest = i.getValue();
                name = i.getName();
            }
        }
        System.out.println(name + ":" + (long)highest);
    }

    static String input = "2014,Vöcklinghaus,98000.00\n" +
            "2014,Konsorcium Oeconomicus,48000.00\n" +
            "2014,Spory související s fotovoltaickým průmyslem,25353000.00\n" +
            "2014,Anglia Auto Accesories,520000.00\n" +
            "2014,WNC Factoring,1005000.00\n" +
            "2015,Vöcklinghaus,180000.00\n" +
            "2015,Spory související s fotovoltaickým průmyslem,62645000.00\n" +
            "2015,Anglia Auto Accesories,1609000.00\n" +
            "2015,I.P. Busta a J.P. Busta,445000.00\n" +
            "2015,WNC Factoring,16372000.00\n" +
            "2015,A11Y,3635000.00\n" +
            "2016,ZIPimex,615000.00\n" +
            "2016,Vöcklinghaus,195000.00\n" +
            "2016,Spory související s fotovoltaickým průmyslem,77644000.00\n" +
            "2016,Anglia Auto Accesories,3269000.00\n" +
            "2016,I.P. Busta a J.P. Busta,5281000.00\n" +
            "2016,WNC Factoring,26903000.00\n" +
            "2016,A11Y,2728000.00\n" +
            "2016,WCV,8420000.00\n" +
            "2017,Vöcklinghaus,11000.00\n" +
            "2017,Spory související s fotovoltaickým průmyslem,127511000.00\n" +
            "2017,Anglia Auto Accesories,145000.00\n" +
            "2017,I.P. Busta a J.P. Busta,192000.00\n" +
            "2017,WNC Factoring,15252000.00\n" +
            "2017,A11Y,1971000.00\n" +
            "2017,WCV,23186000.00\n" +
            "2017,A.M.F.,759000.00\n" +
            "2017,Pawlowski,222000.00\n" +
            "2018,Spory související s fotovoltaickým průmyslem,14366000.00\n" +
            "2018,WNC Factoring,1656000.00\n" +
            "2018,A11Y,6271000.00\n" +
            "2018,WCV,1994000.00\n" +
            "2018,A.M.F.,1389000.00\n" +
            "2018,Pawlowski,563000.00\n" +
            "2018,Diag Human,3696000.00\n" +
            "2018,Fynerdale,359000.00\n" +
            "2019,Spory související s fotovoltaickým průmyslem,27694000.00\n" +
            "2019,WNC Factoring,34000.00\n" +
            "2019,A11Y,587000.00\n" +
            "2019,WCV,16203000.00\n" +
            "2019,A.M.F.,10859000.00\n" +
            "2019,Pawlowski,18044000.00\n" +
            "2019,Diag Human,38410000.00\n" +
            "2019,Fynerdale,3835000.00\n" +
            "2019,Alcor,3489000.00\n" +
            "2019,NWR,50000.00\n";
}
