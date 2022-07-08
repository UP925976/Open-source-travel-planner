package com.example.tfltravelplanner;

import static java.lang.Integer.valueOf;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class DecisionMapTest {

    public static void main(String[] args) throws FileNotFoundException {

        Utils u = new Utils();
        DecisionMap perec;
        try {
            perec = new DecisionMap();
        } catch(FileNotFoundException fe){
            u.console("File not found");return;
        }

        //u.lineBreak();
        u.console("Start...");

        navigateMap(u, perec);

    }


    static DecisionNode node;
    public static void navigateMap(Utils u, DecisionMap perec){
         node = perec.entryPoint();

        while(node != null) {

            u.console("Train Lines:");

            if (valueOf(node.getLine1()).equals(1)) {
                System.out.println("Bakerloo line");
            }
            if (valueOf(node.getLine1()).equals(2)){
                System.out.println("Central line");
            }
            if (valueOf(node.getLine1()).equals(3)){
                System.out.println("Circle line");
            }
            if (valueOf(node.getLine1()).equals(4)){
                System.out.println("District line");
            }
            if (valueOf(node.getLine1()).equals(5)){
                System.out.println("DLR line");
            }
            if (valueOf(node.getLine1()).equals(6)){
                System.out.println("Hammersmith and City line");
            }
            if (valueOf(node.getLine1()).equals(7)){
                System.out.println("Jubilee line");
            }
            if (valueOf(node.getLine1()).equals(8)){
                System.out.println("Metropolitan line");
            }
            if (valueOf(node.getLine1()).equals(9)){
                System.out.println("Northern line");
            }
            if (valueOf(node.getLine1()).equals(10)){
                System.out.println("Overground line");
            }
            if (valueOf(node.getLine1()).equals(11)){
                System.out.println("Piccadilly line");
            }
            if (valueOf(node.getLine1()).equals(12)){
                System.out.println("TfL Rail line");
            }
            if (valueOf(node.getLine1()).equals(13)){
                System.out.println("Victoria line");
            }
            if (valueOf(node.getLine1()).equals(14)){
                System.out.println("Waterloo and City line");
            }
// --------------------------------------------------------------------------
            if (valueOf(node.getLine2()).equals(1)) {
                System.out.println("Bakerloo line");
            }
            if (valueOf(node.getLine2()).equals(2)){
                System.out.println("Central line");
            }
            if (valueOf(node.getLine2()).equals(3)){
                System.out.println("Circle line");
            }
            if (valueOf(node.getLine2()).equals(4)){
                System.out.println("District line");
            }
            if (valueOf(node.getLine2()).equals(5)){
                System.out.println("DLR line");
            }
            if (valueOf(node.getLine2()).equals(6)){
                System.out.println("Hammersmith and City line");
            }
            if (valueOf(node.getLine2()).equals(7)){
                System.out.println("Jubilee line");
            }
            if (valueOf(node.getLine2()).equals(8)){
                System.out.println("Metropolitan line");
            }
            if (valueOf(node.getLine2()).equals(9)){
                System.out.println("Northern line");
            }
            if (valueOf(node.getLine2()).equals(10)){
                System.out.println("Overground line");
            }
            if (valueOf(node.getLine2()).equals(11)){
                System.out.println("Piccadilly line");
            }
            if (valueOf(node.getLine2()).equals(12)){
                System.out.println("TfL Rail line");
            }
            if (valueOf(node.getLine2()).equals(13)){
                System.out.println("Victoria line");
            }
            if (valueOf(node.getLine2()).equals(14)){
                System.out.println("Waterloo and City line");
            }
// --------------------------------------------------------------------------
            if (valueOf(node.getLine3()).equals(1)) {
                System.out.println("Bakerloo line");
            }
            if (valueOf(node.getLine3()).equals(2)){
                System.out.println("Central line");
            }
            if (valueOf(node.getLine3()).equals(3)){
                System.out.println("Circle line");
            }
            if (valueOf(node.getLine3()).equals(4)){
                System.out.println("District line");
            }
            if (valueOf(node.getLine3()).equals(5)){
                System.out.println("DLR line");
            }
            if (valueOf(node.getLine3()).equals(6)){
                System.out.println("Hammersmith and City line");
            }
            if (valueOf(node.getLine3()).equals(7)){
                System.out.println("Jubilee line");
            }
            if (valueOf(node.getLine3()).equals(8)){
                System.out.println("Metropolitan line");
            }
            if (valueOf(node.getLine3()).equals(9)){
                System.out.println("Northern line");
            }
            if (valueOf(node.getLine3()).equals(10)){
                System.out.println("Overground line");
            }
            if (valueOf(node.getLine3()).equals(11)){
                System.out.println("Piccadilly line");
            }
            if (valueOf(node.getLine3()).equals(12)){
                System.out.println("TfL Rail line");
            }
            if (valueOf(node.getLine3()).equals(13)){
                System.out.println("Victoria line");
            }
            if (valueOf(node.getLine3()).equals(14)){
                System.out.println("Waterloo and City line");
            }
// --------------------------------------------------------------------------
            if (valueOf(node.getLine4()).equals(1)) {
                System.out.println("Bakerloo line");
            }
            if (valueOf(node.getLine4()).equals(2)){
                System.out.println("Central line");
            }
            if (valueOf(node.getLine4()).equals(3)){
                System.out.println("Circle line");
            }
            if (valueOf(node.getLine4()).equals(4)){
                System.out.println("District line");
            }
            if (valueOf(node.getLine4()).equals(5)){
                System.out.println("DLR line");
            }
            if (valueOf(node.getLine4()).equals(6)){
                System.out.println("Hammersmith and City line");
            }
            if (valueOf(node.getLine4()).equals(7)){
                System.out.println("Jubilee line");
            }
            if (valueOf(node.getLine4()).equals(8)){
                System.out.println("Metropolitan line");
            }
            if (valueOf(node.getLine4()).equals(9)){
                System.out.println("Northern line");
            }
            if (valueOf(node.getLine4()).equals(10)){
                System.out.println("Overground line");
            }
            if (valueOf(node.getLine4()).equals(11)){
                System.out.println("Piccadilly line");
            }
            if (valueOf(node.getLine4()).equals(12)){
                System.out.println("TfL Rail line");
            }
            if (valueOf(node.getLine4()).equals(13)){
                System.out.println("Victoria line");
            }
            if (valueOf(node.getLine4()).equals(14)){
                System.out.println("Waterloo and City line");
            }
// --------------------------------------------------------------------------
            if (valueOf(node.getLine5()).equals(1)) {
                System.out.println("Bakerloo line");
            }
            if (valueOf(node.getLine5()).equals(2)){
                System.out.println("Central line");
            }
            if (valueOf(node.getLine5()).equals(3)){
                System.out.println("Circle line");
            }
            if (valueOf(node.getLine5()).equals(4)){
                System.out.println("District line");
            }
            if (valueOf(node.getLine5()).equals(5)){
                System.out.println("DLR line");
            }
            if (valueOf(node.getLine5()).equals(6)){
                System.out.println("Hammersmith and City line");
            }
            if (valueOf(node.getLine5()).equals(7)){
                System.out.println("Jubilee line");
            }
            if (valueOf(node.getLine5()).equals(8)){
                System.out.println("Metropolitan line");
            }
            if (valueOf(node.getLine5()).equals(9)){
                System.out.println("Northern line");
            }
            if (valueOf(node.getLine5()).equals(10)){
                System.out.println("Overground line");
            }
            if (valueOf(node.getLine5()).equals(11)){
                System.out.println("Piccadilly line");
            }
            if (valueOf(node.getLine5()).equals(12)){
                System.out.println("TfL Rail line");
            }
            if (valueOf(node.getLine5()).equals(13)){
                System.out.println("Victoria line");
            }
            if (valueOf(node.getLine5()).equals(14)){
                System.out.println("Waterloo and City line");
            }
// --------------------------------------------------------------------------
            if (valueOf(node.getLine6()).equals(1)) {
                System.out.println("Bakerloo line");
            }
            if (valueOf(node.getLine6()).equals(2)){
                System.out.println("Central line");
            }
            if (valueOf(node.getLine6()).equals(3)){
                System.out.println("Circle line");
            }
            if (valueOf(node.getLine6()).equals(4)){
                System.out.println("District line");
            }
            if (valueOf(node.getLine6()).equals(5)){
                System.out.println("DLR line");
            }
            if (valueOf(node.getLine6()).equals(6)){
                System.out.println("Hammersmith and City line");
            }
            if (valueOf(node.getLine6()).equals(7)){
                System.out.println("Jubilee line");
            }
            if (valueOf(node.getLine6()).equals(8)){
                System.out.println("Metropolitan line");
            }
            if (valueOf(node.getLine6()).equals(9)){
                System.out.println("Northern line");
            }
            if (valueOf(node.getLine6()).equals(10)){
                System.out.println("Overground line");
            }
            if (valueOf(node.getLine6()).equals(11)){
                System.out.println("Piccadilly line");
            }
            if (valueOf(node.getLine6()).equals(12)){
                System.out.println("TfL Rail line");
            }
            if (valueOf(node.getLine6()).equals(13)){
                System.out.println("Victoria line");
            }
            if (valueOf(node.getLine6()).equals(14)){
                System.out.println("Waterloo and City line");
            }

            u.console("");
            u.console("Train Station:");
            u.console(node.getStationName());
            stationName();


            if (valueOf(node.getConnectingStation1()).equals(0)){
                System.out.println("Does not connect to a station");
                //u.lineBreak();

            } else {
                break;
             }

         }
    }

    public static List<String> stations = new ArrayList<String>();
    public static void stationName(){

        stations.add(node.getStationName());

    }
}
