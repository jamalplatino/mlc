package com.google.android.material.color;

public final class ColorRoles {
    private final int accent;
    private final int accentContainer;
    private final int onAccent;
    private final int onAccentContainer;

    public int getAccent() {
        return this.accent;
    }

    public int getAccentContainer() {
        return this.accentContainer;
    }

    public int getOnAccent() {
        return this.onAccent;
    }

    public int getOnAccentContainer() {
        return this.onAccentContainer;
    }

    ColorRoles(int i, int i2, int i3, int i4) {
        this.accent = i;
        this.onAccent = i2;
        this.accentContainer = i3;
        this.onAccentContainer = i4;
    }
}