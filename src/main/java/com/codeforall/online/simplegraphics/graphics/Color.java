package com.codeforall.online.simplegraphics.graphics;

public class Color {
    private int red;
    private int green;
    private int blue;

    // Color constants

    // Red Gradients
    public static final Color RED = new Color(255, 0, 0);
    public static final Color LIGHT_RED = new Color(255, 102, 102);
    public static final Color DARK_RED = new Color(153, 0, 0);

    // Green Gradients
    public static final Color GREEN = new Color(0, 255, 0);
    public static final Color LIGHT_GREEN = new Color(102, 255, 102);
    public static final Color DARK_GREEN = new Color(0, 153, 0);
    public static final Color LIME_GREEN = new Color(50, 205, 50);
    public static final Color FOREST_GREEN = new Color(34, 139, 34);

    // Blue Gradients
    public static final Color BLUE = new Color(0, 0, 255);
    public static final Color LIGHT_BLUE = new Color(102, 178, 255);
    public static final Color DARK_BLUE = new Color(0, 0, 153);
    public static final Color SKY_BLUE = new Color(135, 206, 235);
    public static final Color ROYAL_BLUE = new Color(65, 105, 225);
    public static final Color NAVY_BLUE = new Color(0, 0, 128);

    // Yellow Gradients
    public static final Color YELLOW = new Color(255, 255, 0);
    public static final Color LIGHT_YELLOW = new Color(255, 255, 153);
    public static final Color DARK_YELLOW = new Color(204, 204, 0);
    public static final Color GOLD_YELLOW = new Color(255, 223, 0);

    // Cyan Gradients
    public static final Color CYAN = new Color(0, 255, 255);
    public static final Color LIGHT_CYAN = new Color(153, 255, 255);
    public static final Color DARK_CYAN = new Color(0, 153, 153);

    // Magenta Gradients
    public static final Color MAGENTA = new Color(255, 0, 255);
    public static final Color LIGHT_MAGENTA = new Color(255, 153, 255);
    public static final Color DARK_MAGENTA = new Color(153, 0, 153);

    // Orange Gradients
    public static final Color ORANGE = new Color(255, 165, 0);
    public static final Color LIGHT_ORANGE = new Color(255, 200, 102);
    public static final Color DARK_ORANGE = new Color(255, 140, 0);

    // Purple Gradients
    public static final Color PURPLE = new Color(128, 0, 128);
    public static final Color LIGHT_PURPLE = new Color(186, 85, 211);
    public static final Color DARK_PURPLE = new Color(75, 0, 130);

    // Brown Gradients
    public static final Color BROWN = new Color(165, 42, 42);
    public static final Color LIGHT_BROWN = new Color(210, 180, 140);
    public static final Color DARK_BROWN = new Color(101, 67, 33);

    // Gray Gradients
    public static final Color GRAY = new Color(128, 128, 128);
    public static final Color LIGHT_GRAY = new Color(211, 211, 211);
    public static final Color DARK_GRAY = new Color(64, 64, 64);

    // Black and White
    public static final Color BLACK = new Color(0, 0, 0);
    public static final Color WHITE = new Color(255, 255, 255);
    
    /**
     * Constructs a new Color object.
     * @param red the red value of the color (between 0 and 255)
     * @param green the green value of the color (between 0 and 255)
     * @param blue the blue value of the color (between 0 and 255)
     */
    public Color(int red, int green, int blue)
    {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    /**
     * Changes the color object, sets a new color
     *
     * @param red   the red value of the color (between 0 and 255)
     * @param green the green value of the color (between 0 and 255)
     * @param blue  the blue value of the color (between 0 and 255)
     */

    public void ChangeColor(int red, int green, int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    /**
     * Gets the red value of this color.
     * @return the red value (between 0 and 255)
     */
    public int getRed()
    {
       return red;
    }

    /**
     * Gets the green value of this color.
     * @return the green value (between 0 and 255)
     */
    public int getGreen()
    {
       return green;
    }

    /**
     * Gets the blue value of this color.
     * @return the blue value (between 0 and 255)
     */
    public int getBlue()
    {
       return blue;
    }
}
