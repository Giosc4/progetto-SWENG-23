package com.project.sweng;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.project.sweng.Json.MagicCard;

public class JsonReader {

    public ArrayList<MagicCard> getMagicCards() {
        ArrayList<MagicCard> carteMagic = new ArrayList<MagicCard>();
        Gson gson = new Gson();

        JsonArray cards;

        try (FileReader reader = new FileReader("demo_mapdb\\src\\main\\resources\\magic_cards.json")) {
            cards = gson.fromJson(reader, JsonArray.class);
            for (int i = 0; i < cards.size(); i++) {
                JsonElement card = cards.get(i);
                String artist = card.getAsJsonObject().get("artist").getAsString();
                String name = card.getAsJsonObject().get("name").getAsString();
                String text = card.getAsJsonObject().get("text").getAsString();
                String types = card.getAsJsonObject().get("types").getAsString();
                String rarity = card.getAsJsonObject().get("rarity").getAsString();
                int hasFoil = card.getAsJsonObject().get("hasFoil").getAsInt();
                int isAlternative = card.getAsJsonObject().get("isAlternative").getAsInt();
                int isFullArt = card.getAsJsonObject().get("isFullArt").getAsInt();
                int isPromo = card.getAsJsonObject().get("isPromo").getAsInt();
                int isReprint = card.getAsJsonObject().get("isReprint").getAsInt();

                carteMagic.add(
                        new MagicCard(name, types, rarity, artist, text, hasFoil, isAlternative, isFullArt, isPromo,
                                isReprint));
            }
        } catch (JsonIOException | JsonSyntaxException | IOException e) {
            e.printStackTrace();
        }
        return carteMagic;
    }

}
