package com.munchkin.game.GUI;

public class DisplayResolution {
    private int x;
    private int y;

    enum Resolution{
        SVGA,
        XGA,
        XGA_PLUS,
        WXGA_16X9,
        WXGA_5X3,
        WXGA_16X10,
        SXGA,
        HD,
        WXGA_PLUS,
        HD_PLUS,
        WSXGA_PLUS,
        FHD,
        WUXGA,
        WQHD,
        UHD
    }

    DisplayResolution(Resolution resolution){
        switch (resolution){
            case SVGA:
                this.x = 800;
                this.y = 600;
                break;
            case XGA:
                this.x = 1024;
                this.y = 600;
                break;
            case XGA_PLUS:
                this.x = 1152;
                this.y = 864;
                break;
            case WXGA_16X9:
                this.x = 1280;
                this.y = 720;
                break;
            case WXGA_5X3:
                this.x = 1280;
                this.y = 768;
                break;
            case WXGA_16X10:
                this.x = 1280;
                this.y = 800;
                break;
            case SXGA:
                this.x = 1280;
                this.y = 1024;
                break;
            case HD:
                this.x = 1366;
                this.y = 768;
                break;
            case WXGA_PLUS:
                this.x = 1440;
                this.y = 900;
                break;
            case HD_PLUS:
                this.x = 1600;
                this.y = 900;
                break;
            case WSXGA_PLUS:
                this.x = 1680;
                this.y = 1050;
                break;
            case FHD:
                this.x = 1920;
                this.y = 1080;
                break;
            case WUXGA:
                this.x = 1920;
                this.y = 1200;
                break;
            case WQHD:
                this.x = 2560;
                this.y = 1440;
                break;
            case UHD:
                this.x = 3840;
                this.y = 2160;
                break;
        }
    }

    @Override
    public String toString() {
        return x + " x " + y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
}
