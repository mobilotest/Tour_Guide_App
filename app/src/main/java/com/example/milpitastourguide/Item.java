package com.example.milpitastourguide;

/**
 * {@link Item} represents a vocabulary word that the user wants to learn.
 * It contains an Image, description and address for that item.
 */
public class Item {

    /** Facility name (Header) */
    private String mInstitutionName;

    /** Facility address */
    private String mFacilityAddress;

    /** Image resource ID for the item */
    private int mImageResourceId;

    /** Phone number for the item */
    private String mInstitutionPhone;

    /** Web address of the item */
    private String mOpenOnWeb;

    /**
     * Create a new Item object.
     *
     * @param institutionName  is the name of the institution
     * @param facilityAddress   is the address of the institution
     * @param imageResourceId    is the images for each item
     * @param institutionPhone  is the phone number of the institution
     * @param openOnWeb    is the link to the web resource for each item
     */
    public Item(String institutionName, String facilityAddress, int imageResourceId, String institutionPhone, String openOnWeb) {
        mInstitutionName = institutionName;
        mFacilityAddress = facilityAddress;
        mImageResourceId = imageResourceId;
        mInstitutionPhone = institutionPhone;
        mOpenOnWeb = openOnWeb;
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

    /**
     * Get the phone number for each item.
     */
    public String getInstitutionPhone() {
        return mInstitutionPhone;
    }

    /**
     * Get the web address of each item.
     */
    public String getOpenOnWeb() {
        return mOpenOnWeb;
    }
}
