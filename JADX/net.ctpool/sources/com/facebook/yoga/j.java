package com.facebook.yoga;

/* JADX INFO: loaded from: classes.dex */
public enum j {
    LEFT(0),
    TOP(1),
    RIGHT(2),
    BOTTOM(3),
    START(4),
    END(5),
    HORIZONTAL(6),
    VERTICAL(7),
    ALL(8);


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f13397m;

    j(int i7) {
        this.f13397m = i7;
    }

    public static j h(int i7) {
        switch (i7) {
            case 0:
                return LEFT;
            case 1:
                return TOP;
            case 2:
                return RIGHT;
            case 3:
                return BOTTOM;
            case 4:
                return START;
            case 5:
                return END;
            case 6:
                return HORIZONTAL;
            case 7:
                return VERTICAL;
            case 8:
                return ALL;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i7);
        }
    }

    public int j() {
        return this.f13397m;
    }
}
