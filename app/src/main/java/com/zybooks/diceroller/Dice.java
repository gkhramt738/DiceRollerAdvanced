package com.zybooks.diceroller;

import java.util.Random;

public class Dice {

    // Data fields
    public static int LARGEST_NUM = 6;
    public static int SMALLEST_NUM = 1;

    private int mNumber = SMALLEST_NUM;
    private int mImageId; // limks each picture from drawable folder to be value of this variable
    private Random mRandomGenerator;

    // Constructors
    public Dice(int number) {
        setNumber(number);
        mRandomGenerator = new Random();
    }

    public int getNumber() {
        return mNumber;
    }

    // Methods
    public void setNumber(int number) {
        if (number >= SMALLEST_NUM && number <= LARGEST_NUM) {
            mNumber = number;
            switch (number) {
                case 1:
                    mImageId = R.drawable.dice_1;
                    break;
                case 2:
                    mImageId = R.drawable.dice_2;
                    break;
                case 3:
                    mImageId = R.drawable.dice_3;
                    break;
                case 4:
                    mImageId = R.drawable.dice_4;
                    break;
                case 5:
                    mImageId = R.drawable.dice_5;
                    break;
                case 6:
                    mImageId = R.drawable.dice_6;
                    break;
            }
        }
    }

    public int getmImageId() {
        return mImageId;
    }

    public void addOne() {
        setNumber(mNumber+1);
    }

    public void subtractOne() {
        setNumber(mNumber-1);
    }

    public void roll(){
        setNumber(mRandomGenerator.nextInt(LARGEST_NUM+1)); // Gives dice vallues 1-6
    }

}
