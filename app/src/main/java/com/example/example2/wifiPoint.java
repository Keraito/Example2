package com.example.example2;

class wifiPoint {
    private String SSID;
    private String BSSID;
    private int Level;

    wifiPoint(String SSID, String BSSID, int level) {
        this.SSID = SSID;
        this.BSSID = BSSID;
        Level = level;
    }
}
