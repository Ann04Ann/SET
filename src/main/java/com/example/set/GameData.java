package com.example.set;
import javafx.scene.control.Label;

import java.util.HashMap;
import java.util.*;
import java.io.*;

import static java.lang.Math.min;

public class GameData {
    private Map<String, Integer> playersData;
    private final String FILENAME = "result.txt";

    public GameData() {
        playersData = new LinkedHashMap<>();
        loadPlayerData();
    }

    public void addPlayer(String playerName, int time) {

        if (playersData.containsKey(playerName)) {
            playersData.put(playerName, min(playersData.get(playerName), time));
        } else {
            playersData.put(playerName, 1000000);
        }
        sortPlayersData();
        savePlayerData();
    }

    private void sortPlayersData() {
        playersData = playersData.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(LinkedHashMap::new,
                        (map, entry) -> map.put(entry.getKey(), entry.getValue()),
                        Map::putAll);
    }

    public void printPlayersData(Label[] all_label) {
        int i =0;
        for (Map.Entry<String, Integer> entry : playersData.entrySet()) {
            if (i>= 8){break;}

            all_label[i].setText(entry.getKey());
            int minut = entry.getValue()/60;
            all_label[i+8].setText(String.valueOf(minut + ":"+(entry.getValue())%60));
            i++;
        }
    }

    private void loadPlayerData() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                playersData.put(parts[0], Integer.parseInt(parts[1]));
            }
        } catch (IOException e) {
            System.out.println("Error loading player data: " + e.getMessage());
        }
    }

    private void savePlayerData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            for (Map.Entry<String, Integer> entry : playersData.entrySet()) {
                writer.write(entry.getKey() + ":" + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            //System.out.println("Error saving player data: " + e.getMessage());
        }
    }



}
