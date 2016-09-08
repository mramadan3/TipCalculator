package edu.orangecoastcollege.cs273.mramadan3.tipcalculator;

/**
 * Created by mramadan3 on 9/8/2016.
 */
public class RestaurantBill {

    private double mAmount;
    private double mTipPercent;
    private double mTipAmount;
    private double mTotalAmount;

    public RestaurantBill() {
        mAmount = 0.0;
        mTipPercent = 0.0;
        mTipAmount = 0.0;
        mTotalAmount = 0.0;

    }

    public RestaurantBill(double mAmount, double mTipPercent, double mTipAmount, double mTotalAmount) {
        this.mAmount = mAmount;
        this.mTipPercent = mTipPercent;
    }


    public double getAmount() {
        return mAmount;
    }

    public double getTipPercent() {
        return mTipPercent;
    }

    public double getTipAmount() {
        return mTipAmount;
    }

    public double getTotalAmount() {
        return mTotalAmount;
    }

    public void setmAmount(double mAmount) {
        this.mAmount = mAmount;
    }

    public void setmTipPercent(double mTipPercent) {
        this.mTipPercent = mTipPercent;
    }

    private void recalculateAmounts()
    {
        mTipAmount = mAmount * mTipPercent;
        mTotalAmount = mAmount + mTipAmount;
    }
}
