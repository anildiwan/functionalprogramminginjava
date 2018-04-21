package com.fpij.chpt4;

public class Asset {
    public enum AssetType {BOND, STOCK};
    public final AssetType assetType;
    public final int assetValue;

    Asset(AssetType assetType, int assetValue) {
        this.assetType = assetType;
        this.assetValue = assetValue;
    }

    public AssetType getAssetType() {
        return assetType;
    }

    public int getAssetValue() {
        return assetValue;
    }
}
