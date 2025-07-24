package org.example.Model;

import java.util.*;
import java.io.*;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVFormat;

public class CountriesGame {
    private HashMap<String, String> countries_Capitals = new HashMap<>();
    private HashMap<Integer, String> countriesNumeration = new HashMap<>();
    private String delimiter = "\\s+";
    private ArrayList<Integer> listRandomNumbers = new ArrayList<Integer>();
    private String nameUser;
    private Integer score =0;

    public CountriesGame(){};
    public void fileDescifer(String direction) {
        try (BufferedReader reader = new BufferedReader(new FileReader(direction))) {
            String line;
            int x=0;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(delimiter);
                if (parts.length >= 2) {
                    String countries = parts[0].trim();
                    String capitals = parts[1].trim();
                    countries_Capitals.put(countries, capitals);
                    this.countriesNumeration.put(x,countries);
                    x++;
                } else {
                    System.err.println("Line Ignored for having less than 2 columns: " + line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void aleatoryCountryGenerator() {
        Random randomNumbers = new Random();
        int x = 0;
        for (x = 0; x < 10; x++) {
            this.listRandomNumbers.add(randomNumbers.nextInt(countries_Capitals.size()));
        }
    }

    public void predictCountry () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me your name to give you the score please: ");
        this.nameUser = sc.next();
        int y;
        for(y=0;y<10;y++){
            System.out.println("Guess the capital of this country: " + countriesNumeration.get(listRandomNumbers.get(y)));
            String response = sc.next();
            if(response.equals(countries_Capitals.get(countriesNumeration.get(listRandomNumbers.get(y))))){
                this.score +=1;
            }
        }
        sc.close();
    }
    public void writeResults(){
        try (CSVPrinter printer = new CSVPrinter(new FileWriter("Classification.txt"), CSVFormat.EXCEL)) {
            printer.printRecord("Name: " + this.nameUser+", Score: " + this.score);
        }catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

    }
}
