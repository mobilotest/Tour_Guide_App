package com.example.milpitastourguide;

/**
 * {@link Item} represents a vocabulary word that the user wants to learn.
 * It contains an Image, description and address for that item.
 */
public class Item {

    /**
     * Facility name (Header)
     */
    private String mInstitutionName;

    /**
     * Facility address
     */
    private String mFacilityAddress;

    /** Image resource ID for the item */
    private int mImageResourceId;

    /**
     * Create a new Item object.
     *
     * @param institutionName is the name of the institution
     * @param facilityAddress   is the address of the institution
     * @param imageResourceId    is the images for each item
     */
    public Item(String institutionName, String facilityAddress, int imageResourceId) {
        mInstitutionName = institutionName;
        mFacilityAddress = facilityAddress;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the institution name of the item.
     */
    public String getInstitutionName() {
        return mInstitutionName;
    }

    /**
     * Get the institution address of the item.
     */
    public String getFacilityAddress() {
        return mFacilityAddress;
    }

    /**
     * Get the image for each item.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
