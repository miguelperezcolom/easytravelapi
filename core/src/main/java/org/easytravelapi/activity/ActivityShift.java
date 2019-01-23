package org.easytravelapi.activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityShift {

    private String id;

    private String name;

    private List<ActivityLanguage> languages = new ArrayList<>();

    private List<ActivityPickupPoint> pickups = new ArrayList<>();


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ActivityLanguage> getLanguages() {
        return languages;
    }

    public void setLanguages(List<ActivityLanguage> languages) {
        this.languages = languages;
    }

    public List<ActivityPickupPoint> getPickups() {
        return pickups;
    }

    public void setPickups(List<ActivityPickupPoint> pickups) {
        this.pickups = pickups;
    }
}
